package by.epam.pretask.entity;

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

    public String toString() {
        return " = " + number;
    }
}
