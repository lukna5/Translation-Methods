package generatorsGrammer.grammar;

public record Terminal(String name, String text) implements Product{

    @Override
    public TypeProduct getType() {
        return TypeProduct.TERMINAL;
    }
}
