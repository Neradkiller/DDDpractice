package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferStatus;
import tv.codely.shared.domain.IntegerMother;

public final class JobOfferStatusMother {
    public static JobOfferStatus create( int value ) { return new JobOfferStatus(value); }

    public static JobOfferStatus random() { return create(IntegerMother.random()); }
}
