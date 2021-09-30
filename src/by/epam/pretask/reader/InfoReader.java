package by.epam.pretask.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class InfoReader {

    static Logger logger = LogManager.getLogger();
    public static final String REGEX_DELIMITER = "\\s+";

    public String[] readLineFromFile(String fileName) {
        String line = "";
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
                line = scanner.nextLine();
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File was not found", e);
        }
        line = line.trim();
        String[] stringOfTokens = line.split(REGEX_DELIMITER);
        return stringOfTokens;
    }
}

