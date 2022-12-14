package onboarding;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Problem3Test {

    @Test
    void case1() {
        int number = 13;
        int result = 4;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }

    @Test
    void case2() {
        int number = 33;
        int result = 14;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }
}
