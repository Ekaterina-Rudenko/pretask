package by.epam.pretask.entity;

import java.util.Objects;

public class CustomNumber {
    private double number;

    public CustomNumber() {
    }
    public CustomNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " = " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomNumber number1 = (CustomNumber) o;
        return Double.compare(number1.number, number) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
