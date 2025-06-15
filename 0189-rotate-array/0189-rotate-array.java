 class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp[] = new int[nums.length-k];
        for(int i=0;i<nums.length-k;i++){
            temp[i] = nums[i];
        }
        for(int i = nums.length-k;i<nums.length;i++){
            nums[i-(nums.length-k)] = nums[i];
        }
        for(int i = k;i<nums.length;i++){
           nums[i] = temp[i-k];
        }
    }
}