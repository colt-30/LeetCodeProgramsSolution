/*   Created by IntelliJ IDEA.
 *   Author: Rajesh kumar (B.tech)
 *   Date: 25-2021
 *   Time: 10:00
 *   File: LeetCodeQuestion.java
 */

package solution;

public class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int maxi = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==1){
                    count++;
                }else{
                    count = 0;
                }
                maxi = Math.max(maxi, count);
            }
            return maxi;


        }
}