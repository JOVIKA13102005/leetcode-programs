bool isPalindrome(int x) {
    double rev=0, n, orignal=x;
       while(x>0)
        {
            n= x % 10;
            rev = rev * 10 + n;
            x/=10;
        }

        if(rev == orignal)
            return true;
         else
       return false;
    
}