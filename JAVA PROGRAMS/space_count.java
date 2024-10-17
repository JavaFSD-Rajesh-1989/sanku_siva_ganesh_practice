import java.util.Scanner;
public class space_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				
				count++;
			}
		}
		System.out.println(count);
        
	}

}
