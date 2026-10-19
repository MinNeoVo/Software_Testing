package com.neo.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
        // Doi ham tinh theo de quy - Recursion
        if (n < 0 || n > 20) {
        throw new IllegalArgumentException("n must be between 0 and 20");
    }
        if (n == 0 || n == 1) {
            return 1; // Điểm dừng đệ quy, ko lùi nữa, lùi đến 1 là tính dc
        }

        // Tính dc n! = (n-1)! x n
        return n * getFactorial(n - 1);

//       long result = 1;
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n");
//        }
//
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
    }
}
// Code chính, Code base, Code dân dev phải làm