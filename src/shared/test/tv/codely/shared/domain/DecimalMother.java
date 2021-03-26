package tv.codely.shared.domain;

public final class DecimalMother {
    public static double random() { return MotherCreator.random().number().randomDouble(5,0,10000); }
}
