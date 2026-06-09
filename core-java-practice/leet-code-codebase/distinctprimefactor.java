//package core-java-practice.leet-code-codebase;
import java.util.HashSet;
public class distinctprimefactor {
   
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

for(int i = 0; i < nums.length; i++) {

    int num = nums[i];
    int j = 2;

    while(num != 1) {

        if(num % j == 0) {
            set.add(j);
            num /= j;
        }
        else {
            j++;
        }
    }
}

return set.size();

    }

    
}
