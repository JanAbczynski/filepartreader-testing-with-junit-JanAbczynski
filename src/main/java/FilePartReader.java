
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilePartReader {





    static String filePath = "csv/file.csv";
    private Scanner fileContext;


    public void setup (String filePath, Integer fromLine, Integer toLine){

        if (toLine < fromLine && fromLine < 1){
            throw new IllegalArgumentException("IllegalArgumentException for: " + filePath);
        }
    }

    String read(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));

        }


    public ArrayList<String> readLine(String filePath, Integer fromLine, Integer toLine) throws IOException {
        String context = read(filePath);
        // z stringa zrobic

        ArrayList<String> linesFromFile = (ArrayList<String>) Stream.of(context.split("\n")).collect(Collectors.toList());

        setup(filePath, 1, 9);

        return linesFromFile;

        }


}
