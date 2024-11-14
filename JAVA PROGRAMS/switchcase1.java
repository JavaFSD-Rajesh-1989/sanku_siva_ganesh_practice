import java.util.Scanner;
public class switchcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char t=sc.next().charAt(0);
       switch(t)
       {
       case 'a':
       case 'e':
       case 'U':
       case 'i':
       case 'o':
       case 'u':
       case 'A':
       case 'E':
       case 'I':
       case 'O':
    	         System.out.print("vowel");
    	         break;
       default:
    	        System.out.println("consonant");
       }
       sc.close();
	}

}
