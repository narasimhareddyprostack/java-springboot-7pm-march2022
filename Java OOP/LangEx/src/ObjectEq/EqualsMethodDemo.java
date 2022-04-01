package ObjectEq;

class Test{}
public class EqualsMethodDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//System.out.println(a == b);
		
		String name="Rahul Gandhi";
		String ename=new String("Rahul Gandhi");
		System.out.println(name.equals(ename)); //true
		
	    System.out.println(name == ename);
	    
//		Test t1=new Test();
//		Test t2= new Test();
//		System.out.println(t1.equals(t2));

	}

}
