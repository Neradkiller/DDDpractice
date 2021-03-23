package tv.codely.hiring.joboffer.domain;

import tv.codely.shared.domain.AggregateRoot;

import java.util.ArrayList;
import java.util.Objects;

public class JobOffer extends AggregateRoot {
    private final JobOfferId id;
    private final JobOfferTitle title;
    private final JobOfferEmployer employerId;
    private final JobOfferLocation locationId;
    private final JobOfferDeadline deadline;
    private final ArrayList<JobOfferSchedule> schedulesId;
    private final ArrayList<JobOfferSkill> skillsId;
    private final JobOfferSpecialRequirements specialRequirements;
    private final ArrayList<JobOfferCertification> certificationsId;
    private final JobOfferDuration duration;
    private final JobOfferHourlyRate hourlyRate;
    private final JobOfferEmployee employeeId;
    private final JobOfferStatus status;

    public JobOffer(JobOfferId id, JobOfferTitle title, JobOfferEmployer employerId, JobOfferLocation locationId, JobOfferDeadline deadline, ArrayList<JobOfferSchedule> schedulesId,ArrayList<JobOfferSkill> skillsId, JobOfferSpecialRequirements specialRequirements, ArrayList<JobOfferCertification> certificationsId, JobOfferDuration duration, JobOfferHourlyRate hourlyRate, JobOfferEmployee employeeId, JobOfferStatus status) {
        this.id = id;
        this.title = title;
        this.employerId = employerId;
        this.locationId = locationId;
        this.deadline = deadline;
        this.schedulesId = schedulesId;
        this.skillsId = skillsId;
        this.specialRequirements = specialRequirements;
        this.certificationsId = certificationsId;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
        this.employeeId = employeeId;
        this.status = status;
    }

    public JobOffer() {
        this.id = null;
        this.title = null;
        this.employerId = null;
        this.locationId = null;
        this.deadline = null;
        this.schedulesId = null;
        this.skillsId = null;
        this.specialRequirements = null;
        this.certificationsId = null;
        this.duration = null;
        this.hourlyRate = null;
        this.employeeId = null;
        this.status = null;
    }

    public static JobOffer create(JobOfferId id, JobOfferTitle title, JobOfferEmployer employer, JobOfferLocation location, JobOfferDeadline deadline, ArrayList<JobOfferSchedule> schedules,ArrayList<JobOfferSkill> skillsId, JobOfferSpecialRequirements specialRequirements, ArrayList<JobOfferCertification> certifications, JobOfferDuration duration, JobOfferHourlyRate hourlyRate, JobOfferEmployee employee, JobOfferStatus status){
        JobOffer jobOffer = new JobOffer(id,title,employer,location,deadline,schedules,skillsId, specialRequirements,certifications,duration,hourlyRate,employee,status);
        //Ignorare la creacion del evento por ahora
        jobOffer.record(null);

        return jobOffer;
    }

    public JobOfferId id() { return id; }

    public JobOfferTitle title() { return title; }

    public JobOfferEmployer employer() { return employerId; }

    public JobOfferLocation location() { return locationId; }

    public JobOfferDeadline deadline() { return deadline; }

    public ArrayList<JobOfferSchedule> schedules() { return schedulesId; }

    public JobOfferSpecialRequirements specialRequirements() { return specialRequirements; }

    public ArrayList<JobOfferCertification> certifications() { return certificationsId; }

    public JobOfferDuration duration() { return duration; }

    public JobOfferHourlyRate hourlyRate() { return hourlyRate; }

    public JobOfferEmployee employee() { return employeeId; }

    public JobOfferStatus status() { return status; }

    public ArrayList<JobOfferSkill> getSkillsId() { return skillsId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobOffer)) return false;
        JobOffer jobOffer = (JobOffer) o;
        return Objects.equals(id, jobOffer.id) && Objects.equals(title, jobOffer.title) && Objects.equals(employerId, jobOffer.employerId) && Objects.equals(locationId, jobOffer.locationId) && Objects.equals(deadline, jobOffer.deadline) && Objects.equals(schedulesId, jobOffer.schedulesId) && Objects.equals(skillsId, jobOffer.skillsId) && Objects.equals(specialRequirements, jobOffer.specialRequirements) && Objects.equals(certificationsId, jobOffer.certificationsId) && Objects.equals(duration, jobOffer.duration) && Objects.equals(hourlyRate, jobOffer.hourlyRate) && Objects.equals(employeeId, jobOffer.employeeId) && Objects.equals(status, jobOffer.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, employerId, locationId, deadline, schedulesId, skillsId, specialRequirements, certificationsId, duration, hourlyRate, employeeId, status);
    }
}
