public class IdCardValidator {
    boolean isValid(String text) {
        return text.matches("[0-9]{6}[A-Z]{2}");
    }
}