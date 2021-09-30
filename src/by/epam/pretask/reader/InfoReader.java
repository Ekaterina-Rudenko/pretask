package by.epam.pretask.reader;

import by.epam.pretask.exception.CustomException;
import by.epam.pretask.reader.impl.InfoReaderImpl;

public interface InfoReader {
    public String readLine(String fileName) throws CustomException;
}
