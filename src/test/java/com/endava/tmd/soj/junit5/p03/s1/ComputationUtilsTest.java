package com.endava.tmd.soj.junit5.p03.s1;

import org.junit.jupiter.api.*;

import static com.endava.tmd.soj.junit5.p02.ComputationUtils.sum;
import static org.assertj.core.api.Assertions.assertThat;

// Provocare: Copiati metodele de test din tema anterioara, si adaugati adnotarile necesare astfel incat
// sa fie rulate testele in ordine alfabetica. Modificati numele metodelor de test astfel incat metodele
// sa fie executate in ordinea in care sunt scrise
@DisplayName("Tests for my sum method")
@TestMethodOrder(MethodOrderer.MethodName.class)
class ComputationUtilsTest {
    @Test
    @DisplayName("0 + 0 = 0")
    void testAzeroShouldNotChangeZero() {
        //JUnit Assertion
        Assertions.assertEquals(0, sum(0, 0));


        // AssertJ Assertion
        assertThat(sum(0, 0)).isZero();

        //failed
        //Assertions.assertEquals(0,sum(5,4));

    }

    @Test
    @DisplayName("0 + 2 = 2")
    void testBzeroShouldNotChangePositive() {
        assertThat(sum(0,2)).isEqualTo(2);
    }
    @Test
    @DisplayName("0 + (-5) = -5")
    void testCzeroShouldNotChangeNegative() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-12, 0)).isEqualTo(-12);
    }

    @Test
    @DisplayName("2 + 3 = 5")
    void testDtwoPositiveNumbersShouldHaveAbsoluteValuesAddedAndPositiveResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("(-5) + (-11) = -16")
    void testEtwoNegativeNumbersShouldHaveAbsoluteValuesAddedAndNegativeResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-5,-11)).isEqualTo(-16);
    }

    @Test
    @DisplayName("(-5) + 11 = 6")
    void testFoneSmallNegativeAndOneBigPositiveNumberShouldHaveAbsoluteValuesSubtractedAndPositiveResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-5,11)).isEqualTo(6);
    }

    @Test
    @DisplayName("(-111) + 31 = -80")
    void testGoneBigNegativeAndOneSmallPositiveNumberShouldHaveAbsoluteValuesSubtractedAndNegativeResult() {
        assertThat(com.endava.tmd.soj.junit5.p01.ComputationUtils.sum(-111,31)).isEqualTo(-80);
    }

}
