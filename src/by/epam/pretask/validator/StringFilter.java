package by.epam.pretask.validator;

public class StringFilter {

    public static final String REGEX_DOUBLE = "[+-]?\\d*[.]?\\d+";

    public static String[] filterOfDoubleTokens(String[] numbersArray) {
        int counter = 0;
        for (String numberStr : numbersArray) {
            if (numberStr.matches(REGEX_DOUBLE)) {
                counter++;
            }
        }
        String[] validStr = new String[counter];
        int i = 0;
        for (String numberStr : numbersArray) {
            if (numberStr.matches(REGEX_DOUBLE)) {
                validStr[i++] = numberStr;
            }
        }
        return validStr;
    }

}