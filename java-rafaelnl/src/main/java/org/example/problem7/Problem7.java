package org.example.problem7;

import org.example.problem2.Problem2;

public class Problem7 {

    private int reverse(int x){
        int isNegative = 1;
        if(x<0){
            x = x*-1;
            isNegative = -1;
        }
        if(x==0){
            return 0;
        }

        //Get # digits
        int q = x;
        int j = 0;
        while(q > 0){
            q = q/10;
            j++;
        }

        int coc = x;
        long num = 0;
        int last_digit;
        while(coc > 0){
            last_digit = coc%10;
            //Get exponent
            int m = 0;
            long smt = 1;
            while(m < j-1){
                smt = smt*10;
                m++;
            }
            num = num + last_digit*smt;

            if(num > Integer.MAX_VALUE || num*isNegative < Integer.MIN_VALUE){
                return 0;
            }

            coc = coc/10;
            smt = smt*10;
            j--;
        }
        return ((int) num)*isNegative;

    }

    public static void main(String[] args) {
        Problem7 problem7 = new Problem7();
        int res = problem7.reverse(1222234);
        System.out.println(res);
    }

}
