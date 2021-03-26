package tv.codely.hiring.joboffer.application.create;

import tv.codely.hiring.joboffer.domain.*;
import tv.codely.shared.domain.bus.event.EventBus;

import java.util.ArrayList;

public class JobOfferCreator {
    private final JobOfferRepository repository;
    private final EventBus eventBus;

    public JobOfferCreator(JobOfferRepository repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus = eventBus;
    }

    public void create(JobOfferId id,
                       JobOfferTitle title,
                       JobOfferEmployer employerId,
                       JobOfferLocation locationId,
                       JobOfferDeadline deadline,
                       ArrayList<JobOfferSchedule> schedulesId,
                       ArrayList<JobOfferSkill> skillsId,
                       JobOfferSpecialRequirements specialRequirements,
                       ArrayList<JobOfferCertification> certificationsId,
                       JobOfferDuration duration,
                       JobOfferHourlyRate hourlyRate,
                       JobOfferEmployee employeeId,
                       JobOfferStatus status){
        JobOffer jobOffer = JobOffer.create(id,
                                            title,
                                            employerId,
                                            locationId,
                                            deadline,
                                            schedulesId,
                                            skillsId,
                                            specialRequirements,
                                            certificationsId,
                                            duration,
                                            hourlyRate,
                                            employeeId,
                                            status);
        repository.save(jobOffer);
        eventBus.publish(jobOffer.pullDomainEvents());
    }
}
