package generatorsGrammer.grammar;

public record Code(String code) implements Product {
    @Override
    public TypeProduct getType() {
        return TypeProduct.CODE;
    }
}
