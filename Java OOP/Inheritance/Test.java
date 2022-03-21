class Parent{
	public void m1(){
	System.out.println("Parent Class - m1()");
	}
}
class Child extends Parent{
	public void m2(){
	System.out.println("Child Class - m2()");
	}
}
public class Test{
public static void main(String[] args){
	Parent p1 = new Parent();
	Child c1 = new Child();
	//Child c2= new Parent(); //Child cannt hold parent Object
	Parent p2=new Child();  //Parent can hold Child Object
	p2.m1();
	}
}