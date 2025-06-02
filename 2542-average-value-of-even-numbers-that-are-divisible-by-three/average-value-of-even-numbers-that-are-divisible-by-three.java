class Solution {
    public int averageValue(int[] nums) {
      int n=nums.length;
      int count =0;
      int num =0;
      for(int i=0;i<n;i++){
        if(nums[i]%2==0 && nums[i]%3==0){
            num +=nums[i];
            count++;
        }
      }  
      if(count==0)
      return 0;
      else
      return num/count;
        
    }
}
