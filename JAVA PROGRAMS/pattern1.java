import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      char a='a';
      for(int i=1;i<=n;i++)
      {
    	  
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(a+" ");
    		  a++;
    	  }
    	  System.out.println();
    	 
      }
      sc.close();
	}

}


