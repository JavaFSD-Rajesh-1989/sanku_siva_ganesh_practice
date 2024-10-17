import java.util.Scanner;
public class string5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s1=sc.nextLine();
         int ccount=0,scount=0;
         //System.out.println(s1.length());
         /*for(int i=0;i<s1.length();i++)
         {
        	 char c=s1.charAt(i);
        	 if(c==' ')
        		 scount++;
        	 else
        		 ccount++;
         }
         System.out.println(scount);
         System.out.println(ccount);*/
         char s[]=s1.toCharArray();
         for(int i=0;i<s.length;i++)
         {
        	 if(s[i]==' ')
        		 scount++;
        	 else
        		 ccount++;
         }
         System.out.println(scount+" "+ccount);
         sc.close();	}

}
