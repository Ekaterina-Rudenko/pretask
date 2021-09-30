package by.epam.pretask.creator.impl;

import by.epam.pretask.creator.NumberCreator;
import by.epam.pretask.entity.CustomNumber;

public class NumberCreatorImpl implements NumberCreator {
    public CustomNumber createNumber(double number) {
        return new CustomNumber(number);
    }
}
