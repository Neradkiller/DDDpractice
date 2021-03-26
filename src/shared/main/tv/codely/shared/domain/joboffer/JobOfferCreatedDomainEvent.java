package tv.codely.shared.domain.joboffer;

import tv.codely.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class JobOfferCreatedDomainEvent extends DomainEvent {
    private final String title;
    private final String employerId;
    private final String locationId;
    private final Date deadline;
    private final List<Date> schedules;
    private final List<String> skillsId;
    private final String specialRequirements;
    private final List<String> certificationsId;
    private final double duration;
    private final double hourlyRate;
    private final String employeeId;
    private final int status;

    public JobOfferCreatedDomainEvent(String aggregateId, String title, String employerId, String locationId, Date deadline, List<Date> schedules, List<String> skillsId, String specialRequirements, List<String> certificationsId, double duration, double hourlyRate, String employeeId, int status) {
        super(aggregateId);
        this.title = title;
        this.employerId = employerId;
        this.locationId = locationId;
        this.deadline = deadline;
        this.schedules = schedules;
        this.skillsId = skillsId;
        this.specialRequirements = specialRequirements;
        this.certificationsId = certificationsId;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
        this.employeeId = employeeId;
        this.status = status;
    }

    public JobOfferCreatedDomainEvent(String aggregateId, String eventId, String occurredOn, String title, String employerId, String locationId, Date deadline, List<Date> schedules, List<String> skillsId, String specialRequirements, List<String> certificationsId, double duration, double hourlyRate, String employeeId, int status) {
        super(aggregateId, eventId, occurredOn);
        this.title = title;
        this.employerId = employerId;
        this.locationId = locationId;
        this.deadline = deadline;
        this.schedules = schedules;
        this.skillsId = skillsId;
        this.specialRequirements = specialRequirements;
        this.certificationsId = certificationsId;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
        this.employeeId = employeeId;
        this.status = status;
    }

    public JobOfferCreatedDomainEvent(String title, String employerId, String locationId, Date deadline, List<Date> schedules, List<String> skillsId, String specialRequirements, List<String> certificationsId, double duration, double hourlyRate, String employeeId, int status) {
        this.title = title;
        this.employerId = employerId;
        this.locationId = locationId;
        this.deadline = deadline;
        this.schedules = schedules;
        this.skillsId = skillsId;
        this.specialRequirements = specialRequirements;
        this.certificationsId = certificationsId;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
        this.employeeId = employeeId;
        this.status = status;
    }

    @Override
    public String eventName() { return "joboffer.created"; }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>(){{
            put("title", title);
            put("employerId", employerId);
            put("locationId",locationId);
            put("deadline",deadline);
            //put("schedules",schedules);
            //put("skillsId",skillsId);
            put("specialRequirements", specialRequirements);
            //put("certifications",certificationsId);
            put("duration", duration);
            put("hourlyrate",hourlyRate);
            put("employee", employeeId);
            put("status",status);
        }};
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId,
                                      HashMap<String, Serializable> body,
                                      String eventId,
                                      String occurredOn) {
        return new JobOfferCreatedDomainEvent(
            aggregateId,
            eventId,
            occurredOn,
            (String) body.get("title"),
            (String) body.get("employerId"),
            (String) body.get("locationId"),
            (Date) body.get("deadline"),
            null,
            null,
            (String) body.get("speciaRequirements"),
            null,
            (double) body.get("duration"),
            (double) body.get("hourlyrate"),
            (String) body.get("employee"),
            (int) body.get("status")
        );
    }

    public String getTitle() { return title; }

    public String getEmployerId() { return employerId; }

    public String getLocationId() { return locationId; }

    public Date getDeadline() { return deadline; }

    public List<Date> getSchedules() { return schedules; }

    public List<String> getSkillsId() { return skillsId; }

    public String getSpecialRequirements() { return specialRequirements; }

    public List<String> getCertificationsId() { return certificationsId; }

    public double getDuration() { return duration; }

    public double getHourlyRate() { return hourlyRate; }

    public String getEmployeeId() { return employeeId; }

    public int getStatus() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobOfferCreatedDomainEvent)) return false;
        JobOfferCreatedDomainEvent that = (JobOfferCreatedDomainEvent) o;
        return Double.compare(that.duration, duration) == 0 && Double.compare(that.hourlyRate, hourlyRate) == 0 && status == that.status && Objects.equals(title, that.title) && Objects.equals(employerId, that.employerId) && Objects.equals(locationId, that.locationId) && Objects.equals(deadline, that.deadline) && Objects.equals(schedules, that.schedules) && Objects.equals(skillsId, that.skillsId) && Objects.equals(specialRequirements, that.specialRequirements) && Objects.equals(certificationsId, that.certificationsId) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, employerId, locationId, deadline, schedules, skillsId, specialRequirements, certificationsId, duration, hourlyRate, employeeId, status);
    }
}
