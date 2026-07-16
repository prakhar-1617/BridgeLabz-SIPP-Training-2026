//package core-java-practice.leet-code-codebase;
import java.util.ArrayList;
public class fizzbuzz {
    
  
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            }
            else if(i%3==0){
                arr.add("Fizz");
            }
            else if(i%5==0){
                arr.add("Buzz");
            }
            else{
                arr.add(""+i);
            }
        }
        return arr;
    }
}
