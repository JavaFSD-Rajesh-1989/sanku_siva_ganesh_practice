import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter array:");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
        		a[i]=sc.nextInt();
        }
        for(int digit:a)
        {
        		sum=sum+digit;
        }
        System.out.println(sum/5);
        
	}

}
