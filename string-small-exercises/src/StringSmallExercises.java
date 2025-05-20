public class StringSmallExercises {
    public static void main(String[] args) {
    }

    public static int calculateTheOccurrenceOfB(String inputText) {
        int sum = 0;
        char letter = 'B';
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == letter) {
                sum++;
            }
        }
        return sum;
    }

    public static int countOccurrenceOfHello(String text) {
        int counter = 0;
        String searchedWord = "hello";
        for (int i = 0; i <= text.length() - searchedWord.length(); i++) {
            if (text.substring(i, i + searchedWord.length()).equals(searchedWord)) {
                counter++;
            }
        }
        return counter;
    }
}
