package by.epam.pretask.service;

import by.epam.pretask.entity.CustomNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Service {
    static Logger logger = LogManager.getLogger();
    public static double add(CustomNumber number1, CustomNumber number2){
        double sum;
        sum = number1.getNumber()+ number2.getNumber();
        logger.info("The sum of numbers is " + sum);
        return sum;
    }
    public static double subtract(CustomNumber number1, CustomNumber number2){
        double difference;
        difference = number1.getNumber() - number2.getNumber();
        logger.info("The difference of numbers is " + difference);
        return difference;
    }
    public static double divide(CustomNumber number1, CustomNumber number2){
        double quotient;
        quotient = number1.getNumber() / number2.getNumber();
        logger.info("The quotient of numbers is " + quotient);
        return quotient;
    }
    public static double multiply(CustomNumber number1, CustomNumber number2){
        double product;
        product = number1.getNumber() * number2.getNumber();
        logger.info("The product of 2 numbers is " + product);
        return product;
    }
}
