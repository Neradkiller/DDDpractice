package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.IntegerMother;

public final class ApplicationDateMother {
    public static ApplicationDate create(String value) { return new ApplicationDate(value); }

    public static ApplicationDate random() {
        return create(
            String.format(
                "%s %s",
                IntegerMother.random(),
                "/",
                IntegerMother.random(),
                "/",
                IntegerMother.random()
            )
        );
    }
}
