package generatorsGrammer.grammar;

public record NonTerminal(String name, String inherited, String synthesised) implements Product{

    @Override
    public TypeProduct getType() {
        return TypeProduct.NONTERMINAL;
    }
}
