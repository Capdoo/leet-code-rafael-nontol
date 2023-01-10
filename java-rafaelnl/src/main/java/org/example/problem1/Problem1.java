package org.example.problem1;

public class Problem1 {

    private int[] twoSums(int[] nums, int target){
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
        System.out.println(idxA);
        System.out.println(idxB);
        return new int[]{idxA,idxB};
    }


    //Two sums
    public static void main(String[] args) {
        Problem1 app = new Problem1();
        app.twoSums(new int[] {2,7,11,15}, 9);
    }

}
