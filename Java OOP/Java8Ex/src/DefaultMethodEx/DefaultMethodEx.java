package DefaultMethodEx;

interface Top{
	default void m1() {
		System.out.println("Top Interface - default Method");
	}
}
interface Bottom{
	default void m1() {
		System.out.println("Bottom Interface - default Method");
	}
}
public class DefaultMethodEx implements Top, Bottom {

	public static void main(String[] args) {
		DefaultMethodEx d = new DefaultMethodEx();
		d.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Class  - m1 Method");
		//Bottom.super.m1();
	}

}
