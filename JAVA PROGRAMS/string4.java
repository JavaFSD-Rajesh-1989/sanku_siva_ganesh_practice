import java.util.Scanner;
public class string4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s[]=s1.split(" ");
       System.out.println(s.length);
       String x=s[0].toLowerCase();
       String y=s[1].toUpperCase();
       String z=s[2].replace('a', 'e');
       System.out.print(x+" "+y+" "+z);
       sc.close();
	}

}
