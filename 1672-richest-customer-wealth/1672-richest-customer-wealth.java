class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum = 0;
        int cnt = 0;
        for(int i=0;i<accounts.length;i++){
            cnt = 0;
            for(int j = 0;j<accounts[i].length;j++){

                cnt = cnt + accounts[i][j];
            }
            if(cnt>maxsum){
                maxsum = cnt;
            }
        }
        return maxsum;
    }
}