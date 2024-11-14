import java.util.Scanner;
public class nrotations_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
        	 a[i]=sc.nextInt();
         }
         for(int k=0;k<x;k++)
         {
        	  int temp=a[0];
        	  for(int i=0;i<n-1;i++)
        	  {
        		  a[i]=a[i+1];
        	  }
        	  a[n-1]=temp;
         }
         for(int i=0;i<n;i++) {
         System.out.println(a[i]);
	}
 }

}
