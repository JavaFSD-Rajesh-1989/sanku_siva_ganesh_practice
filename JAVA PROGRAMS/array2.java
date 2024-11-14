import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size:");
       int n=sc.nextInt();
       System.out.println("Enter the array");
       int a[][]=new int[n][n];
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   a[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("Enter the number to find");
       int num=sc.nextInt();
       boolean present=false;
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   if(a[i][j]==num)
    		   {
    			   present=true;
    			   break;
    		   }
    			   
    	}
     }
       if(present)
    	   System.out.println("present");
       else
    	   System.out.println("not Present");
       sc.close();
	}

}
