package com.neo.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //Chuẩn bị Datta test riêng ra 1 chỗ - DDT - Data Driven Testing
    public static Object[][] initTestData() {
        Object [][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;
    }
    // Nhồi data ở trên vào hàm ASSERT EQUAL
    @ParameterizedTest  // Sánh ngang vai với DDT
    @MethodSource("initTestData")
    public void testFactorialGivenValidNRunWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
    }