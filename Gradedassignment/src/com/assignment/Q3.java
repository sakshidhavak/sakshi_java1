package com.assignment;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Input array
	        int[] numbers = {1,2,3,4,5};

	        // Filter: retrieve all odd numbers and square them
	        int[] oddSquares = Arrays.stream(numbers)
	                .filter(n -> n % 2 != 0)
	                .map(n -> n * n)
	                .toArray();

	        // Map: find the sum of these numbers
	        int sum = Arrays.stream(oddSquares)
	                .sum();

	        // Output
	        System.out.println("Input: " + Arrays.toString(numbers));
	        System.out.println("Odd Numbers: " + Arrays.toString(oddSquares));
	        System.out.println("Sum: " + sum);
	    }
	}
