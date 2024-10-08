package com.example.twoSum;

import java.util.Scanner;

/**
 * Main class to run the Two Sum solution program.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Two Sum Solution Program!");

        // Input: Array of integers
        System.out.println("Enter the numbers (comma-separated):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Input: Target sum
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        // Create the Solution object
        Solution solution = new Solution();

        // Try to find two numbers that sum to the target
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("The indices of the numbers that sum to " + target + " are: [" + result[0] + ", " + result[1] + "]");
            System.out.println("The numbers are: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } catch (NoValidPairFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
