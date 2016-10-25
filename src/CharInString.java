
public class CharInString {

    public static int sumOfCharInString(String incomeString, Character searchingCharater) {
        char[] inStringToChar = incomeString.toCharArray();
        int result = 0;
        for (int i = 0; i < inStringToChar.length; i++) {
            if (inStringToChar[i] == searchingCharater) {
                result++;
            }
        }
        return result;
    }
}
