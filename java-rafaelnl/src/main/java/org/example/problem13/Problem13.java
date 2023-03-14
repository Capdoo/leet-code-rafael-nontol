package org.example.problem13;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {

    private int romanNumber(String s){

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] src = s.toCharArray();
        int sum = 0;
        int aux;
        for(int i = 0; i<src.length; i++){
            //first
            if (src[i] == 'I' && i+1 < src.length){
                if(src[i+1] == 'V' || src[i+1] == 'X'){
                    aux = map.get(src[i+1])-map.get(src[i]);
                    sum += aux;
                    i++;
                }else{
                    sum += map.get(src[i]);
                }
            }
            //second
            else if (src[i] == 'X' && i+1 < src.length){
                if(src[i+1] == 'L' || src[i+1] == 'C'){
                    aux = map.get(src[i+1])-map.get(src[i]);
                    sum += aux;
                    i++;
                }else{
                    sum += map.get(src[i]);
                }
            }
            //Third
            else if (src[i] == 'C' && i+1 < src.length){
                if(src[i+1] == 'D' || src[i+1] == 'M'){
                    aux = map.get(src[i+1])-map.get(src[i]);
                    sum += aux;
                    i++;
                }else{
                    sum += map.get(src[i]);
                }

            }else{
                sum += map.get(src[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem13 problem13 = new Problem13();
        int res = problem13.romanNumber("XXXIV");
        System.out.println(res);
    }


}
