class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        for(int i=0;i<accounts.length;i++){
            int c=0;
            for(int j=0;j<accounts[0].length;j++){
                c+=accounts[i][j];
            }
            if(c>s){
                s=c;
            }
        }
        return s;
    }
}