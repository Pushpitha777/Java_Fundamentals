package mypackage;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 1, 0, 0, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
        }

	}

}
