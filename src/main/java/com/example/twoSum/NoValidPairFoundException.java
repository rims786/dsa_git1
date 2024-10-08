package com.example.twoSum;

public class NoValidPairFoundException extends RuntimeException {
    /**
     * Custom exception to indicate that no valid pair was found
     * that sums to the target.
     */
    public NoValidPairFoundException(String message) {
        super(message);
    }
}