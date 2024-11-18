import java.util.Scanner;
public class array_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=0;i<n-1;i++)
        {
        	a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        for(int i=0;i<n;i++)
        {                                           
        	System.out.println(a[i]);               
        }
	}

}
