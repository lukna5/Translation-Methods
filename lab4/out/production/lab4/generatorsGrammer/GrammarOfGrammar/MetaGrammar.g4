grammar MetaGrammar;

@header {
package generatorsGrammer.GrammarOfGrammar;
import generatorsGrammer.grammar.*;
import java.util.*;
}

metaGrammar returns [Grammar grammar]
    @init {
        ArrayList<NonTerminal> nonTerminals = new ArrayList<>();
        ArrayList<Terminal> terminals = new ArrayList<>();
        HashMap<String, ArrayList<ArrayList<Product>>> rules = new HashMap<>();
    }
    : nameGrammar sNonTerminal grammarRules[nonTerminals, terminals, rules]* EOF {
        $grammar = $nameGrammar.grammar;
        $grammar.setTerminals(terminals);
        $grammar.setNonTerminals(nonTerminals);
        $grammar.setRules(rules);
        $grammar.setS($sNonTerminal.s);
    }
    ;

nameGrammar returns[Grammar grammar]
    : GRAMMAR WORD_START_WITH_CAPITALIZED SEMICOLON {
        $grammar = new Grammar($WORD_START_WITH_CAPITALIZED.text);
    };

sNonTerminal returns[String s]
    : COLON WORD_START_WITH_SMALL SEMICOLON {
        $s = $WORD_START_WITH_SMALL.text;
    };

grammarRules[ArrayList<NonTerminal> nonTerminals, ArrayList<Terminal> terminals,
                HashMap<String, ArrayList<ArrayList<Product>>> rules]
    @init {
        String text = "";
        ArrayList<ArrayList<Product>> listOfLists = new ArrayList<>();
    }
    : WORD_START_WITH_SMALL inheritedAttributes synthesizedAttributes ARROW
     {
         NonTerminal nonTerminal = new NonTerminal($WORD_START_WITH_SMALL.text, $inheritedAttributes.attr,
          $synthesizedAttributes.attr);
         $nonTerminals.add(nonTerminal);
     }
     rightRule
     {
        listOfLists.add($rightRule.listOfProducts);
        $rules.put($WORD_START_WITH_SMALL.text, listOfLists);
     }
     (SEPARATOR rightRule {
        listOfLists.add($rightRule.listOfProducts);
     })* SEMICOLON

    | WORD_WITH_ALL_CAPITALIZED COLON REGEXP SEMICOLON {
        Terminal terminal = new Terminal($WORD_WITH_ALL_CAPITALIZED.text, $REGEXP.text);
        terminals.add(terminal);
    }

    ;

inheritedAttributes returns [String attr]
    : INHER_ATTR {
        $attr = $INHER_ATTR.text.substring(1, $INHER_ATTR.text.length() - 1);
    }
    | {
        $attr = "";
    }
    ;

synthesizedAttributes returns [String attr]
    : SYNT_ATTR {
        $attr = $SYNT_ATTR.text.substring(1, $SYNT_ATTR.text.length() - 1);
    }
    | {
        $attr = "";
    }
    ;

rightRule returns [ArrayList<Product> listOfProducts]
    @init {
        $listOfProducts = new ArrayList<>();
    }
    : (product {
        $listOfProducts.add($product.prod);
    })+
    | EPS CODE? {
        $listOfProducts.add(new Terminal("EPS", "eps"));
        $listOfProducts.add(new Code($CODE.text));
    }
    ;

product returns [Product prod]
    : WORD_START_WITH_SMALL inheritedAttributes {
        $prod = new NonTerminal($WORD_START_WITH_SMALL.text, $inheritedAttributes.attr, "");
    }
    | WORD_WITH_ALL_CAPITALIZED {
        $prod = new Terminal($WORD_WITH_ALL_CAPITALIZED.text, "");
    }
    | CODE {
        $prod = new Code($CODE.text);
    }

    ;

WS : [ \t\r\n]+ -> skip;

LEFT_COMP   : '<' ;
RIGHT_COMP  : '>' ;
COMMA                : ',' ;
SEMICOLON            : ';' ;
SEPARATOR : '|' ;
LEFT_BRACE           : '{' ;
RIGHT_BRACE          : '}' ;
LEFT_BRACKET  : '[' ;
RIGHT_BRACKET : ']' ;
RETURNS              : 'returns' ;
GRAMMAR              : 'grammar' ;
EPS                  : 'eps' ;
ARROW                : '->' ;
COLON                : ':' ;

CODE : LEFT_BRACE .*? RIGHT_BRACE ;
INHER_ATTR: LEFT_COMP .*? RIGHT_COMP ;
SYNT_ATTR: LEFT_BRACKET .*? RIGHT_BRACKET ;

WORD_WITH_ALL_CAPITALIZED   : [A-Z]+ ;
WORD_START_WITH_CAPITALIZED : [A-Z]+[a-zA-Z]* ;
WORD_START_WITH_SMALL       : [a-z]+[a-zA-Z]* ;
REGEXP                      : '"' .*? '"' ;