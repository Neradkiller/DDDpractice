package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.UuidMother;

public final class ApplicationIdMother {
    public static ApplicationId create(String value) { return new ApplicationId(value); }

    public static ApplicationId random() { return  create(UuidMother.random()); }
}
