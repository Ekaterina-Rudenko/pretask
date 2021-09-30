package by.epam.pretask.parser.impl;

import by.epam.pretask.exception.CustomException;
import by.epam.pretask.parser.StringToDouble;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringToDoubleImpl implements StringToDouble {
    static Logger logger = LogManager.getLogger();
    @Override
    public Double[] parseArrayToDouble(String[] validStringArray) throws CustomException {
        Double[] doubleArray = new Double[validStringArray.length];
        if (validStringArray.length < 2){
            logger.error("Not enough elements");
            throw new CustomException("Not enough elements");
        }
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Double.parseDouble(validStringArray[i]);
        }
        return doubleArray;
    }
}
