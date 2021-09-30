package by.epam.pretask.reader.impl;

import by.epam.pretask.exception.CustomException;
import by.epam.pretask.reader.InfoReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class InfoReaderImpl implements InfoReader {

    static Logger logger = LogManager.getLogger();
    public static final String REGEX_DELIMITER = "\\s+";

    public String readLine(String fileName) throws CustomException {
        String line = "";
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
                line = scanner.nextLine();
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "File was not found", e);
            throw new CustomException();
        }
        line = line.trim();
        return line;
    }
}

