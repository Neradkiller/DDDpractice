package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferLocation;
import tv.codely.shared.domain.UuidMother;

public final class JobOfferLocationMother {
    public static JobOfferLocation create(String value) { return new JobOfferLocation(value); }

    public static JobOfferLocation random() { return create(UuidMother.random()); }
}
