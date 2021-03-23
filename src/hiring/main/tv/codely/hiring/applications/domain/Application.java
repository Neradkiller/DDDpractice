package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.AggregateRoot;

import java.util.Objects;

public class Application extends AggregateRoot {
    private final ApplicationId id;
    private final ApplicationDate date;
    private final ApplicationEmployee employeeId;
    private final ApplicationJobOffer jobOfferId;
    private final ApplicationStatus status;

    public Application(ApplicationId id, ApplicationDate date, ApplicationEmployee employeeId, ApplicationJobOffer jobOfferId, ApplicationStatus status) {
        this.id = id;
        this.date = date;
        this.employeeId = employeeId;
        this.jobOfferId = jobOfferId;
        this.status = status;
    }

    public Application() {
        this.id = null;
        this.date = null;
        this.employeeId = null;
        this.jobOfferId = null;
        this.status = null;
    }

    public static Application create(ApplicationId id, ApplicationDate date, ApplicationEmployee employee, ApplicationJobOffer jobOffer, ApplicationStatus status){
        Application application = new Application(id,date,employee,jobOffer,status);

        application.record(null);

        return application;
    }

    public ApplicationId id() { return id; }

    public ApplicationDate date() { return date; }

    public ApplicationEmployee employee() { return employeeId; }

    public ApplicationJobOffer jobOffer() { return jobOfferId; }

    public ApplicationStatus status() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Application)) return false;
        Application that = (Application) o;
        return Objects.equals(id, that.id) &&
               Objects.equals(date, that.date) &&
               Objects.equals(employeeId, that.employeeId) &&
               Objects.equals(jobOfferId, that.jobOfferId) &&
               Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, employeeId, jobOfferId, status);
    }
}
