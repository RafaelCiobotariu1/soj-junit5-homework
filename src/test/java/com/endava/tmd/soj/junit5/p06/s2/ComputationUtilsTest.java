package com.endava.tmd.soj.junit5.p06.s2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;


import static com.endava.tmd.soj.junit5.p06.s2.ComputationUtils.sum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

// Provocare: Rescrieti testul care verifica valoarea sumei a doua numere din tema precedenta
// folosind un fisier (Comma-Separated Value) care sa stocheze datele necesare pentru test
// Fisierul se va numi "sumCheckArguments.csv" si va fi creat in folderul src/test/resources
// Se va utiliza adnotarea @CsvFileSource.
// 
// Testul care verifica exceptiile generate se va copia din tema precedenta
class ComputationUtilsTest {
//    @ParameterizedTest(name = "{0} + ({1}) = {2}")
//    @CsvFileSource(resources =  "/sumCheckArguments.csv")
//    void sumParameterized(int a,int b, int result) {
//        assertThat(sum(a,b)).isEqualTo(result);
//    }
//
//    @ParameterizedTest(name = "{0} + ({1}) \u21D2 Overflow")
//    @CsvSource({"2147483647,10","2147483647,2147483647","-2147483648,-19","-2147483648,-2147483648"})
//    void sumOfIntsLimitsParameterized(int a, int b){
//        assertThatThrownBy(() -> com.endava.tmd.soj.junit5.p06.s1.ComputationUtils.sum(a,b))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Overflow while computing the sum");
}
