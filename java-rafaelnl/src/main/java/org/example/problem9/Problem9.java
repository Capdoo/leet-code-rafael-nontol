package org.example.problem9;

public class Problem9 {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int len = getSizeNumber(x);
        int[] num = getNumberArray(x,len);

        int p = len - 1;
        boolean res = true;
        for(int i=0; i<len; i++){
            if(num[i] != num[p]){
                res = false;
            }
            p--;
        }
        return res;
    }


    public static void main(String[] args) {
        Problem9 problem9 = new Problem9();
        boolean res = problem9.isPalindrome(19091);
        System.out.println(res);
    }

    public int getSizeNumber(int number){
        int k = 0;
        int tar = number;
        while(tar != 0){
            tar = tar/10;
            k++;
        }
        return k;
    }

    public int[] getNumberArray(int number, int len){
        int[] num = new int[len];
        int i = 0;
        int coc = number;
        while(i < len){
            num[i] = coc%10;
            coc = coc/10;
            i++;
        }
        return num;
    }
}
