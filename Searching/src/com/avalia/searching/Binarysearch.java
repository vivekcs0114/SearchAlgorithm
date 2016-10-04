package com.avalia.searching;

public class Binarysearch {
	public static void main(String[] args) {
		int[] array = { 11, 12, 13, 14, 15 };
		int noOfItem = 5;
		int reqEle = 15;
		int firstIndex = 0, lastIndex = noOfItem - 1;
		while (lastIndex >= firstIndex) {
			int middleIndex = (firstIndex + lastIndex) / 2;
			if (array[middleIndex] == reqEle) {
				System.out.println("number is found at " + (middleIndex + 1));
				break;
				} 
			else if (array[middleIndex] > reqEle)
				lastIndex = middleIndex - 1;
			else
				firstIndex = middleIndex + 1;

			middleIndex = (firstIndex + lastIndex) / 2;
		}
		if (firstIndex > lastIndex)
			System.out.println("number is not find");
	}
}
