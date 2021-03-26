package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferCertification;
import tv.codely.shared.domain.ListMother;
import tv.codely.shared.domain.UuidMother;

import java.util.List;

public final class JobOfferCerticationMother {
    public static JobOfferCertification create(String value) { return new JobOfferCertification(value); }

    public static JobOfferCertification random() { return create(UuidMother.random()); }

    public static List<JobOfferCertification> randomList() { return ListMother.random(JobOfferCertification::new); }
}
