package tv.codely.hiring.joboffer.application.create;

import tv.codely.shared.domain.bus.command.Command;

import java.util.ArrayList;
import java.util.Date;

public class CreateJobOfferCommand implements Command {
    private final String id;
    private final String title;
    private final String employerId;
    private final String locationId;
    private final Date deadline;
    private final ArrayList<String> schedulesId;
    private final ArrayList<String> skillsId;
    private final String specialRequirements;
    private final ArrayList<String> certificationsId;
    private final double duration;
    private final double hourlyRate;
    private final String employeeId;
    private final int status;

    public CreateJobOfferCommand(String id, String title, String employerId, String locationId, Date deadline, ArrayList<String> schedulesId, ArrayList<String> skillsId, String specialRequirements, ArrayList<String> certificationsId, float duration, float hourlyRate, String employeeId, int status) {
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

    public String getId() { return id; }

    public String getTitle() { return title; }

    public String getEmployerId() { return employerId; }

    public String getLocationId() { return locationId; }

    public Date getDeadline() { return deadline; }

    public ArrayList<String> getSchedulesId() { return schedulesId; }

    public ArrayList<String> getSkillsId() { return skillsId; }

    public String getSpecialRequirements() { return specialRequirements; }

    public ArrayList<String> getCertificationsId() { return certificationsId; }

    public double getDuration() { return duration; }

    public double getHourlyRate() { return hourlyRate; }

    public String getEmployeeId() { return employeeId; }

    public int getStatus() { return status; }
}
