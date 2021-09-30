package by.epam.pretask.service;

import by.epam.pretask.entity.CustomNumber;

public interface CalculationService {
    public CustomNumber add(CustomNumber number1, CustomNumber number2);
    public CustomNumber subtract(CustomNumber number1, CustomNumber number2);
    public CustomNumber divide(CustomNumber number1, CustomNumber number2);
    public CustomNumber multiply(CustomNumber number1, CustomNumber number2);
}
