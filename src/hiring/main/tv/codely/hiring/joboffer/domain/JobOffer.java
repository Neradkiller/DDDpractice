package tv.codely.hiring.joboffer.domain;

import tv.codely.shared.domain.AggregateRoot;

import java.util.ArrayList;
import java.util.Objects;

public class JobOffer extends AggregateRoot {
    private final JobOfferId id;
    private final JobOfferTitle title;
    private final JobOfferEmployer employer;
    private final JobOfferLocation location;
    private final JobOfferDeadline deadline;
    private final ArrayList<JobOfferSchedule> schedules;
    private final JobOfferSpecialRequirements specialRequirements;
    private final ArrayList<JobOfferCertification> certifications;
    private final JobOfferDuration duration;
    private final JobOfferHourlyRate hourlyRate;
    private final JobOfferEmployee employee;
    private final JobOfferStatus status;

    public JobOffer(JobOfferId id, JobOfferTitle title, JobOfferEmployer employer, JobOfferLocation location, JobOfferDeadline deadline, ArrayList<JobOfferSchedule> schedules, JobOfferSpecialRequirements specialRequirements, ArrayList<JobOfferCertification> certifications, JobOfferDuration duration, JobOfferHourlyRate hourlyRate, JobOfferEmployee employee, JobOfferStatus status) {
        this.id = id;
        this.title = title;
        this.employer = employer;
        this.location = location;
        this.deadline = deadline;
        this.schedules = schedules;
        this.specialRequirements = specialRequirements;
        this.certifications = certifications;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
        this.employee = employee;
        this.status = status;
    }

    public JobOffer() {
        this.id = null;
        this.title = null;
        this.employer = null;
        this.location = null;
        this.deadline = null;
        this.schedules = null;
        this.specialRequirements = null;
        this.certifications = null;
        this.duration = null;
        this.hourlyRate = null;
        this.employee = null;
        this.status = null;
    }

    public static JobOffer create(JobOfferId id, JobOfferTitle title, JobOfferEmployer employer, JobOfferLocation location, JobOfferDeadline deadline, ArrayList<JobOfferSchedule> schedules, JobOfferSpecialRequirements specialRequirements, ArrayList<JobOfferCertification> certifications, JobOfferDuration duration, JobOfferHourlyRate hourlyRate, JobOfferEmployee employee, JobOfferStatus status){
        JobOffer jobOffer = new JobOffer(id,title,employer,location,deadline,schedules,specialRequirements,certifications,duration,hourlyRate,employee,status);
        //Ignorare la creacion del evento por ahora
        jobOffer.record(null);

        return jobOffer;
    }

    public JobOfferId id() { return id; }

    public JobOfferTitle title() { return title; }

    public JobOfferEmployer employer() { return employer; }

    public JobOfferLocation location() { return location; }

    public JobOfferDeadline deadline() { return deadline; }

    public ArrayList<JobOfferSchedule> schedules() { return schedules; }

    public JobOfferSpecialRequirements specialRequirements() { return specialRequirements; }

    public ArrayList<JobOfferCertification> certifications() { return certifications; }

    public JobOfferDuration duration() { return duration; }

    public JobOfferHourlyRate hourlyRate() { return hourlyRate; }

    public JobOfferEmployee employee() { return employee; }

    public JobOfferStatus status() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobOffer)) return false;
        JobOffer jobOffer = (JobOffer) o;
        return Objects.equals(id, jobOffer.id) &&
               Objects.equals(title, jobOffer.title) &&
               Objects.equals(employer, jobOffer.employer) &&
               Objects.equals(location, jobOffer.location) &&
               Objects.equals(deadline, jobOffer.deadline) &&
               Objects.equals(schedules, jobOffer.schedules) &&
               Objects.equals(specialRequirements, jobOffer.specialRequirements) &&
               Objects.equals(certifications, jobOffer.certifications) &&
               Objects.equals(duration, jobOffer.duration) &&
               Objects.equals(hourlyRate, jobOffer.hourlyRate) &&
               Objects.equals(employee, jobOffer.employee) &&
               Objects.equals(status, jobOffer.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, employer, location, deadline, schedules, specialRequirements, certifications, duration, hourlyRate, employee, status);
    }
}
