class Solution {
    public int mySqrt(int x) {
        int low=1,high=x;
        while(low<=high){
            long mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==x){
                return (int)mid;
            }
            else if(val>x){
                high=(int)mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }   
        return Math.round(high);
    }
}