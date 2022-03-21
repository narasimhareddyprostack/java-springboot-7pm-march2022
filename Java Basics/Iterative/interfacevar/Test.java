interface A{
int amount = 500; //public, static, final
}
class Test implements A{

public static void main(String[] args){
amount = 6000;
System.out.println(amount);
System.out.println(Test.amount);
}
}