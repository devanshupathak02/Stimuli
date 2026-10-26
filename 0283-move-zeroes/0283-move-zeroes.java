class Solution {
    public void moveZeroes(int[] nums) {
        
        // move forward all the non zeros value

        int pos = 0;

        for (int num : nums){
            if(num != 0 ){
                nums[pos++] = num; 

            }
        }

        while(pos < nums.length){
            nums[pos++] = 0;
        }

    }
}