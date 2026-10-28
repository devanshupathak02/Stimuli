import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
      
      int n = nums.length;
      int ts = (n * ( n+ 1 )) / 2; 
      int as =0;

      for (int num: nums){
        as += num; 
      }

      return ts - as;
        
      
    }
}