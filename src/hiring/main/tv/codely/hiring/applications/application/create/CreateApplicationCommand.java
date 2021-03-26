package tv.codely.hiring.applications.application.create;

import tv.codely.shared.domain.bus.command.Command;

public class CreateApplicationCommand implements Command {
    private final String id;
    private final String date;
    private final String employeeId;
    private final String JobOfferId;
    private final int status;

    public CreateApplicationCommand(String id, String date, String employeeId, String jobOfferId, int status) {
        this.id = id;
        this.date = date;
        this.employeeId = employeeId;
        this.JobOfferId = jobOfferId;
        this.status = status;
    }

    public String getId() { return id; }

    public String getDate() { return date; }

    public String getEmployeeId() { return employeeId; }

    public String getJobOfferId() { return JobOfferId; }

    public int getStatus() { return status; }
}
