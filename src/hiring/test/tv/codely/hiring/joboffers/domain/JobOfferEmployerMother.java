package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferEmployer;
import tv.codely.shared.domain.UuidMother;

public final class JobOfferEmployerMother {
    public static JobOfferEmployer create(String value) { return new JobOfferEmployer(value); }

    public static JobOfferEmployer random() { return create(UuidMother.random()); }
}
