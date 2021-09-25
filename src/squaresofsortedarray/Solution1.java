/*   Created by IntelliJ IDEA.
 *   Author: Rajesh kumar (B.tech)
 *   Date: 25-2021
 *   Time: 10:00
 *   File: LeetCodeQuestion.java
 */
package squaresofsortedarray;

public class Solution1 {
    // Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        //     for(int i=0; i<nums.length; i++){
        //         nums[i]*=nums[i];
        //     }
        //     Arrays.sort(nums);
        //     return nums;
        // }
        int left=0; int right=nums.length-1; int pointer=nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[pointer]=nums[left]*nums[left];
                left++;
            }
            else{
                result[pointer]=nums[right]*nums[right];
                right--;
            }
            pointer--;
        }
        return result;
    }
}