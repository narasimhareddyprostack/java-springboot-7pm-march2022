package DefaultMethodEx;

interface Interface1{
	default void m1() {
		System.out.println("Interface1 - default Method");	
	}
}
interface Interface2{
	default void m1() {
		System.out.println("Interface2 - default Method");	
		}
}

public class Demo implements Interface1, Interface2 {
	public void m1() {
		System.out.println("Class Demo - m1 method");
	}
	public static void main(String[] args) {
	Demo d = new Demo();
	d.m1();

	}

}
