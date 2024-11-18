import java.util.Scanner;
import java.lang.String;
public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s1=sc.next();
     String s2=sc.next();
     int i;
     if((i=s1.compareTo(s2))==0)
     {
    	 System.out.println("true");
     }
     else
    	 
    	 System.out.println("false");
     System.out.println(i);
     sc.close();
	}

}
