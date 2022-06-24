package com.endava.tmd.soj.junit5.p04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.endava.tmd.soj.junit5.p02.ComputationUtils.sum;
import static org.assertj.core.api.Assertions.assertThat;

// Provocare: Copiati metodele de test din tema de la p02, si adaugati ceea ce lipseste astfel incat
// sa fie testate si scenariile urmatoare. La ultima metoda, in cazul in care testul nu trece,
// adaugati adnotarea necesara astfel incat sa apara ca si "skipped"
@DisplayName("Tests for my sum method")
class ComputationUtilsTest {
    @Test
    @DisplayName("0 + 0 = 0")
    void zeroShouldNotChangeZero() {
        //JUnit Assertion
        Assertions.assertEquals(0, sum(0, 0));


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


}

