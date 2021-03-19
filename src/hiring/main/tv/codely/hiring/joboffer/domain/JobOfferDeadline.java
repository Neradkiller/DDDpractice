package tv.codely.hiring.joboffer.domain;

import tv.codely.shared.domain.DateValueObject;

import java.util.Date;


public class JobOfferDeadline extends DateValueObject {

    public JobOfferDeadline(Date value) { super(value); }

    public JobOfferDeadline() {
        super(new Date());
    }
}
