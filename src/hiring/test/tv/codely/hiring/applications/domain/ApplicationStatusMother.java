package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.IntegerMother;

public final class ApplicationStatusMother {
    public static ApplicationStatus create(int value) { return new ApplicationStatus(value); }

    public static ApplicationStatus random() { return new ApplicationStatus(IntegerMother.random()); }
}
