import java.lang.String;
import java.util.Scanner;
public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      for(int i=s1.length()-1;i>=0;i--)
      {
    	  System.out.print(s1.charAt(i));
      }
      //System.out.println(s1);
      sc.close();
	}

}
