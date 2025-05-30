class Solution {
    public int hammingWeight(int n) {
        int orig = n;
        int count = 0;
        while(n>0) {
            n = n>>1<<1;
            if(orig - n==1)
            count++;
            orig = n>>1;
            n = orig;
        }
        return count;
    }
}