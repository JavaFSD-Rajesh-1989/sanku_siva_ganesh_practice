import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,rev=0;
        while(n!=0)
        {
        	d=n%10;
        	rev=rev*10+d;
        	n=n/10;
        }
        System.out.println(rev);
        sc.close();
	}

}
