import java.util.ArrayList;
import java.util.ListIterator;

public class co_arrli2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> ob=new ArrayList<Integer>();
       ob.add(1);
       ob.add(2);
       ob.add(1);
       ob.add(4);
       ListIterator<Integer> itr=ob.listIterator(ob.size());
       while(itr.hasPrevious())
       {
    	   System.out.println(itr.previous());
       }
        boolean x=ob.contains(10);
        System.out.println(x);
        ob.remove(0);
        System.out.println(ob);
	}

}
