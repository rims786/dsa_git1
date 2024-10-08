package com.example.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution class to solve the two-sum problem.
 * Given an array of integers and a target integer, the class finds the two indices
 * of the numbers that add up to the target.
 */
public class Solution {

    /**
     * Finds two numbers in the array that add up to the target and returns their indices.
     *
     * @param nums   An array of integers.
     * @param target The target sum we are looking for.
     * @return An array containing the indices of the two numbers that add up to the target.
     * @throws NoValidPairFoundException If no valid pair is found that sums to the target.
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store the value and corresponding index of each number
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        // Iterate over the array to find a valid pair
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement is found in the map, return the indices
            if (numToIndexMap.containsKey(complement)) {
                return new int[] { numToIndexMap.get(complement), i };
            }

            // Add the current number to the map with its index
            numToIndexMap.put(nums[i], i);
        }

        // If no valid pair is found, throw a custom exception
        throw new NoValidPairFoundException("No two sum solution found for the given target.");
    }



}
