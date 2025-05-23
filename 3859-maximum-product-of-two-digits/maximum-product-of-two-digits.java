class Solution {
    public int maxProduct(int n) {
        int digt1=0;
        int digt2=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            if(rem>digt1){
                digt2=digt1;
                digt1=rem;
            }
            else if(rem>digt2){
                digt2=rem;
            }
            
                temp=temp/10;
            
        }
        return digt1*digt2;
    }
}