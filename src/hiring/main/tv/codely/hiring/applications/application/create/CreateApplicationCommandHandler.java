package tv.codely.hiring.applications.application.create;

import tv.codely.hiring.applications.domain.*;
import tv.codely.shared.domain.bus.command.CommandHandler;

public class CreateApplicationCommandHandler implements CommandHandler<CreateApplicationCommand> {
    private final ApplicationCreator creator;

    public CreateApplicationCommandHandler(ApplicationCreator creator) {
        this.creator = creator;
    }

    @Override
    public void handle(CreateApplicationCommand command) {
        ApplicationId id = new ApplicationId(command.getId());
        ApplicationDate date = new ApplicationDate(command.getDate());
        ApplicationEmployee employeeId = new ApplicationEmployee(command.getEmployeeId());
        ApplicationJobOffer jobOfferId = new ApplicationJobOffer(command.getJobOfferId());
        ApplicationStatus status = new ApplicationStatus(command.getStatus());

        creator.create(id, date,employeeId,jobOfferId,status);
    }
}
