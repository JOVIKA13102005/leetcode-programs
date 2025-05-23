class Solution {
    public int climbStairs(int n) {
    if(n <= 3) return n;
        int prev=3;
        int next=2;
        int curr=0;
        for(int i=3;i<n;i++) {
          curr=prev+next;
          next=prev;
          prev=curr;
    }
    return curr;     
    }
}