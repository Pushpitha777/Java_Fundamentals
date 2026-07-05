package mypackage;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 1, 4};

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 1 && arr[i] != 4) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);

	}

}
