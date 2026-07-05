package mypackage;

public class Flow12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=29;      // Change number here

        boolean prime=true;

        if(n<2)
            prime=false;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    prime=false;
                    break;
                }
            }
        }

        if(prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

	}

}
