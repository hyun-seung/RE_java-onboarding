package onboarding;

import java.util.Arrays;

public class Problem3 {

    private static final int FIRST_NUMBER = 1;
    private static final int LAST_NUMBER = 10_000;

    public static int solution(int number) {
        int answer = 0;

        if (!validate(number)) {
            return -1;
        }

        answer = getAnswer(number);

        return answer;
    }

    private static int getAnswer(int number) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += count(i);
        }

        return result;
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

    private static int count(int number) {
        int result = 0;

        while (number > 0) {
            if (RIGHTS.isInClass(number % 10)) {
                result += 1;
            }
            number /= 10;
        }

        return result;
    }

    private enum RIGHTS {
        THREE(3),
        SIX(6),
        NINE(9);

        private final Integer rightNumber;

        RIGHTS(int rightNumber) {
            this.rightNumber = rightNumber;
        }

        public static boolean isInClass(int number) {
            RIGHTS rights = Arrays.stream(values())
                    .filter(value -> value.rightNumber.equals(number))
                    .findAny()
                    .orElse(null);

            if (rights == null) {
                return false;
            }
            return true;
        }
    }
}
