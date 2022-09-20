package problem7;

public class problem7 {
	
	
	public static void main(String[] args) {
		
		int x = 1222234;
		
		int res = reverse(x);
		
		System.out.println(res);
		
	}
	
    public static int reverse(int x) {
        
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

}
