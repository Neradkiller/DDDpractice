package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferDuration;
import tv.codely.shared.domain.DecimalMother;

public final class JobOfferDurationMother {
    public static JobOfferDuration create(double value) { return new JobOfferDuration(value); }

    public static JobOfferDuration random() { return create(DecimalMother.random()); }
}
