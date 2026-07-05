package mypackage;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 50, 20, 90, 40, 5};

        Arrays.sort(arr);

        System.out.println("Smallest = " + arr[0] + ", " + arr[1]);

        System.out.println("Largest = " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);

	}

}
