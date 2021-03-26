package tv.codely.shared.domain.application;

import tv.codely.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public class ApplicationCreatedDomainEvent extends DomainEvent {
    private final String date;
    private final String employeeId;
    private final String jobOfferId;
    private final int status;

    public ApplicationCreatedDomainEvent() {
        super(null);
        this.date = null;
        this.employeeId = null;
        this.jobOfferId = null;
        this.status = Integer.parseInt(null);
    }

    public ApplicationCreatedDomainEvent(String aggregateId, String eventId, String occurredOn, String date, String employeeId, String jobOfferId, int status) {
        super(aggregateId, eventId, occurredOn);
        this.date = date;
        this.employeeId = employeeId;
        this.jobOfferId = jobOfferId;
        this.status = status;
    }

    public ApplicationCreatedDomainEvent(String aggregateId, String date, String employeeId, String jobOfferId, int status) {
        super(aggregateId);
        this.date = date;
        this.employeeId = employeeId;
        this.jobOfferId = jobOfferId;
        this.status = status;
    }

    @Override
    public String eventName() { return "application.created"; }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("date", date);
            put("employeeId", employeeId);
            put("jobOfferId", jobOfferId);
            put("status", status);
        }};
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId,
                                      HashMap<String, Serializable> body,
                                      String eventId,
                                      String occurredOn) {
        return new ApplicationCreatedDomainEvent(
            aggregateId,
            eventId,
            occurredOn,
            (String) body.get("date"),
            (String) body.get("employeeId"),
            (String) body.get("jobOfferId"),
            (int) body.get("status")
        );
    }

    public String getDate() { return date; }

    public String getEmployeeId() { return employeeId; }

    public String getJobOfferId() { return jobOfferId; }

    public int getStatus() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationCreatedDomainEvent)) return false;
        ApplicationCreatedDomainEvent that = (ApplicationCreatedDomainEvent) o;
        return status == that.status && Objects.equals(date, that.date) && Objects.equals(employeeId, that.employeeId) && Objects.equals(jobOfferId, that.jobOfferId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, employeeId, jobOfferId, status);
    }
}
