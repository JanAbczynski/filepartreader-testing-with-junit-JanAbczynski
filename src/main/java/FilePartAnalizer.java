import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FilePartAnalizer {
    private FilePartReader filePartReader = new FilePartReader();
    ArrayList < String > list_of_words =  filePartReader.readLine(filePath, 1, 7);
    private static String filePath = "csv/file.csv";


    public FilePartAnalizer() throws IOException {
    }

    public ArrayList <String> getWordsOrderedAlphabetically(int fromLine, int toLine) throws IOException {
        //    calls FilePartReader.readLines ()
        //    returns the words ordered by alphabetically as an ArrayList

        ArrayList< String > lines = filePartReader.readLine(filePath, fromLine, toLine);
        lines.sort(String.CASE_INSENSITIVE_ORDER);
        return lines;

    }
    public ArrayList <String> getWordsContainingSubstring (String subString, int fromLine, int toLine) throws IOException {
        //    calls FilePartReader.readLines ()
        //    returns the words which contains the subString

        ArrayList< String > lines = filePartReader.readLine(filePath, fromLine, toLine);
        ArrayList< String > arrayList = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(subString)) {
                arrayList.add(line);
            }
        }
        return arrayList;

    }
    public ArrayList <String> getStringsWhichPalindromes (int fromLine, int toLine) throws IOException {
        //    calls FilePartReader.readLines ()
        //    returns the words from the String which are palindrome
        ArrayList< String > polindromesList = new ArrayList<>();
        ArrayList< String > lines = filePartReader.readLine(filePath, fromLine, toLine);

        // sprawdzic polindropmy

        return polindromesList;
    }

}
