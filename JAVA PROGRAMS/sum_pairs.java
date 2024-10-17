import java.util.Scanner;
public class sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[6];
		for(int i=0;i<6;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			for(int j=i;j<6;j++)
			{
				if((a[i]+a[j])==n&&i!=j)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		sc.close();
	}

}
