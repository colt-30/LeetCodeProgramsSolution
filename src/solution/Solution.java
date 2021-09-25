/*   Created by IntelliJ IDEA.
 *   Author: Rajesh kumar (B.tech)
 *   Date: 25-2021
 *   Time: 10:00
 *   File: LeetCodeQuestion.java
 */

package solution;

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int element : nums){
            int twoDigitsNum=0;
            while(element!=0){
                twoDigitsNum+=1;
                element/=10;
            }
            if(twoDigitsNum%2==0){
                count+=1;
            }

        }
        return count;
    }

}