package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.domain.JobOfferSchedule;
import tv.codely.hiring.joboffer.domain.JobOfferStatus;
import tv.codely.shared.domain.DateMother;
import tv.codely.shared.domain.ListMother;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class JobOfferScheduleMother {
    public static JobOfferSchedule create(Date value) { return new JobOfferSchedule(value); }

    public static  JobOfferSchedule random() { return create(DateMother.random()); }

    public static List<JobOfferSchedule> randomList() { return ListMother.random(JobOfferSchedule::new); }
}
