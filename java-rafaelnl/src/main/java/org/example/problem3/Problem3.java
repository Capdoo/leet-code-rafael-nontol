package org.example.problem3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {

    public int lengthLogestSubstringNoRepeated(String s){

        boolean is_possible;

        //max of one = 8
        //max of two = 7
        //max of three = 6
        //...
        //max of seven = 2
        //max of eight = 1

        if(s.length() == 0) return 0;

        int cuantos = 1;
        int myLongest = 0;

        int pos_inicial, pos_relativa, pos_aux;
        char target;

        for (int i = s.length(); i >= 1; i--) {
            //i : length of substring
            System.out.println("Para "+i+" hay "+cuantos+" objetos posibles");

            pos_inicial = 0;
            for (int j = 0; j < cuantos; j++) {

                //Block for a new substring
                String msg = "";
                pos_relativa = pos_inicial;
                is_possible = true;
                for (int k = 0; k < i; k++) {

                    //Un substring
                    msg+=s.charAt(pos_relativa);
                    target = s.charAt(pos_relativa);

                    //Do evaluation
                    pos_aux = pos_inicial;
                    String msg_aux = "";
                    for (int l = 0; l < i; l++) {

                        //msg_aux += vals[pos_aux];
                        msg_aux += s.charAt(pos_aux);

                        if(target == s.charAt(pos_aux) && pos_relativa!=pos_aux){
                            is_possible = false;
                        }
                        pos_aux++;
                    }
                    System.out.println("for :"+target+ " for eval: "+msg_aux+" res: "+is_possible);

                    pos_relativa++;
                }
                System.out.println("cadena generada: "+msg);
                pos_inicial++;

                if (is_possible) return i;

            }
            cuantos++;

        }

        return myLongest;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int res = problem3.lengthLogestSubstringNoRepeated("abcabcbb");
        //int res = problem3.lengthLogestSubstringNoRepeated("pwwkew");
        //int res = problem3.lengthLogestSubstringNoRepeated("bbbbb");
        //int res = problem3.lengthLogestSubstringNoRepeated("kggqtmpfxewkqccehsluxmrbgcpmnwwzcdsxrhcolbbdddhmv");
        //int res = problem3.lengthLogestSubstringNoRepeated("xbkzbrrwmrmqgqcbuxdtwuuloqfargoqkzrlqiiecwukozljwpeulyharmckvrafsrqibaody");



        System.out.println(res);
    }

}
