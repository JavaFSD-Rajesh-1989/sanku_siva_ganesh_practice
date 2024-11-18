import java.util.Scanner;
public class fact_recursion {
	 int fact(int n)
	{
		int fact=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			fact=fact*n;
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
          fact_recursion b=new fact_recursion();
          int a=b.fact(n);
          System.out.println(a);
          
          
	}

}
