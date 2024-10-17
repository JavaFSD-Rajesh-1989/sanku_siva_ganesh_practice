import java.util.*;
public class co_arrli1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList <Integer> ob=new ArrayList<Integer>();
           ob.add(20);
           ob.add(30);
           ob.add(40);
//           for(int x:ob) {
//           System.out.println(x);
//           }
           Iterator itr=ob.iterator();
           while(itr.hasNext())
           {
        	   System.out.println(itr.next());
           }
           ArrayList<Integer> al=new ArrayList<Integer>();
           al.addAll(ob);
//           System.out.println(al);
           al.clear();
           System.out.println(al);
           al.add(90);
           al.add(50);
           al.add(2, 78);
           System.out.println(al);
           al.add(3, 36);
           System.out.println(al);
	}

}
