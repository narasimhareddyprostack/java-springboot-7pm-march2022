interface Interface1{
	public abstract void m1();
	public abstract void m2();
	default void m3(){
	
	}
	//extending interface funcitonality
}
class Test1 implements Interface1{
	public void m1(){ }
	public void m2(){ }
}
class Test2 implements Interface1{
	public void m1(){ }
	public void m2(){ }
}
class Test10 implements Interface1{
	public void m1(){ }
	public void m2(){ }
}