import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FilePartAnalyzeTest {

//    @BeforeEach
//    void setup() throws IOException {
//        FilePartAnalizer filePartAnalizer = new FilePartAnalizer();
//    }


    @Test
    void getWordsOrderedAlphabetically() throws IOException {
        FilePartAnalizer filePartAnalizer = new FilePartAnalizer();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("abca");
        expected.add("akt");
        expected.add("art");
        expected.add("asdasd");
        expected.add("ast");
        expected.add("cac");
        expected.add("cba");
        expected.add("dreerd");
        expected.add("kok");
        expected.add("lok");
        expected.add("strast");
        expected.add("trap");
        Assert.assertEquals(expected,filePartAnalizer.getWordsOrderedAlphabetically(1,5));
    }


    @Test
    void getWordsContainingSubstring() throws IOException {
        FilePartAnalizer filePartAnalizer = new FilePartAnalizer();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("kok");
        expected.add("lok");
        Assert.assertEquals(expected,filePartAnalizer.getWordsContainingSubstring("ok", 1, 20));
    }
// todo write logic to this test
//    @Test
//    void getStringsWhichPalindromes() throws IOException {
//        FilePartAnalizer filePartAnalizer = new FilePartAnalizer();
//        ArrayList<String> expected = new ArrayList<>();
//        expected.add("");
//        expected.add("");
//        Assert.assertEquals(expected,filePartAnalizer.getStringsWhichPalindromes(1, 20));
//
//    }
}