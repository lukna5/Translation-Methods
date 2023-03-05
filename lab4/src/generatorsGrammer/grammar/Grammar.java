package generatorsGrammer.grammar;

import java.util.*;

public class Grammar {
    private List<NonTerminal> nonTerminals;
    private List<Terminal> terminals;

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public String getS() {
        return s;
    }

    private String s;

    public void setS(String s) {
        this.s = s;
    }

    public String nameGrammar;

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }



    public void setRules(Map<String, ArrayList<ArrayList<Product>>> rules) {
        this.rules = rules;
    }

    /*
        2 + 2
        Token -> Token(NUM, "2") Token(PLUS, "+")
        A -> cBf
        A -> 232Kfsfs
        rules = List.of(Entry("A", cBf), Entry("A", cBf))
         */
    private Map<String, ArrayList<ArrayList<Product>>> rules;

    public void setNonTerminals(List<NonTerminal> nonTerminals) {
        this.nonTerminals = nonTerminals;
    }

    public Grammar(String nameGrammar) {
        this.nameGrammar = nameGrammar;
    }

    private final HashMap<String, Set<String>> first = new HashMap<>();

    public HashMap<String, Set<String>> getFirstFromRule() {
        return first;
    }

    public List<NonTerminal> getNonTerminals() {
        return nonTerminals;
    }



    public HashMap<String, Set<String>> getFirst() {
        return first;
    }

    public Map<String, ArrayList<ArrayList<Product>>> getRules() {
        return rules;
    }

    public HashMap<String, Set<String>> getFollow() {
        return follow;
    }

    private final HashMap<String, Set<String>> follow = new HashMap<>();

    public void constructFirst(){
        for (NonTerminal nonTerminal: nonTerminals){
            first.put(nonTerminal.name(), new HashSet<>());
        }
        boolean changed = true;
        while (changed){
            changed = false;
            for (String nonTerminal: rules.keySet()){
                for (ArrayList<Product> rule : rules.get(nonTerminal)) {
                    int previousSize = first.get(nonTerminal).size();
                    first.get(nonTerminal).addAll(getFirstFromRule(rule));
                    if (previousSize != first.get(nonTerminal).size()) {
                        changed = true;
                    }
                }
            }
        }
    }

    public Set<String> getFirstFromRule(ArrayList<Product> rule) {
        return getFirstFrom(rule, 0);
    }
    private Set<String> getFirstFrom(ArrayList<Product> rule, int from) {
        if (rule == null || rule.size() == 0) {
            return new HashSet<>(Set.of("eps"));
        }
        HashSet<String> res = new HashSet<>();
        for (int i = from; i < rule.size(); i++) {
            Product product = rule.get(i);
            if (product.getType() == Product.TypeProduct.TERMINAL) {
                Terminal terminal = (Terminal) product;
                res.add(terminal.name());
                return res;
            } else if (product.getType() == Product.TypeProduct.NONTERMINAL) {
                NonTerminal nonTerminal = (NonTerminal) product;
                Set<String> set = first.get(nonTerminal.name());
                if (set != null) {
                    res.addAll(set);
                    if (set.contains("eps")) {
                        continue;
                    }
                }
            }
            break;
        }
        return res;
    }

    public void constructFollow(){
        for (NonTerminal nonTerminal: nonTerminals){
            follow.put(nonTerminal.name(), new HashSet<>());
        }
        follow.get(s).add("$");
        boolean changed = true;
        while (changed){
            changed = false;
            for (String nonTerminalLeft: rules.keySet()) { // for all A B C
                for (ArrayList<Product> rule : rules.get(nonTerminalLeft)) { // for all A -> (123)! B -> (234)!
                    for (int i = 0; i < rule.size(); i++) { //for all 1 2 3 in A -> 123
                        Product product = rule.get(i);
                        if (product.getType() == Product.TypeProduct.NONTERMINAL){
                            NonTerminal nonTermProduct = (NonTerminal) product;
                            // if nextProduct == 1 for all 2 3 in 123
                            String nonTermName = nonTermProduct.name();
                            int previousSize = follow.get(nonTermName).size();
                            if (rule.size() >= i + 1){

                                break;
                            }
                            Set<String> firstRight = getFirstFrom(rule, i + 1);
                            if (firstRight.contains("eps") || firstRight.isEmpty()){
                                follow.get(nonTermName).addAll(follow.get(nonTerminalLeft));
                            }
                            firstRight.remove("eps");
                            follow.get(nonTermName).addAll(firstRight);
                            if (previousSize != follow.get(nonTermName).size()) {
                                changed = true;
                            }
                        }
                    }
                }
            }
        }
    }
}

