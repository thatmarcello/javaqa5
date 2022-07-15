package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 200, 300",
//            "1, 100, 101"
//    })
    @CsvFileSource(files = "src/test/resources/paramsForTests.csv")
    public void shouldCalcInnerRangeSqrs(int expected, int min, int max) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.calcSqrt(min, max);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldCalcBorders(){
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int actual = service.calcSqrt(100, 101);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
