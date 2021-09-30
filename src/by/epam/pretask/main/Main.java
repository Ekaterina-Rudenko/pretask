package by.epam.pretask.main;

import by.epam.pretask.creator.NumberCreator;
import by.epam.pretask.creator.impl.NumberCreatorImpl;
import by.epam.pretask.entity.CustomNumber;
import by.epam.pretask.exception.CustomException;
import by.epam.pretask.parser.StringToDouble;
import by.epam.pretask.parser.impl.StringToDoubleImpl;
import by.epam.pretask.reader.InfoReader;
import by.epam.pretask.reader.impl.InfoReaderImpl;
import by.epam.pretask.service.CalculationService;
import by.epam.pretask.service.impl.CalculationServiceImpl;
import by.epam.pretask.validator.StringFilter;
import by.epam.pretask.validator.impl.StringFilterImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        InfoReader infoReader = new InfoReaderImpl();
        StringFilter stringFilter = new StringFilterImpl();
        StringToDouble parser = new StringToDoubleImpl();
        NumberCreator numberCreator = new NumberCreatorImpl();
        CalculationService calculation = new CalculationServiceImpl();
        String fileName = "data\\info.txt";

        String input = infoReader.readLine(fileName);
        String[] validInput = stringFilter.lineFilter(input);
        Double[] doubleArray = parser.parseArrayToDouble(validInput);
        CustomNumber number1 = numberCreator.createNumber(doubleArray[0]);
        logger.info("The number1" + number1.toString());
        CustomNumber number2 = numberCreator.createNumber(doubleArray[1]);
        logger.info("The number2" + number2.toString());
        calculation.add(number1, number2);
        calculation.multiply(number1, number2);
        calculation.subtract(number1, number2);
        calculation.divide(number1, number2);
    }
}
