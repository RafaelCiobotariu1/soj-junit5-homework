package com.endava.tmd.soj.junit5.p05.s2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p05.s1.ComputationUtils.sum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Scopul acestei sectiuni este sa urmarim rescrierile de cod din partea de productie
// Deci pastram testele din sectiunea precedenta
class ComputationUtilsTest {
    @Test
    @DisplayName("0 + 0 = 0")
    void zeroShouldNotChangeZero() {
        //JUnit Assertion
        assertEquals(0, sum(0, 0));


        // AssertJ Assertion
        assertThat(sum(0, 0)).isZero();

        //failed
        //Assertions.assertEquals(0,sum(5,4));

    }

    @Test
    @DisplayName("0 + 2 = 2")
    void zeroShouldNotChangePositive() {
        assertThat(sum(0,2)).isEqualTo(2);
    }
    @Test
    @DisplayName("0 + (-5) = -5")
    void zeroShouldNotChangeNegative() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-12, 0)).isEqualTo(-12);
    }

    @Test
    @DisplayName("2 + 3 = 5")
    void twoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("(-5) + (-11) = -16")
    void twoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-5,-11)).isEqualTo(-16);
    }

    @Test
    @DisplayName("(-5) + 11 = 6")
    void oneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-5,11)).isEqualTo(6);
    }

    @Test
    @DisplayName("(-111) + 31 = -80")
    void oneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-111,31)).isEqualTo(-80);
    }
    @DisplayName("2147483647 + 1 \u21D2 Overflow")
    @Test
    void exceptionWhenSumIsGreaterThanIntegerMaxValue() {
        // JUnit way of checking the exception class
        assertThrows(ArithmeticException.class, () -> sum(2147483647, 1));

        // JUnit way of checking the exception class and its characteristics
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> sum(2147483647, 1));
        assertEquals("Overflow while computing the sum", exception.getMessage());

        // AssertJ
        assertThatThrownBy(() -> sum(2147483647, 1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Overflow while computing the sum");
    }

    @Test
    @DisplayName("-2147483648 + (-1) \u21D2 Overflow")
    void exceptionWhenSumIsLowerThanIntegerMinValue() {
        // JUnit way of checking the exception class
        assertThrows(ArithmeticException.class, () -> sum(-2147483648, -1));
        // JUnit way of checking the exception class and its characteristics
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> sum(-2147483648, -1));
        assertEquals("Overflow while computing the sum", exception.getMessage());

        // AssertJ
        assertThatThrownBy(() -> sum(-2147483648, -1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Overflow while computing the sum");
    }
}
