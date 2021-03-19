package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.AggregateRoot;

import java.util.Objects;

public class Application extends AggregateRoot {
    private final ApplicationId id;
    private final ApplicationDate date;
    private final ApplicationEmployee employee;
    private final ApplicationJobOffer jobOffer;
    private final ApplicationStatus status;

    public Application(ApplicationId id, ApplicationDate date, ApplicationEmployee employee, ApplicationJobOffer jobOffer, ApplicationStatus status) {
        this.id = id;
        this.date = date;
        this.employee = employee;
        this.jobOffer = jobOffer;
        this.status = status;
    }

    public Application() {
        this.id = null;
        this.date = null;
        this.employee = null;
        this.jobOffer = null;
        this.status = null;
    }

    public static Application create(ApplicationId id, ApplicationDate date, ApplicationEmployee employee, ApplicationJobOffer jobOffer, ApplicationStatus status){
        Application application = new Application(id,date,employee,jobOffer,status);

        application.record(null);

        return application;
    }

    public ApplicationId id() { return id; }

    public ApplicationDate date() { return date; }

    public ApplicationEmployee employee() { return employee; }

    public ApplicationJobOffer jobOffer() { return jobOffer; }

    public ApplicationStatus status() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Application)) return false;
        Application that = (Application) o;
        return Objects.equals(id, that.id) &&
               Objects.equals(date, that.date) &&
               Objects.equals(employee, that.employee) &&
               Objects.equals(jobOffer, that.jobOffer) &&
               Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, employee, jobOffer, status);
    }
}
