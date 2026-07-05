package mypackage;
import java.util.Scanner;

public class Flowex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a % 10) == (b % 10))
            System.out.println(true);
        else
            System.out.println(false);


	}

}
