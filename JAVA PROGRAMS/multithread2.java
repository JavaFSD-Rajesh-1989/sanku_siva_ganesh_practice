
public class multithread2 extends Thread{
	 public void run()
	{
		System.out.println("hello");
		System.out.println("hy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      multithread2 b=new multithread2();
      b.start();
      multithread2 c=new multithread2();
      c.start();
	}


}
