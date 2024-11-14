
public class multithread4 extends Thread{
	public void run()
	{
		String[] s1= {"hello","who","are","you"};
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         multithread4 b=new multithread4();
         b.start();
         b.setPriority(8);
         b.setName("1");
         multithread4 c=new multithread4();
         c.start();
         b.setPriority(5);
         b.setName("2");
         multithread4 d=new multithread4();
         d.start();
         b.setPriority(1);
         b.setName("3");
         
	}

}
