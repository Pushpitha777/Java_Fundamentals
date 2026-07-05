package mypackage;

public class Flow14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;      // Change value here
        int sum=0;

        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }

        System.out.println(sum);

	}

}
