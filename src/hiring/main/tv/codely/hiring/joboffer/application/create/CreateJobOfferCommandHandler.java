package tv.codely.hiring.joboffer.application.create;

import tv.codely.hiring.joboffer.domain.*;
import tv.codely.shared.domain.bus.command.CommandHandler;

import java.util.ArrayList;

public class CreateJobOfferCommandHandler implements CommandHandler<CreateJobOfferCommand> {
    private final JobOfferCreator creator;

    public CreateJobOfferCommandHandler(JobOfferCreator creator) { this.creator = creator; }

    @Override
    public void handle(CreateJobOfferCommand command) {
        JobOfferId id = new JobOfferId(command.getId());
        JobOfferTitle title = new JobOfferTitle(command.getTitle());
        JobOfferEmployer employerId = new JobOfferEmployer(command.getEmployerId());
        JobOfferLocation locationId = new JobOfferLocation(command.getLocationId());
        JobOfferDeadline deadline = new JobOfferDeadline(command.getDeadline());
        //Preguntar por las listas
        ArrayList<JobOfferSchedule> schedulesId = new ArrayList<JobOfferSchedule>();
        ArrayList<JobOfferSkill> skillsId = new ArrayList<JobOfferSkill>();
        JobOfferSpecialRequirements specialRequirements = new JobOfferSpecialRequirements(command.getSpecialRequirements());
        ArrayList<JobOfferCertification> certificationsId = new ArrayList<>();
        JobOfferDuration duration = new JobOfferDuration(command.getDuration());
        JobOfferHourlyRate hourlyRate = new JobOfferHourlyRate(command.getHourlyRate());
        JobOfferEmployee employeeId = new JobOfferEmployee(command.getEmployeeId());
        JobOfferStatus status = new JobOfferStatus(command.getStatus());

        creator.create(id,title,employerId,locationId,deadline,schedulesId,skillsId,specialRequirements,certificationsId,duration,hourlyRate,employeeId,status);
    }
}
