package by.epam.pretask.parser;

import by.epam.pretask.exception.CustomException;

public interface StringToDouble {
    public Double[] parseArrayToDouble(String[] validStringArray) throws CustomException;
}
