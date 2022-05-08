

@FunctionalInterface
interface TestInterface{
	public abstract void m1();
}
public class LambdaEx {
	
	static TestInterface ti = ()->{};
	public static void main(String[] args) {
	ti.m1();
	}


}
