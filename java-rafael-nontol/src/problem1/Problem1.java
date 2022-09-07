package problem1;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i;
		
		int[] nums = new int[] {2,7,11,15};
		int target = 9;
		
		
        int i,j;
        int idxA=0,idxB=0;

        for(i=0; i<nums.length; i++){
            int a = nums[i];
            for(j=0; j<nums.length; j++){
                int b = nums[j];
                int c = a+b;
                if(j != i && c == target){
                    idxA = i;
                    idxB = j;
                }
            }
        }
        //return new int[]{idxA,idxB};

	}

}
