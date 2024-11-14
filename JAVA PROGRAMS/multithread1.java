
public class multithread1 extends Thread {
	 public void run()
	 {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithread1 t=new multithread1();
       t.start();
	}

}
