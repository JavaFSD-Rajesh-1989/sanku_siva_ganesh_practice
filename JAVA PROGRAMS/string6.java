import java.util.Scanner;
public class string6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       String s3=sc.next();
       char ch1[]=s1.toCharArray();
       char ch2[]=s1.toCharArray();
       for(int i=0;i<s1.length();i++)
       {
    	   if(ch1[i]=='A'||ch1[i]=='E'||ch1[i]=='I'||ch1[i]=='O'||ch1[i]=='U'||ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u')
    		   ch1[i]='*';
       }
        //System.out.println(ch1);
       //String x=Arrays.toString(ch1);
       //System.out.println(x);
       for(int i=0;i<s2.length();i++)
       {
    	   if(ch2[i]!='A'&&ch2[i]!='E'&&ch2[i]!='I'&&ch2[i]!='O'&&ch2[i]!='U'&&ch2[i]!='a'&&ch2[i]!='e'&&ch2[i]!='i'&&ch2[i]!='o'&&ch2[i]!='u')
    		   ch2[i]='@';
       }
       //System.out.println(ch2);
       String ch3=s3.toUpperCase();
       /*String a=new String(ch1);
       String b=new String(ch2);
       String c=new String(ch3);
       System.out.println(a+b+c);*/
       StringBuilder sb=new StringBuilder();
       sb.append(ch1);
       sb.append(ch2);
       sb.append(ch3);
       System.out.println(sb);
       sc.close();
	}
     
}
