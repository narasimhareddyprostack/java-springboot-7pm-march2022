package pack1;
import pack1.A;
class Test{

public static void main(String[] args){
	A a = new A();
	a.m1(); //public  - anywhere
	//a.m2(); //private - with in the class 
	a.m3(); //protected method - with in the package+outside the package with child ref 
	a.m4(); //default method -with in the package 
 }
}