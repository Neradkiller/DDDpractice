package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.UuidMother;

public final class ApplicationEmployeeMother {
    public static ApplicationEmployee create ( String value) { return new ApplicationEmployee(value); }

    public static ApplicationEmployee random(){ return create(UuidMother.random()); }
}
