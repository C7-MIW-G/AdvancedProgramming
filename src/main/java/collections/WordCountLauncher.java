package collections;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Use the code for counting/processing words in a file.
 */
public class WordCountLauncher {

    public static void main(String[] args) {
//        opdrachtA();
//        opdrachtB();
        opdrachtC();
    }

    public static void opdrachtA() {
        WordSet wordSet = new WordSet();
        wordSet.readFromFile("src/main/resources/MaxHavelaarH1.txt");
        System.out.println("Unique words: " + wordSet.getNrOfUniqueWords());
        for (String word : wordSet.getWordsSorted()) {
            System.out.println(word);
        }
    }

    public static void opdrachtB() {
        WordMap wordMap = new WordMap();
        wordMap.readFromFile("src/main/resources/MaxHavelaarH1.txt");
        System.out.println("Unique words: " + wordMap.getNrOfUniqueWords());
        for (String word : wordMap.getWordsSorted()) {
            System.out.printf("%-15s: %2d\n", word, wordMap.getWordCount(word));
        }
    }

    public static void opdrachtC() {
        LineMap lineMap = new LineMap();
        lineMap.readFromFile("src/main/resources/MaxHavelaarH1.txt");
        System.out.println("Unique words: " + lineMap.getNrOfUniqueWords());
        for (String word : lineMap.getWordsSorted()) {
            System.out.printf("%-15s: %s\n", word, lineMap.getWordLineNrs(word));
        }
    }
}
