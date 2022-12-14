package onboarding;

public class Problem3 {

    private static final int FIRST_NUMBER = 1;
    private static final int LAST_NUMBER = 10_000;

    public static int solution(int number) {
        int answer = 0;

        if (!validate(number)) {
            return -1;
        }

        return answer;
    }

    private static boolean validate(int number) {
        try {
            isNaturalNumber(number);
            isBiggerThanFirstNumber(number);
            isLowerThanLastNumber(number);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    private static void isNaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
    }

    private static void isBiggerThanFirstNumber(int number) {
        if (number < FIRST_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    private static void isLowerThanLastNumber(int number) {
        if (number > LAST_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
