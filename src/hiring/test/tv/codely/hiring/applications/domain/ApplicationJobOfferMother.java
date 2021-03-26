package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.UuidMother;

public final class ApplicationJobOfferMother {
    public static ApplicationJobOffer create(String value) { return new ApplicationJobOffer(value); }

    public static ApplicationJobOffer random() { return new ApplicationJobOffer(UuidMother.random()); }
}
