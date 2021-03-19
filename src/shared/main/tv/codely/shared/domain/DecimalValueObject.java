package tv.codely.shared.domain;

import java.util.Objects;

public abstract class DecimalValueObject {
    private float value;

    public DecimalValueObject(float value){ this.value = value; }

    public float value() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecimalValueObject that = (DecimalValueObject) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
