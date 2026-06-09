//package core-java-practice.leet-code-codebase;

public class reverseinteger {
   
    public int reverse(int x) {
        int flag=0;
        if(x<0){
        x=-1*x;
             flag=1;
        }
        int rev=0;
        while(x>=1){
            int p=x%10;
            // Overflow check  vvvimp
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10 ) {
                 return 0;
            }
            rev=rev*10+p;
            x=x/10;
        }
        return (flag==1)?-1*rev:rev;
    }
}
