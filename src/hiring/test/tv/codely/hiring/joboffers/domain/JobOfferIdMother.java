package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.jobs.domain.JobOfferId;
import tv.codely.shared.domain.UuidMother;

public final class JobOfferIdMother {
    public static tv.codely.hiring.joboffer.domain.JobOfferId create(String value) { return new JobOfferId(value); }

    public static tv.codely.hiring.joboffer.domain.JobOfferId random() { return create(UuidMother.random()); }
}
