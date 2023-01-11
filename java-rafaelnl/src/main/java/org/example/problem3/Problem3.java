package org.example.problem3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {


    public int lengthLogestSubstringNoRepeated(String src){
        //max of one = 8
        //max of two = 7
        //max of three = 6
        //...
        //max of seven = 2
        //max of eight = 1

        String[] vals = src.split("");
        //int maxPossible = vals.length;
        int maxPossible = 1;
        int myLongest = 0;


        for (int i = vals.length-1; i >= 0; i--) {
            //i+1 : size of all possible substrings
            //Create all possible substrings
            int pos;
            int start = 0;
            for (int j = 0; j < maxPossible; j++) {
                String[] subString = new String[i+1];
                System.out.println("Para "+(i+1)+" se pueden  "+maxPossible+" grupos");
                //fill substring
                pos = start;
                for (int k = 0; k < subString.length; k++) {
                    System.out.println("Pos va asi: "+pos);
                    subString[k] = vals[pos];
                    pos++;
                }
                start++;

                //Check if there's repeated
                List<String> listAux = Arrays.asList(subString);
                listAux.forEach(System.out::println);
                Set<String> uniques = new HashSet<>(listAux);
                boolean res = true;

                for (String p:uniques) {
                    int local = 0;
                    for (int m = 0; m < subString.length; m++) {
                        if(p.equals(subString[m])){
                            local++;
                        }
                    }
                    if(local > 1) res = false;
                }
                if(res) return subString.length;
            }
            maxPossible++;
        }

        return myLongest;

    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        //int res = problem3.lengthLogestSubstringNoRepeated("abcabcbb");
        int res = problem3.lengthLogestSubstringNoRepeated("s=");
        System.out.println(res);
    }

}
