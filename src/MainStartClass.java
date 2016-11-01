
public class MainStartClass {
    public static void main(String[] args) {
        String inLine = "text for test";
        Character searchingChar = 't';

        CharInString.testOfCount(CharInString.countLetters(inLine, searchingChar), 4);
        CharInString.testOfCount(CharInString.countLetters(inLine, searchingChar), 5);
    }
}
