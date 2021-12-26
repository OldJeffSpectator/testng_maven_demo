package myMathUtil;

import myExceptions.MyException;

public class AdvancedMath {

    public static int fib(int n){
        if (n == 1 || n == 2)return 1;
        if (n == 3)return 2;
        int n_2 = 1;
        int n_1 = 1;
        int n_0 = 2;
        while (n > 3){
            n_2 = n_1;
            n_1 = n_0;
            n_0 = n_2 + n_1;
            n--;
        }
        return n_0;
    }

    public static int fibTimeOut(int n){
        if (n == 1 || n == 2)return 1;
        if (n == 3)return 2;
        return fibTimeOut(n-1) + fibTimeOut(n-2);
    }

    public static int pow(int n, int p) throws MyException {
        if (p < 0){throw new MyException();}
        if (p == 1)return n;
        if (p == 0)return 1;
        if (n == 0)return 0;
        int rt = 1;
        int nn = n;
        while (p > 0){
            if ((p & 0x01) == 1) {
                rt *= nn;
            }
            p = p >> 1;
            nn *= nn;
        }
        return rt;
    }

}
