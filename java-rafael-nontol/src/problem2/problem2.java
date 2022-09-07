package problem2;


public class problem2 {

	public static void main(String[] args) {
		

		ListNode l1sub3 = new ListNode(3);
		ListNode l1sub2 = new ListNode(4,l1sub3);
		ListNode l1 = new ListNode(2,l1sub2);
		
		
		ListNode l2sub3 = new ListNode(4);
		ListNode l2sub2 = new ListNode(6,l2sub3);
		ListNode l2 = new ListNode(5,l2sub2);

		
		addTwoNumbers(l1,l2);
		
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Get number A
        int c = l1.val;
        int b = l1.next.val;
        int a = l1.next.next.val;
        
        String numA = ""+a+""+b+""+c;
        int m = Integer.parseInt(numA);
        
        //Get number B
        c = l2.val;
        b = l2.next.val;
        a = l2.next.next.val;
                    
        String numB = ""+a+""+b+""+c;
        int n = Integer.parseInt(numB);
        
        //Get sum A and B
        int p = m+n;
        String numC = p+"";
        char[] chars = numC.toCharArray();
        int[] elements = new int[3];
        for(int i=0; i<chars.length; i++){
            elements[i] = Integer.parseInt(chars[i]+"");
        }
                
        //Return sum as Linked List

        ListNode lista3 = new ListNode(elements[0]);
        ListNode lista2 = new ListNode(elements[1],lista3);
        ListNode lista1 = new ListNode(elements[2],lista2);
        
        return lista1;
	}
	
}
