package workspace1103;

import java.util.Arrays;

public class SelectSort {
	
	static void selectionSort(int[] A) {
		// Sort A into increasing order, using selection sort
		for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
		// Find the largest item among A[0], A[1], ...,
		// A[lastPlace], and move it into position lastPlace
		// by swapping it with the number that is currently
		// in position lastPlace.
			int maxLoc = 0; // Location of largest item seen so far.
			for (int j = 1; j <= lastPlace; j++) {
				if (A[j] > A[maxLoc]) {
		// Since A[j] is bigger than the maximum we’ve seen
		// so far, j is the new location of the maximum value
		// we’ve seen so far.
		maxLoc = j;
			}
		}
		int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
		A[maxLoc] = A[lastPlace];
		A[lastPlace] = temp;
		} // end of for loop
	}
	
	static int[] createArray(int len) {
		int[] arr = new int[len];
		int randInt;
		for(int i=0; i<len; i++) {
			randInt =  (int)(Integer.MAX_VALUE * Math.random());
			arr[i] = randInt;
		}
		return arr;
	}
	
	static long runTime(int len) {
		long startTime = System.currentTimeMillis();
		int[] arr = createArray(len);
		selectionSort(arr);
		long runtime = System.currentTimeMillis() - startTime;
		return runtime;
	}

	public static void main(String[] args) {
		System.out.println(runTime(100));
		System.out.println(runTime(1000));
		System.out.println(runTime(10000));
		System.out.println(runTime(100000));
	}

}
