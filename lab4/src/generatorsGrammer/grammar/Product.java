package generatorsGrammer.grammar;


public interface Product {
    enum TypeProduct{
        TERMINAL, NONTERMINAL, CODE, UNSET
    }
    TypeProduct getType();
}
