
public class multithread3 extends Thread {
	synchronized public void run()
	{
		int a[]= {1,2,3,45,7};
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			System.out.println(Thread.currentThread().getName());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         multithread3 b=new multithread3();
         b.setName("you");
         b.start();
         multithread3 c=new multithread3();
         c.start();
         
	}

}
