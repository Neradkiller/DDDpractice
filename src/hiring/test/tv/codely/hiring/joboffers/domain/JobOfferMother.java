package tv.codely.hiring.joboffers.domain;

import tv.codely.hiring.joboffer.application.create.CreateJobOfferCommand;
import tv.codely.hiring.joboffer.domain.*;

import java.util.ArrayList;
import java.util.List;

public class JobOfferMother {
    public static JobOffer create(JobOfferId id, JobOfferTitle title, JobOfferEmployer employerId, JobOfferLocation locationId, JobOfferDeadline deadline, List<JobOfferSchedule> schedulesId, List<JobOfferSkill> skillsId, JobOfferSpecialRequirements specialRequirements, List<JobOfferCertification> certificationsId, JobOfferDuration duration, JobOfferHourlyRate hourlyRate, JobOfferEmployee employeeId, JobOfferStatus status){
        return new JobOffer(id,title, employerId,locationId,deadline,schedulesId,skillsId,specialRequirements,certificationsId,duration,hourlyRate,employeeId,status);
    }

    public static JobOffer fromRequest(CreateJobOfferCommand request){
        return create(
            JobOfferIdMother.create(request.getId()),
            JobOfferTitleMother.create(request.getTitle()),
            JobOfferEmployerMother.create(request.getEmployerId()),
            JobOfferLocationMother.create(request.getLocationId()),
            JobOfferDeadlineMother.create(request.getDeadline()),
            null,//JobOfferScheduleMother.create(request.getSchedulesId()),
            null,//JobOfferSkillMother.create(request.getSkillsId()),
            JobOfferSpecialRequirementMother.create(request.getSpecialRequirements()),
            null,//JobOfferCerticationMother.create(request.getCertificationsId()),
            JobOfferDurationMother.create(request.getDuration()),
            JobOfferHourlyRateMother.create(request.getHourlyRate()),
            JobOfferEmployeeMother.create(request.getEmployeeId()),
            JobOfferStatusMother.create(request.getStatus())
        );
    }

    public static JobOffer random(){
        return create(
            JobOfferIdMother.random(),
            JobOfferTitleMother.random(),
            JobOfferEmployerMother.random(),
            JobOfferLocationMother.random(),
            JobOfferDeadlineMother.random(),
            JobOfferScheduleMother.randomList(),
            JobOfferSkillMother.randomList(),
            JobOfferSpecialRequirementMother.random(),
            JobOfferCerticationMother.randomList(),
            JobOfferDurationMother.random(),
            JobOfferHourlyRateMother.random(),
            JobOfferEmployeeMother.random(),
            JobOfferStatusMother.random()
        );
    }
}
