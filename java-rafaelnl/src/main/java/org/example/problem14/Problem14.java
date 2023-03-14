package org.example.problem14;

public class Problem14 {

    private String longestCommonPrefix(String[] srcs){
        String res="";
        int minLen = srcs[0].length();
        boolean aintSame = false;
        for (String p:srcs) {
            if(p.length() < minLen){
                minLen = p.length();
            }
        }
        int i=0;
        while(i<minLen){
            String previous="";
            String possible="";
            String currentValue = "";
            for (int j = 0; j < srcs.length; j++) {
                currentValue = String.valueOf(srcs[j].charAt(i));
                if(j==0){
                    previous = currentValue;
                    possible = currentValue;
                }else {
                    if(previous.equals(currentValue)){
                        possible=currentValue;
                    }else{
                        aintSame=true;
                        break;
                    }
                }
            }
            if(aintSame){
                break;
            }
            res+=possible;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Problem14 app = new Problem14();
        //String[] src = new String[]{"flower","flow","flight"};
        String[] src = new String[]{"a"};
        String res = app.longestCommonPrefix(src);
        System.out.println(res);
    }
}
