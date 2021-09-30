package by.epam.pretask.validator.impl;

import by.epam.pretask.validator.StringFilter;

public class StringFilterImpl implements StringFilter {

    public static final String REGEX_DOUBLE = "[+-]?\\d*\\.?\\d+";
    public static final String REGEX_DELIMITER = "\\s+";
    @Override
    public String[] lineFilter(String inputString) {
        String[] stringOfTokens = inputString.split(REGEX_DELIMITER);
        int counter = 0;
        for (String numberStr : stringOfTokens) {
            if (numberStr.matches(REGEX_DOUBLE)) {
                counter++;
            }
        }
        String[] validStr = new String[counter];
        int i = 0;
        for (String numberStr : stringOfTokens) {
            if (numberStr.matches(REGEX_DOUBLE)) {
                validStr[i++] = numberStr;
            }
        }
        return validStr;
    }

}