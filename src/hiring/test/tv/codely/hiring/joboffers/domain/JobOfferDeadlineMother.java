package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferDeadline;
import tv.codely.shared.domain.DateMother;

import java.util.Date;

public final class JobOfferDeadlineMother {
    public static JobOfferDeadline create(Date value) { return new JobOfferDeadline(value); }

    public static JobOfferDeadline random() { return create(DateMother.random()); }
}
