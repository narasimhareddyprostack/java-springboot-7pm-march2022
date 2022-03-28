public class Account{
	Account(){
	System.out.println("Account Class -Constructor");
	}
	void Account(){
	System.out.println("Noromal Method");
	}
	public void cal_Bal(){
	System.out.println("Cal Bal method");
	}
	
	public static void main(String[] args){
	Account a1 = new Account();
	a1.Account();
	
	}
}
/*
Constructor - is special method, 
It will execute automatically while creating object.
Objective of  constructor - to intilize instance variable.

Note: We cant invoke constructor method, explicitly.
*/
