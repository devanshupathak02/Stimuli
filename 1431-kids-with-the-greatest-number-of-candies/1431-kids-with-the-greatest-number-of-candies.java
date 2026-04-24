class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
       int greater = -1;

       ArrayList<Boolean> result  = new ArrayList<>();


       for(int candy:candies){
            if(candy > greater){
                greater = candy;
            }
       }
       for(int kid : candies){
            if(kid+extraCandies >= greater){
                result.add(true);
            }
            else{
                result.add(false);
            }
       }
        return result;
        
    }
}