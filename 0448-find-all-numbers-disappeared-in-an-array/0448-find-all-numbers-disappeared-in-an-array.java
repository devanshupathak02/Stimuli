class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> arr= new ArrayList<>();

        int i=0;
        while(i< nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            } 

        }
        //store the missing number in an arraylist
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                arr.add(j+1);
            }
        }
        return arr;
    }
    static void swap(int nums[],int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}