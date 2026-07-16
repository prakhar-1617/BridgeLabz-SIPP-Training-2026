//package core-java-practice.leet-code-codebase;

public class maximumproduct {
   
    public int maxProduct(int[] nums) {
         int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int value=(nums[i]-1)*(nums[j]-1);
                 max=Math.max(max,value);
            }
        }
        return max;

//         class Solution {
//     public int maxProduct(int[] nums) {

//         int max1 = 0;
//         int max2 = 0;

//         for(int num : nums){

//             if(num > max1){
//                 max2 = max1;
//                 max1 = num;
//             }
//             else if(num > max2){
//                 max2 = num;
//             }
//         }

//         return (max1 - 1) * (max2 - 1);
//     }
// }
    }
}
