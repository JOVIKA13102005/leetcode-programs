class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int result = -1;
        for(int num:nums){
            if(num % 2 == 0){
            freq.put(num,freq.getOrDefault(num,0)+1);
            int currFreq = freq.get(num);
            if(currFreq > maxFreq || (currFreq == maxFreq && num < result)){
            maxFreq = currFreq;
            result = num;
            }
        }
    }
    return result;
}
}