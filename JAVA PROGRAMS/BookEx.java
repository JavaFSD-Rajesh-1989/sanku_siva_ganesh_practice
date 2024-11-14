import java.util.*;
class book{
	int bid;
	String bname;
	book(int bid,String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}
}
public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book(1,"halo");
		book b1=new book(2,"salo");
		book b2=new book(3,"palo");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
      ArrayList<book> al=new ArrayList<book>();
      al.add(b);
      al.add(b1);
      al.add(b2);
//      for(book x:al)
//      {
//    	 System.out.println(x.bid+" "+x.bname); 
//      }
      book y=null;
      boolean found=false;
      for(book x:al)
      {
    	  
    	  if(x.bname.equals(s))
    	  {
    		 found=true;
    		 y=x;
    	  }
    	  if(found)
    		  al.remove(y);
	          break;
      }
	
      for(book x:al)
      {
    	  System.out.println(x.bid+" "+x.bname);
      }
      
	}

}
