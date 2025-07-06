class Solution {
    public String interpret(String command) {
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=command.length();i++){

            if(command.charAt(i-1)=='G'){
                sb.append("G");

            }else if(command.charAt(i-1)=='('){
                if(command.charAt(i)==')'){
                    sb.append("o");
                    i=i+1; 
                }else{
                    sb.append("al");
                    i=i+3;
                }
            }
        }
        return sb.toString();
        
    }
}