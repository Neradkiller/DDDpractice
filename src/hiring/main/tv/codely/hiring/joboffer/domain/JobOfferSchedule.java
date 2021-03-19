package tv.codely.hiring.joboffer.domain;

import tv.codely.shared.domain.DateValueObject;

import java.util.Date;

public class JobOfferSchedule extends DateValueObject {

    public JobOfferSchedule(Date value) { super(value); }

    public JobOfferSchedule() { super(new Date()); }
}
