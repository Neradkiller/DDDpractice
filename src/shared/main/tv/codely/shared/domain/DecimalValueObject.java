package tv.codely.shared.domain;

import java.util.Objects;

public abstract class DecimalValueObject {
    private double value;

    public DecimalValueObject(double value){ this.value = value; }

    public double value() { return value; }

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
