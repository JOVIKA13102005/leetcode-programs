class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = getMax(piles);
        
        while (low < high) {
            int mid = (low + high) / 2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;  // same as Math.ceil(piles[i] / (double)mid)
            }

            if (hours > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }

    int getMax(int[] piles) {
        int Max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (Max < piles[i]) {
                Max = piles[i];
            }
        }
        return Max;
    }
}
