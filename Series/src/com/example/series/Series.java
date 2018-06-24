package com.example.series;

public class Series  {


    public static long nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nSum(n-1);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return  n * factorial(n-1);

    }

//    public static int fibonacci(int n) {
//        if ( n == 0) {
//            return 0;
//        }
//
//        if (n == 1) {
//            return 1;
//        }
//
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

    public static long fibonacci(int n) {
        if ( n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long fNMinus1 = 1;
        long fNMinus2 = 0;
        long fib = 0;

        //f(n) = f(n-1) + f(n-2)
        // n = 2 f(2) = 1;
        //f(n+1) = f(n) + f(n-1)

        for (int i = 2; i <= n; i++) {
            fib = fNMinus1 + fNMinus2;
            fNMinus2 = fNMinus1;
            fNMinus1 = fib;
        }

        return fib;
    }

}
