import java.util.Scanner;
import java.lang.String;
public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     //int count=0;
     String s1=sc.nextLine();
     String s[]=s1.split(" ");
     for(String i:s)
     {
    	System.out.println(i);
         //count++;
     }
     System.out.print(s.length);
     sc.close();
	}

}
