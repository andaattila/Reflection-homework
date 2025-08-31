package task1;

public class Exchanger {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = letterExchanger(input);

        System.out.println(output);
    }

    public static String letterExchanger(String text) {
        String lettersToChange = "aeiouAEIOU";
        String modifiedText = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (lettersToChange.indexOf(c) != -1) {
                modifiedText += '*';
            } else {
                modifiedText += c;
            }
        }

        return modifiedText;
    }

}
