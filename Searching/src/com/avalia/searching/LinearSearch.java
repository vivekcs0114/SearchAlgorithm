package com.avalia.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array = { 14, 15, 16, 85, 4 };
		int noOfItem = 5, i, reqEle = 4;
		for (i = 0; i < noOfItem; i++) {
			if (array[i] == reqEle) {
				System.out.println("linear Number is found at " + (i + 1) + " position");
				break;
			}
		}

		if (i >= noOfItem) {
			System.out.println("linear Number is not found ");
		}
	}
}
