//package core-java-practice.leet-code-codebase;

public class reduceZero {
    
    public int numberOfSteps(int num) {
        int count=0;
        while(num>=1){
        if(num==0) {
            return count;
        }
        if(num%2==0){
            num=num/2;
        
        }
        else{
            num=num-1;
        }
        count++;
        }
        return count;
    }
}

