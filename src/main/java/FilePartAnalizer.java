import java.io.IOException;
import java.util.ArrayList;

public class FilePartAnalizer {
    private FilePartReader filePartReader = new FilePartReader();
    ArrayList < String > list_of_words =  filePartReader.readLine(filePath, 1, 7);
    private static String filePath = "csv/file.csv";

    public FilePartAnalizer() throws IOException {
    }

    public ArrayList <String> getWordsOrderedAlphabetically() throws IOException {
        //    calls FilePartReader.readLines ()
        //    returns the words ordered by alphabetically as an ArrayList
        return null;

    }
    public ArrayList <String> getWordsContainingSubstring (String subString){
        //    calls FilePartReader.readLines ()
        //    returns the words which contains the
        return null;

    }
    public ArrayList <String> getStringsWhichPalindromes (){
        //    calls FilePartReader.readLines ()
        //    returns the words from the String which are palindrome
        return null;
    }

}
