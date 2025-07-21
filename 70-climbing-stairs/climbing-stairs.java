class Solution {
    public int climbStairs(int n) {
        int[] memo = new int [n+1];
    return  count(n , memo);

    }
    public int count( int tar, int [] memo){
        if(tar==0){
            return 1;
        }
        if (tar<0){
            return 0;
        }
        if(memo[tar]!=0){
            return memo[tar];   
        }
        memo[tar]=count( tar-1,memo)+ count( tar-2,memo);  
        return memo[tar];  
    }
}