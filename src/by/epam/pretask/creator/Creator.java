package by.epam.pretask.creator;

import by.epam.pretask.entity.CustomNumber;

public class Creator {
    public CustomNumber createNumber(String[] values, int i) {
        double number;
        number = Double.valueOf(values[i - 1]);
        System.out.println(number);
        return new CustomNumber(number);
    }
}
