package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.application.ApplicationCreatedDomainEvent;

public class ApplicationCreatedDomainEventMother {
    public static ApplicationCreatedDomainEvent create(ApplicationId id, ApplicationDate date, ApplicationEmployee employeeId, ApplicationJobOffer jobOfferId, ApplicationStatus status){
        return new ApplicationCreatedDomainEvent(id.value(), date.value(), employeeId.value(), jobOfferId.value(), status.value());
     }

     public static ApplicationCreatedDomainEvent fromApplication(Application application){
        return create(application.id(),
                      application.date(),
                      application.employee(),
                      application.jobOffer(),
                      application.status());
     }

     public static ApplicationCreatedDomainEvent random(){
        return create(ApplicationIdMother.random(),
                      ApplicationDateMother.random(),
                      ApplicationEmployeeMother.random(),
                      ApplicationJobOfferMother.random(),
                      ApplicationStatusMother.random());
     }
}
