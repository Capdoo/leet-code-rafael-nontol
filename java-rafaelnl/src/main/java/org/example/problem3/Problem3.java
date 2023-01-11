package org.example.problem3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {


    public int lengthLogestSubstringNoRepeated(String s){
        //max of one = 8
        //max of two = 7
        //max of three = 6
        //...
        //max of seven = 2
        //max of eight = 1

        if(s.length() == 0){
            return 0;
        }
        String[] vals = s.split("");
        int maxPossible = 1;
        int myLongest = 0;


        for (int i = vals.length-1; i >= 0; i--) {
            //i+1 : size of all possible substrings
            //Create all possible substrings
            int pos;
            int start = 0;

            for (int j = 0; j < maxPossible; j++) {

                pos = start;
                System.out.println("Para "+(i+1)+" se pueden  "+maxPossible+" grupos");
                //Evaluacion

                //Para manana la verdad funciona lo comentado pero la idea es no crear una nueva cadena
                //solo leer de src con los limites, bueno con el inicio noma
                //el final se obtiene por la distancia del substring
                //no funciona con el test case de abajo> REVISAR

                boolean res = true;
                for (int k = pos; k < (i+1); k++) {
                    //substring: vals[k]
                    String single = vals[k];

                    for (int l = 0; l < (i+1); l++) {
                        if(single.equals(vals[l]) && k != l){
                            res = false;
                        }
                    }
                    System.out.println(single);
                }
                if(res) return i;

                start++;




                /*
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
                */
            }
            maxPossible++;
        }

        return myLongest;

    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        //int res = problem3.lengthLogestSubstringNoRepeated("abcabcbb");
        int res = problem3.lengthLogestSubstringNoRepeated("pwwkew");
        System.out.println(res);
    }

}
