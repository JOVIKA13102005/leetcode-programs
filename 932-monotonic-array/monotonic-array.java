class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean a = false, b = false;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                a = true;
            }
            else if(nums[i-1]<nums[i]) {
                b = true;
            }
            if(a&&b)
            return false;
        }
        return true;
    }
}