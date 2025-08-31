import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AlgorithmicTasks {
    public static void main(String[] args) {

    }

    // 15.
    // Given a string, find the length of the smallest substring that
    // contains all the unique characters from the original string.
    // Input: "aabcbcdbca" Output: 4
    // Explanation: The smallest substring containing all unique characters is "dbca"
    public static int getTheNumberOfUniqueSubstring(String text) {
        Map<Character, Integer> CharactersWithNumber = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {


        }
    }

    // 16.
    // Given a string, return the first non-repeating character.
    // Input: "aabbcdeff"
    // Output: "c"
    public static char getTheFirstCharacter(String text) {
        Map<Character, Integer> numbers = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {

        }

    }

    // 17.
    // Given a list of words, group them into lists of anagrams.
    // Input: ["act", "cat", "dog", "god", "tac"]
    // Output: [[act, cat, tac], [dog, god]]

    public static List<List<String>> getAnagramGroups(List<String> words) {
        Map<String, List<String>> groupedWords = new HashMap<>();
     for(String)
    }

    // 18.
    // Find the most frequent word in a list of strings.
    // Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
    // Output: "apple"

    public static String getTheMostFrequentWord(String[] words) {
        Map<String, Integer> frequencies = new HashMap<>();

    }

    // 19.
    // Return the list of duplicated elements in an array.
    // Input: [1, 2, 3, 2, 4, 1, 5]
    // Output: [1, 2]

    public static
}
