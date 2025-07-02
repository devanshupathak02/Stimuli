class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> arr= new ArrayList<>();

        int i=0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        } 
        //store the duplicates in the list which are on the position of mising numbers
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                arr.add(nums[j]);
            }
        }
        return arr;
    } 
    // ignore the variable naming in swap fucntion 
    static void swap(int arr[],int last,int max){
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}