package onboarding;

public class Problem2 {

    private static final int START_POINT = 1;
    private static final int END_POINT = 1_000;

    private static final String IS_LOWER_THAN_START_POINT = "입력된 문자의 길이가 1보다 작습니다.";
    private static final String IS_BIGGER_THAN_END_POINT = "입력된 문자의 길이가 1,000보다 큽니다.";
    private static final String IS_NOT_LOWER_ALPHA = "입력된 문자열이 알파벳 소문자로만 이루어져있지 않습니다..";


    public static String solution(String cryptogram) {
        String answer = "answer";

        if (!validate(cryptogram)) {
            return "제한사항을 확인해주세요!";
        }




        return answer;
    }

    private static boolean validate(String target) {
        try {
            isLowerThanStartPoint(target);
            isBiggerThanEndPoint(target);
            isLowerAlpha(target);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    private static void isLowerThanStartPoint(String target) {
        if (target.length() < START_POINT) {
            throw new IllegalArgumentException(IS_LOWER_THAN_START_POINT);
        }
    }

    private static void isBiggerThanEndPoint(String target) {
        if (target.length() > END_POINT) {
            throw new IllegalArgumentException(IS_BIGGER_THAN_END_POINT);
        }
    }

    private static void isLowerAlpha(String target) {
        String lowerAlphaRegex = "^[a-z]*$";
        if (!target.matches(lowerAlphaRegex)) {
            throw new IllegalArgumentException(IS_NOT_LOWER_ALPHA);
        }
    }
}
