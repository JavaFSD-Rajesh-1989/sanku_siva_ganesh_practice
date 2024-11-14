
public class invalidjavaclass {
	void invalidnum(int num)
	{
		if(num<0)
		{
			throw new ArithmeticException("Negative man!");
		}
		else
		{
			System.out.println("lets go");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       invalidjavaclass jc=new invalidjavaclass();
       try {
    	   jc.invalidnum(-1);
       }
       catch(Exception e){
    	   System.out.println(e.getMessage());
       }
	}

}
