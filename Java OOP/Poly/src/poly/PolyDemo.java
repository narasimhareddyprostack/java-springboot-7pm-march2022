package poly;

public class PolyDemo {

	public static void main(String[] args) {
		Savings_Account a1 = new Savings_Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Bal(5000);
		a1.setMin_Bal(500.00);
		
		//System.out.println("Account Holder Name: "+ a1.getAcc_Name()+" Id: "+ a1.getAcc_Id());
		//a1.cal_Bal();
		
		System.out.println("*******************************");
		
		
		Current_Account a2 = new Current_Account();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka Gandhi");
	    a2.setAcc_Bal(50000);
	    a2.setMin_Bal(25000.00);
	    
	    //a2.cal_Bal();
	
	    //System.out.println("Account Holder Name: "+ a2.getAcc_Name()+" Id: "+ a2.getAcc_Id());
		
	    AccountService.showDetails(a1);
	    AccountService.showDetails(a2);
	    
	}

}
