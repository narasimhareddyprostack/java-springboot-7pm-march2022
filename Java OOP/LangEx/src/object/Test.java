package object;

public class Test extends Object{
	public String toString() {
        return "Test Class from Development";
    }

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.toString());
		System.out.println(t1);

	}

}
