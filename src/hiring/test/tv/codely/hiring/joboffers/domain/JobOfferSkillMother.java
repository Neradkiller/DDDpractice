package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferSkill;
import tv.codely.shared.domain.ListMother;
import tv.codely.shared.domain.UuidMother;

import java.util.List;

public final class JobOfferSkillMother {
    public static JobOfferSkill create(String value) { return new JobOfferSkill(value); }

    public static JobOfferSkill random() { return create(UuidMother.random()); }

    public static List<JobOfferSkill> randomList() { return ListMother.random(JobOfferSkill::new); }
}
