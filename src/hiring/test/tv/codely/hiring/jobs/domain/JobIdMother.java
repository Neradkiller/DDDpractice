package tv.codely.hiring.jobs.domain;

import tv.codely.shared.domain.UuidMother;

public final class JobIdMother {
    public static JobId create(String value) { return new JobId(value); }

    public static JobId random() { return create(UuidMother.random()); }
}
