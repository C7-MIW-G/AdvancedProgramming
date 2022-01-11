package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Process the words from a file into a set.
 */
public class WordSet {
    Set<String> wordset;

    public WordSet() {
        wordset = new HashSet<>();
    }

    public void readFromFile(String fileName) {
        try(Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNext()) {
                String word = fileReader.next().replaceAll("[^A-Za-z0-9-]", "").toLowerCase();
                if (word.length() > 0) { // if, after processing the word, nothing remains, then do not add it
                    wordset.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNrOfUniqueWords() {
        return wordset.size();
    }

    public Iterable<String> getWordsSorted() {
        List<String> wordlist = new ArrayList<>(wordset);
        Collections.sort(wordlist);
        return wordlist;
    }
}
