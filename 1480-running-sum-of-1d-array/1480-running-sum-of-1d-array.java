class Solution {
    public int[] runningSum(int[] nums) {
       
       int sum[] = new int[nums.length];
        int sm = 0;
       for(int i =0;i<nums.length;i++ ){
        sm = sm + nums[i];
        sum[i] = sm;
       }
       return sum;
    }
}