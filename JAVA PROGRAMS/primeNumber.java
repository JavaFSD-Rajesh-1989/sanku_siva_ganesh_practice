import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1)
        {
        	System.out.println("Not a prime number.");
        }
        else
        {
        	int count=0;
        	for(int i=2;i<=Math.sqrt(n);i++)
        	{
        		if(n%i==0)
        		{
        			count++;
        		}
        	}
        	//System.out.println(count);
        	if(count==0)
        	{
        		System.out.println("Prime Number");
        	}
        	else
        		 System.out.println("Not a prime number");
        }
        sc.close();
	}
    
}
