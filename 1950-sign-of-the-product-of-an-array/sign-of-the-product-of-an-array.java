class Solution {
    public int arraySign(int[] nums) {
    int sign = 1;
    int n = nums.length;
    for(int i=0;i<n;i++){
    if(nums[i]==0)
    return 0;
    if(nums[i]<0)
    sign = -sign;
    }
    return sign;
}
}