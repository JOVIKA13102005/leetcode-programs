int tribonacci(int n) {
      double a=0,b=1,c=1;
    while(n--)
    {
        long long d=a+b+c;
        a=b;
        b=c;
        c=d;
    }
    return (int)a;
}