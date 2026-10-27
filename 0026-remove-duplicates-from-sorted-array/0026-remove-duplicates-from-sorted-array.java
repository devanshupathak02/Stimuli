class Solution {
    public int removeDuplicates(int[] nums) { //{1 , 1 , 2}
    
    int k = 1;

    for(int i=1; i < nums.length; i++){

        if(nums[i] != nums[i-1]){
            nums[k++] = nums[i];
        }
    }
    return k;
    }
}