package by.epam.pretask.service.impl;

import by.epam.pretask.creator.NumberCreator;
import by.epam.pretask.creator.impl.NumberCreatorImpl;
import by.epam.pretask.entity.CustomNumber;
import by.epam.pretask.service.CalculationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculationServiceImpl implements CalculationService {
    static Logger logger = LogManager.getLogger();
    NumberCreator numberCreator = new NumberCreatorImpl();

    public CustomNumber add(CustomNumber number1, CustomNumber number2) {
        double sum;
        sum = number1.getNumber() + number2.getNumber();
        CustomNumber result = numberCreator.createNumber(sum);
        logger.info("The sum of numbers is " + result);
        return result;
    }
    public CustomNumber subtract(CustomNumber number1, CustomNumber number2) {
        double difference;
        difference = number1.getNumber() - number2.getNumber();
        CustomNumber result = numberCreator.createNumber(difference);
        logger.info("The difference of numbers is " + result);
        return result;
    }
    public CustomNumber divide(CustomNumber number1, CustomNumber number2) {
        double quotient;
        quotient = number1.getNumber() / number2.getNumber();
        CustomNumber result = numberCreator.createNumber(quotient);
        logger.info("The quotient of numbers is " + result);
        return result;
    }
    public CustomNumber multiply(CustomNumber number1, CustomNumber number2) {
        double product;
        product = number1.getNumber() * number2.getNumber();
        CustomNumber result = numberCreator.createNumber(product);
        logger.info("The product of 2 numbers is " + result);
        return result;
    }
}
