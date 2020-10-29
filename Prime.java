
public class Prime {
	public static void main(String[] args) {
	
		
		int n=9,temp=0,i;
		System.out.println("Whether the number 9 is prime or not");
	    for(i=2;i<=n/2;++i)
	    {
	    	if(n%i==0)
	    	{
	    		temp=1;
	    		break;
	    	}
	    }
		if(n==1)
			System.out.println("number is prime");
		else {
			if(temp==0)
				System.out.println("number is prime");
			else
				System.out.println("number is not prime");
		}
	}

}
