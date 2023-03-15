package org.example.problem20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem20 {

    String[] values = new String[]{"(","{","["};
    public boolean solution(String s){

        boolean res = false;
        Map<String, String> map = new HashMap<>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");

        Stack<String> myStack = new Stack<>();
        String[] values = s.split("");
        if(!isOpener(values[0])){
            return false;
        }
        for (int i = 0; i < values.length; i++){
            String current = values[i];
            if(isOpener(current)){
                myStack.push(current);
            }else{
                if(myStack.isEmpty()){
                    return false;
                }
                String prev = myStack.pop();
                if(!map.get(prev).equals(current)){
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public boolean isOpener(String target){
        boolean res = false;
        for(int i = 0; i <values.length; i++){
            if(target.equals(values[i])){
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem20 app = new Problem20();
        System.out.println(app.solution("()(){}{}{}[]"));
    }
}
