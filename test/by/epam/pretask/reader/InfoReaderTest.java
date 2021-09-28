package by.epam.pretask.reader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class InfoReaderTest {

    @Test(enabled = true)
    public void testInfoReader() {
        String fileName = "data\\test.txt";
        InfoReader infoReader = new InfoReader();
        String[] actual = infoReader.readLineFromFile(fileName);
        String[] expected = {"skldjfh","sdlg","456","-234"};
    }

    @Test(enabled = false, expectedExceptions = FileNotFoundException.class)
    public void testInfoReaderException() {
        String fileName = "data\\noFile.txt";
        InfoReader infoReader = new InfoReader();
        infoReader.readLineFromFile(fileName);
    }

}