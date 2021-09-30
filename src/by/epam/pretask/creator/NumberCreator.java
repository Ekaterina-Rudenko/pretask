package by.epam.pretask.creator;

import by.epam.pretask.entity.CustomNumber;
import by.epam.pretask.exception.CustomException;

public interface NumberCreator {
    public CustomNumber createNumber (double number);
}
