package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferTitle;
import tv.codely.shared.domain.WordMother;

public final class JobOfferTitleMother {
    public static JobOfferTitle create(String value) { return new JobOfferTitle(value); }

    public static JobOfferTitle random() { return create(WordMother.random()); }
}
