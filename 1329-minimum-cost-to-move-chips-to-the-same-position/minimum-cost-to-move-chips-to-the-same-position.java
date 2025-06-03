class Solution {
    public int minCostToMoveChips(int[] position) {
        int[]count = new int[2];
        int n = position.length;
        for(int p:position){
            ++count[p%2];

        }
        return Math.min(count[0],count[1]);
    }
}