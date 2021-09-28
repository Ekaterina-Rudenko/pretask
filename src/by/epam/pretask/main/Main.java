package by.epam.pretask.main;

import by.epam.pretask.creator.Creator;
import by.epam.pretask.entity.CustomNumber;
import by.epam.pretask.reader.InfoReader;
import by.epam.pretask.service.Service;
import by.epam.pretask.validator.StringFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws FileNotFoundException {
        InfoReader infoReader = new InfoReader();
        String fileName = "data\\info.txt";
        String[] input = infoReader.readLineFromFile(fileName);
        String[] validInput = StringFilter.filterOfDoubleTokens(input);
        Creator creator = new Creator();
        CustomNumber number1 = creator.createNumber(validInput, 1);
        logger.info("The number1" + number1.toString());
        CustomNumber number2 = creator.createNumber(validInput, 2);
        logger.info("The number2" + number2.toString());
        Service.add(number1, number2);
        Service.multiply(number1, number2);
        Service.subtract(number1, number2);
        Service.divide(number1, number2);
    }
}
