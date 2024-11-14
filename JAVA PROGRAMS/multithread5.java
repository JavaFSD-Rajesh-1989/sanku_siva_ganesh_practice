
public class multithread5 implements Runnable {
  public void run()
  {
	  for(int i=0;i<10;i++)
	  {
		  if(i%2==0)
		    try {
		    	Thread.sleep(1000);
		    }catch(Exception e)
		  {
		    	e.printStackTrace();
		  }
		  
		      System.out.println(i);
		 
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       multithread5 b=new multithread5();
       Thread t=new Thread(b);
       t.start();
       multithread5 b1=new multithread5();
       Thread t1=new Thread(b1);
       t1.start();
	}

}
