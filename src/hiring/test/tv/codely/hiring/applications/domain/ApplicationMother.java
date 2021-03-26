package tv.codely.hiring.applications.domain;


import tv.codely.hiring.applications.application.create.CreateApplicationCommand;

public final class ApplicationMother {
    public static Application create(ApplicationId id,ApplicationDate date, ApplicationEmployee employeeId, ApplicationJobOffer jobOfferId, ApplicationStatus status){
        return new Application(id,date,employeeId,jobOfferId,status);
    }

    public static Application fromRequest(CreateApplicationCommand request){
        return create(
            ApplicationIdMother.create(request.getId()),
            ApplicationDateMother.create(request.getDate()),
            ApplicationEmployeeMother.create(request.getEmployeeId()),
            ApplicationJobOfferMother.create(request.getJobOfferId()),
            ApplicationStatusMother.create(request.getStatus())
        );
    }

    public static Application random(){
        return create(
            ApplicationIdMother.random(),
            ApplicationDateMother.random(),
            ApplicationEmployeeMother.random(),
            ApplicationJobOfferMother.random(),
            ApplicationStatusMother.random()
        );
    }

}
