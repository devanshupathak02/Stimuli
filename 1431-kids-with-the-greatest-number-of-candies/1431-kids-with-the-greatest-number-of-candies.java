class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int greater=-1;
        ArrayList<Boolean> result=new ArrayList<Boolean>();

        for(int i=0;i<candies.length;i++){
            if(candies[i] > greater){
                greater= candies[i];
            }

        }   
        for(int i=0;i<candies.length;i++){
            
            if(candies[i]+extraCandies >= greater){
                result.add(i, true);
            }else{
                result.add(i,false);
            }
        }

        return result;
        
        
    }
}