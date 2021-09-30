package by.epam.pretask.reader;

import by.epam.pretask.exception.CustomException;
import by.epam.pretask.reader.impl.InfoReaderImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.io.FileNotFoundException;

public class InfoReaderImplTest {

    @Test(enabled = true)
    public void testInfoReader() throws CustomException {
        String fileName = "data\\test.txt";
        InfoReaderImpl infoReaderImpl = new InfoReaderImpl();
        String actual = infoReaderImpl.readLine(fileName);
        String expected = "skldjfh sdlg 456 -234";
        assertEquals(actual, expected);

    }

    @Test(enabled = true, expectedExceptions = CustomException.class)
    public void testInfoReaderException() throws CustomException {
        String fileName = "data\\noFile.txt";
        InfoReaderImpl infoReaderImpl = new InfoReaderImpl();
        infoReaderImpl.readLine(fileName);
    }

}