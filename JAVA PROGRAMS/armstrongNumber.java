import java.util.Scanner;
public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int temp=num;
       int n=num;
       int d,len=0;
       double sum=0;
       while(num!=0)
       {
    	   num=num/10;
    	   len++;
       }
       while(temp!=0)
       {
    	   d=temp%10;
    	   sum=sum+Math.pow(d,len);
    	   temp=temp/10;
       }
       if(sum==n)
       {
    	   System.out.print("Armstrong Number");
       }
       else
       {
    	   System.out.print("Not Armstrong number");
       }
       sc.close();
	}

}
