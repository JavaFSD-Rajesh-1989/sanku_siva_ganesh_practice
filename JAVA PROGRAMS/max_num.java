import java.util.Arrays;
import java.util.Scanner;
public class max_num {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Minimum second value is:"+arr[1]);
		System.out.println("Maximum second value is:"+(arr[n-2]));
		
	}

}
