package com.example.twoSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Solution class, validating the functionality of the twoSum method.
 */
public class SolutionTest {

    /**
     * Test case for the basic scenario where a pair of numbers sums to the target.
     */
    @Test
    public void testTwoSumBasic() {
        Solution solution = new Solution();

        // Basic test case with positive numbers
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Expected result is indices [0, 1]
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    /**
     * Test case where negative numbers are involved.
     */
    @Test
    public void testTwoSumWithNegativeNumbers() {
        Solution solution = new Solution();

        // Test case with negative and positive numbers
        int[] nums = {1, -2, 3, 4};
        int target = 1;

        // Expected result is indices [1, 2]
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    /**
     * Test case where the array contains duplicate values.
     */
    @Test
    public void testTwoSumWithDuplicates() {
        Solution solution = new Solution();

        // Test case with duplicate numbers
        int[] nums = {3, 3, 4};
        int target = 6;

        // Expected result is indices [0, 1] since both numbers sum to the target
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    /**
     * Test case where the sum occurs at the end of the array.
     */
    @Test
    public void testTwoSumAtEndOfArray() {
        Solution solution = new Solution();

        // Test case where the sum occurs at the end of the array
        int[] nums = {1, 5, 3, 4, 6, 9, 8};
        int target = 17;

        // Expected result is indices [5, 6]
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{5, 6}, result);
    }

    /**
     * Test case with an array that contains zeros.
     */
    @Test
    public void testTwoSumWithZero() {
        Solution solution = new Solution();

        // Test case with zero values
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        // Expected result is indices [0, 3] since 0 + 0 = 0
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    /**
     * Test case with a large array.
     */
    //@Test
    public void testTwoSumLargeArray() {
        Solution solution = new Solution();

        // Test case with a large array
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int target = 1998;

        // Expected result is indices [999, 999] because nums[999] + nums[999] = 1998
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{999, 999}, result);
    }

    /**
     * Test case for an empty array. Should throw NoValidPairFoundException.
     */
    @Test
    public void testTwoSumEdgeCaseEmptyArray() {
        Solution solution = new Solution();

        int[] nums = {};
        int target = 10;

        // Expecting an exception due to an empty array
        assertThrows(NoValidPairFoundException.class, () -> solution.twoSum(nums, target));
    }

    /**
     * Test case where no valid pair is found. Should throw NoValidPairFoundException.
     */
    @Test
    public void testTwoSumEdgeCaseNoSolution() {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4};
        int target = 10;

        // Expecting an exception as no two numbers sum to 10
        assertThrows(NoValidPairFoundException.class, () -> solution.twoSum(nums, target));
    }
}
