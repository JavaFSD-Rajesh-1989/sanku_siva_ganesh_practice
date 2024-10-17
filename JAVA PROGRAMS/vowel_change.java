import java.util.Scanner;
public class vowel_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String a=sc.next();
     for(int i=0;i<a.length();i++)
     {
    	 char ch=a.charAt(i);
    	 if(ch>='A'&& ch<='Z')
    	 {
    		 int x=ch+32;
    		 System.out.print((char)x);
    	 }
    	 else
    	 {
    		 int y=ch-32;
    		 System.out.print((char)y);
    	 }
     }

	}

}
