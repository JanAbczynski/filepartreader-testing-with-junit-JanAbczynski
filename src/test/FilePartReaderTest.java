import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    private static FilePartReader filePartReader;

    @BeforeAll
    static void setup() {
        filePartReader = new FilePartReader();
    }


    @Test
    void readLineTest() throws IOException {
        filePartReader.readLine("./csv/file.csv", 1,3);
    }
}