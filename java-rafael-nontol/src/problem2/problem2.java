package problem2;


public class problem2 {

	public static void main(String[] args) {
		

		ListNode l1sub3 = new ListNode(3);
		ListNode l1sub2 = new ListNode(4,l1sub3);
		ListNode l1 = new ListNode(2,l1sub2);
		
		
		ListNode l2sub3 = new ListNode(4);
		ListNode l2sub2 = new ListNode(6,l2sub3);
		ListNode l2 = new ListNode(5,l2sub2);

		
		ListNode res = addTwoNumbers(l1,l2);
		System.out.println(res.val);
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Get number A
        int len1 = getSizeList(l1);
        //System.out.println(len1);
        int[] a = getNumberFromList(l1, len1);
        //System.out.println(a);
        
        //Get number B
        int len2 = getSizeList(l2);
        //System.out.println(len2);
        int[] b = getNumberFromList(l2, len2);
        //System.out.println(b);

        //Get sum A and B
        int[] c = getSumArrays(a,b);
                
        //Return sum as Linked List
        return getListFromNumber(c);

	}
	
    public static int getSizeList(ListNode lx){
        int k = 1;
        ListNode ly = lx;
        while(ly.next != null){
            k++;
            ly = ly.next;
        }
        return k;
    }
    
    
    //Get number int[] to make sum
    public static int[] getNumberFromList(ListNode lx, int lenx){
        ListNode ly = new ListNode();
        ly = lx;
        
        int[] res = new int[lenx];
        int k = lenx-1;
        for(int i=0; i<lenx; i++){
            
            if(ly != null){
                int n = ly.val;
                res[k] = n; 
            }
            k--;
            ly = ly.next;
        }
        
        return res;

    }
    
    //Get List From Number
    public static ListNode getListFromNumber(int[] c){
        
        //Get flipped number
        int[] x = getFlippedNumber(c);
        ListNode listAux = new ListNode();
        
        int k = 0;
        for(int i = x.length - 1; i >= 0; i--){
            int digit = x[i];
            if(k == 0){
                ListNode nodeInit = new ListNode(digit, null);
                listAux = nodeInit;
            }else{
                ListNode nodeNext = new ListNode(digit, listAux);
                listAux = nodeNext;
            }
            k++;
        }
        
        return listAux;
        
    }
    
    //Get Array Number Flipped
    public static int[] getFlippedNumber(int[] x){
        
        int[] res = new int[x.length];
        
        int k = x.length - 1;
        for(int i=0; i<x.length; i++){
            res[i] = x[k];
            k--;
        }
        
        return res;

    }
    
    public static int[] getSumArrays(int[] numa, int[] numb){

            
        int idx,idy,idz,max;
        int val1,val2,val3;
        
        idx = numa.length;
        idy = numb.length;
        
        if(idx>idy){
            max = idx;
        }else{
            max = idy;
        }
        
        idz = max + 1;
        int[] res = new int[idz];
        
        int aux = 0;
        int j = idx-1;
        int k = idy-1;
        for(int i = idz-1; i>=0; i--){
            

            if(j<0){
                val1 = 0;
            }else{
                val1 = numa[j];
            }
            
            if(k<0){
                val2 = 0;
            }else{
                val2 = numb[k];
            }

            val3 = val1 + val2 + aux;
            
            if(val3/10 == 1){
                aux = 1;
                val3 = val3%10;
            }else{
                aux = 0;
            }
                       
            res[i] = val3;
            j--;
            k--;
        }
        
        if(res[0] == 0){
            int[] res2 = new int[res.length-1];
            for(int i=0; i<res2.length; i++){
                res2[i] = res[i+1];
            }
            return res2;
        }
        
        return res;
    }
	
}
