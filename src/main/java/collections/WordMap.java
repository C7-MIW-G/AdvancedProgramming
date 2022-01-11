package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Process the words from a file into a map of words and its number of occurences
 */
public class WordMap {
    Map<String, Integer> wordmap;

    public WordMap() {
        wordmap = new HashMap<>();
    }

    public void readFromFile(String fileName) {
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNext()) {
                String word = fileReader.next().replaceAll("[^A-Za-z0-9-]", "").toLowerCase();
                if (word.length() > 0) { // if, after processing the word, nothing remains, then do not add it
                    // as an alternative to what was shown during the lesson, you can also get a default value
                    wordmap.put(word, wordmap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNrOfUniqueWords() {
        return wordmap.size();
    }

    public Iterable<String> getWordsSorted() {
        List<String> words = new ArrayList<>(wordmap.keySet());
        Collections.sort(words);
        return words;
    }

    public int getWordCount(String word) {
        // A word that does not appear in the text appears 0 times, not null times
        return wordmap.getOrDefault(word, 0);
    }
}
