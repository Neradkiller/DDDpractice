package tv.codely.hiring.jobs.domain;

import tv.codely.shared.domain.AggregateRoot;

import java.util.ArrayList;
import java.util.Objects;

public class Job extends AggregateRoot {

    private final JobId id;
    private final JobEmployerId employerId;
    private final ArrayList<JobEmployeeId> employeeIds;
    private final JobOfferId jobOfferId;
    private final JobStatus status;

    public Job(JobId id, JobEmployerId employerId, ArrayList<JobEmployeeId> employeeIds, JobOfferId jobOfferId, JobStatus status) {
        this.id = id;
        this.employerId = employerId;
        this.employeeIds = employeeIds;
        this.jobOfferId = jobOfferId;
        this.status = status;
    }

    public Job() {
        this.id = null;
        this.employerId = null;
        this.employeeIds = null;
        this.jobOfferId = null;
        this.status = null;
    }

    public JobId getId() { return id; }

    public JobEmployerId getEmployerId() { return employerId; }

    public ArrayList<JobEmployeeId> getEmployeeIds() { return employeeIds; }

    public JobOfferId getJobOfferId() { return jobOfferId; }

    public JobStatus getStatus() { return status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return Objects.equals(id, job.id) &&
               Objects.equals(employerId, job.employerId) &&
               Objects.equals(employeeIds, job.employeeIds) &&
               Objects.equals(jobOfferId, job.jobOfferId) &&
               Objects.equals(status, job.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employerId, employeeIds, jobOfferId, status);
    }
}
