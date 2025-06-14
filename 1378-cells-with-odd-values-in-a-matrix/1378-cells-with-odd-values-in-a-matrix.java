class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        //assign an array
        int [][]matrix= new int[m][n];
        int count=0;


        for(int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            
            //increment row
            for(int j=0;j<n;j++){
                matrix[r][j]++;
            }
            for(int j=0;j<m;j++ ){
                matrix[j][c]++;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]%2 !=0){
                    count++;
                }
            }
        }
        return count;
        
    }
}