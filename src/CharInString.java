
public class CharInString {

    public static int countLetters(String incomeString, Character searchingCharacter) {
        if (incomeString == null || incomeString.equals("")) {
            throw new IllegalArgumentException("Усп!! что то пошло не так");
        }
        if (searchingCharacter == null) {
            throw new IllegalArgumentException("Усп!! что то пошло не так, но в другом смысле");
        }
        int result = 0;

        for (int i = 0; i < incomeString.length(); i++) {
            if (incomeString.charAt(i) == searchingCharacter) {
                result++;
            }
        }
        return result;
    }

    public static boolean testOfCount(int resultOfMethod, int rightAnswer){
        return resultOfMethod == rightAnswer;
    }
}