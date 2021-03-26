package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferSpecialRequirements;
import tv.codely.shared.domain.WordMother;

public final class JobOfferSpecialRequirementMother {
    public static JobOfferSpecialRequirements create(String value) { return new JobOfferSpecialRequirements(value); }

    public static JobOfferSpecialRequirements random() { return create(WordMother.random()); }
}
