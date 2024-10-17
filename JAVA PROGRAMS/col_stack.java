import java.util.Stack;

public class col_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack sc=new Stack();
    sc.push(10);
    sc.push(20);
    sc.push(40);
    sc.push(10);
    System.out.println(sc);
    sc.pop();
    System.out.println(sc);
    System.out.println(sc.peek());
	}
    

}
