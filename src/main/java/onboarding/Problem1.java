package onboarding;

import java.util.List;

public class Problem1 {

    private static final int FIRST_PAGE = 1;
    private static final int LAST_PAGE = 400;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;

    private static final String IS_NOT_TWO_PAGES = "입력받은 배열의 길이가 2가 아닙니다.";
    private static final String IS_LOWER_THAN_FIRST_PAGE = "페이지가 1보다 작습니다.";
    private static final String IS_BIGGER_THAN_LAST_PAGE = "페이지가 400보다 큽니다.";
    private static final String LEFT_PAGE_IS_NOT_ODD = "왼쪽 페이지가 홀수가 아닙니다.";
    private static final String RIGHT_PAGE_IS_NOT_EVEN = "오른쪽 페이지가 짝수가 아닙니다.";
    private static final String IS_NOT_RIGHT_BOOK_PAGES = "올바른 책의 페이지가 아닙니다.";

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    private boolean validate(List<Integer> pages) {
        try {
            isTwoPages(pages);
            isLowerThanFirstPage(pages);
            isBiggerThanLastPage(pages);
            isLeftPageOdd(pages.get(LEFT));
            isRightPageEven(pages.get(RIGHT));
            isRightBookPages(pages);
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    private void isTwoPages(List<Integer> pages) {
        if (pages.size() != 2) {
            throw new IllegalArgumentException(IS_NOT_TWO_PAGES);
        }
    }

    private void isLowerThanFirstPage(List<Integer> pages) {
        for (Integer page : pages) {
            if (page < FIRST_PAGE) {
                throw new IllegalArgumentException(IS_LOWER_THAN_FIRST_PAGE);
            }
        }
    }

    private void isBiggerThanLastPage(List<Integer> pages) {
        for (Integer page : pages) {
            if (page > LAST_PAGE) {
                throw new IllegalArgumentException(IS_BIGGER_THAN_LAST_PAGE);
            }
        }
    }

    private void isLeftPageOdd(Integer page) {
        if (page % 2 != 1) {
            throw new IllegalArgumentException(LEFT_PAGE_IS_NOT_ODD);
        }
    }

    private void isRightPageEven(Integer page) {
        if (page % 2 != 0) {
            throw new IllegalArgumentException(RIGHT_PAGE_IS_NOT_EVEN);
        }
    }

    private void isRightBookPages(List<Integer> pages) {
        if (pages.get(LEFT) + 1 != pages.get(RIGHT)) {
            throw new IllegalArgumentException(IS_NOT_RIGHT_BOOK_PAGES);
        }
    }
}
