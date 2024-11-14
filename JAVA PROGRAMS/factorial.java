import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long fact=1;
         if(n<0)
         {
        	 System.out.println("Not applicable");
         }
         while(n!=0)
         {
        	fact*=n;
        	n--;
         }
         System.out.print(fact);
         sc.close();
	}

}
