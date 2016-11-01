
public class MainStartClass {
    public static void main(String[] args) {
        String inLine = "text for test";
        Character searchingChar = 't';

        System.out.println(CharInString.testOfCount(CharInString.countLetters(inLine, searchingChar), 4));
        System.out.println(CharInString.testOfCount(CharInString.countLetters(inLine, searchingChar), 5));
    }
}
