package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferHourlyRate;
import tv.codely.shared.domain.DecimalMother;

public final class JobOfferHourlyRateMother {
    public static JobOfferHourlyRate create(double value) { return new JobOfferHourlyRate(value); }

    public static JobOfferHourlyRate random() { return create(DecimalMother.random()); }
}
