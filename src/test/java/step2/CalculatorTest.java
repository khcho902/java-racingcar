package step2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest(name = "[덧셈 테스트] {0} = {1}")
    @CsvSource(value = {"1 + 2=3", "0 + 2=2", "1 + 0=1", "-1 + 2=1", "-2 + 1=-1"}, delimiter = '=')
    void plusTest(String input, long expected) {
        //when
        long actual = Calculator.calculate(input);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "[뺄셈 테스트] {0} = {1}")
    @CsvSource(value = {"1 - 2=-1", "0 - 2=-2", "1 - 0=1", "-1 - 2=-3", "-2 - 1=-3"}, delimiter = '=')
    void minusTest(String input, long expected) {
        //when
        long actual = Calculator.calculate(input);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "[곱셈 테스트] {0} = {1}")
    @CsvSource(value = {"1 * 2=2", "0 * 2=0", "1 * 0=0", "-1 * 2=-2", "-2 * 1=-2"}, delimiter = '=')
    void multiplyTest(String input, long expected) {
        //when
        long actual = Calculator.calculate(input);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "[나눗셈 테스트] {0} = {1}")
    @CsvSource(value = {"0 / 2=0", "2 / 2=1", "1 / 1=1", "4 / 2=2", "-4 / 2=-2"}, delimiter = '=')
    void divideTest(String input, long expected) {
        //when
        long actual = Calculator.calculate(input);

        //then
        assertEquals(expected, actual);
    }
}