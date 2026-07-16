//package core-java-practice.leet-code-codebase;

public class subtractproductnsum {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        while(n>=1){
            int p=n%10;
            prod*=p;
            sum+=p;
            n=n/10;
        }
        int diff=prod-sum;
        return diff;
    }
}