package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferEmployee;
import tv.codely.shared.domain.UuidMother;

public final class JobOfferEmployeeMother {
    public static JobOfferEmployee create(String value) { return new JobOfferEmployee(value); }

    public static JobOfferEmployee random() { return create(UuidMother.random()); }
}
