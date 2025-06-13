class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int a = nums1.length-1;
        int b = nums2.length-1;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j =0;
        int[]x = new int[Math.min(nums1.length,nums2.length)];
while(a>=0&&b>=0){
if(nums1[a]==nums2[b]){
    if(j==0||x[j-1]!=nums1[a]){
x[j++]=nums1[a];

    }
    a--;
b--;
}
else if(nums1[a]>nums2[b]){
    a--;
}
else if(nums1[a]<nums2[b]){
    b--;
}
}


return Arrays.copyOf(x,j);
    }
}
 
    