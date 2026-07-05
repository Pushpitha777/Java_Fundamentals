package mypackage;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] arr = {10, 25, 4, 89, 32};

		        int max = arr[0];
		        int min = arr[0];

		        for (int i = 1; i < arr.length; i++) {

		            if (arr[i] > max)
		                max = arr[i];

		            if (arr[i] < min)
		                min = arr[i];
		        }

		        System.out.println("Maximum = " + max);
		        System.out.println("Minimum = " + min);


	}

}
