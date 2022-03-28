class Parent{
	Parent(){
	System.out.println("Parent Class Constructor");
	}
}
class Child extends Parent{
	Child(){
	super();
	System.out.println("Child Class Constructor");
	}
}
class Test{
	public static void main(String[] args){
	new Child();
	}
}