package by.epam.pretask.parser.impl;

import by.epam.pretask.exception.CustomException;
import by.epam.pretask.parser.StringToDouble;

public class StringToDoubleImpl implements StringToDouble {
    @Override
    public Double[] parseArrayToDouble(String[] validStringArray) throws CustomException {
        Double[] doubleArray = new Double[validStringArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Double.parseDouble(validStringArray[i]);
        }
        return doubleArray;
    }
}
