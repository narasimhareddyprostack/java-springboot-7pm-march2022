package RuntimeEx;

public class Child extends Parent {
	public void display() {
		System.out.println("Child class display methods");
	}
	public static void main(String[] args) {
		Parent p1 =new Child();
		p1.display();
		
	}

}
