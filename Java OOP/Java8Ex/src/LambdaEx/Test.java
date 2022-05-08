package LambdaEx;

interface I{
	public void methodOne();
}
public class Test   {

	public static void main(String[] args) {
		I i = ()->{System.out.println("Test Class Method");};
		i.methodOne();
	}

}
