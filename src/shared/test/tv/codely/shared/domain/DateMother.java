package tv.codely.shared.domain;

import java.util.Date;

public final class DateMother {
    public static Date random() { return MotherCreator.random().date().birthday(); }
}
