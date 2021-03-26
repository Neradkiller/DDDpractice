package tv.codely.hiring.applications.application.create;

import tv.codely.hiring.applications.domain.*;
import tv.codely.shared.domain.bus.event.EventBus;

public class ApplicationCreator {
    private final ApplicationRepository repository;
    private final EventBus eventBus;

    public ApplicationCreator(ApplicationRepository repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus = eventBus;
    }

    public void create(ApplicationId id, ApplicationDate date, ApplicationEmployee employeeId, ApplicationJobOffer jobOfferId, ApplicationStatus status){
        Application application = Application.create(id,date,employeeId,jobOfferId,status);

        repository.save(application);
        eventBus.publish(application.pullDomainEvents());
    }
}
