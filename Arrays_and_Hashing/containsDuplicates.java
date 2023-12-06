/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.

 Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
 */
 
 import java.util.HashSet;
 import java.util.Set;
 import java.util.Arrays;

 class Solution {
    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] input0 = {};
        int[] input1 = {1,2,3,1};
        int[] input2 = {1,2,3,4};
        int[] input3 = {1,1,1,3,3,4,3,2,4,2};

        boolean output0 = solution.containsDuplicate(input0);
        boolean output1 = solution.containsDuplicate(input1);
        boolean output2 = solution.containsDuplicate(input2);
        boolean output3 = solution.containsDuplicate(input3);

        // May want to replace with assert statements for best practice
        System.out.println(output0);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);

    }
    
    /**
     * @param nums an array of non-unique, unsorted integers, such that 1 <= nums.length <= 10, -109 <= nums[i] <= 109
     * @return boolean to indicate if a duplicate is found in an array
     */
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        // Sets and HashSets only allow unique values to populate the object.
        // Therefore, by iterating through the array and adding each element to the set, 
        // we'll be returned a false flag, and the element will not be added.
        // Once the false flag is thrown by the hashSet, we can set our return as such. 
        HashSet<Integer> foundDup = new HashSet<Integer>();

        // handle null-case
        if(nums.length == 0){
            return duplicate = false;
        }
        // TODO calculate time complexity of hashSet. My understanding is this would be O(n)
        for (int i = 0; i <nums.length; i++){
            if(foundDup.add(nums[i]) == false){
                System.out.println(nums[i] + " is a duplicate.");
                return duplicate = true;
            }
        }
        /*
         * // brute-force - applying this solution to a large dataset will timeout
           // TODO: Calculate O(n) - pretty sure O(n^2), but need to confirm
            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        duplicate = true;
                        return duplicate;
                }
            }
        }
         */
        
        return duplicate;

    }
}