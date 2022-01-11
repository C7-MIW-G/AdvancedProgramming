package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 *
 */
public class LineMap {
    Map<String, List<Integer>> linemap;

    public LineMap() {
        linemap = new HashMap<>();
    }

    public void readFromFile(String fileName) {
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            int lineNumber = 0;
            while (fileReader.hasNextLine()) {
                lineNumber++;
                String[] lineArray = fileReader.nextLine().split("\\s+");
                for (String word : lineArray) {
                    word = word.replaceAll("[^A-Za-z0-9-]", "").toLowerCase();
                    if (word.length() > 0) { // if, after processing the word, nothing remains, then do not add it
                        linemap.putIfAbsent(word, new ArrayList<>());
                        linemap.get(word).add(lineNumber);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNrOfUniqueWords() {
        return linemap.size();
    }

    public Iterable<String> getWordsSorted() {
        List<String> words = new ArrayList<>(linemap.keySet());
        Collections.sort(words);
        return words;
    }

    public List<Integer> getWordLineNrs(String word) {
        return linemap.get(word);
    }
}
