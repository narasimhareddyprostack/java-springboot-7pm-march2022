public class Account{
//variable and methods
	int acc_Id = 101;
	public String acc_Name = "Rahul Gandhi";
	private double acc_Bal = 50000.00;

	public void cal_Bal(){
	System.out.println("cal Account Balance method");	
	}
	public static void acc_Service(){
	System.out.println("Acc Service  method");
	}
	public static void main(String[] args){
		Account a1=new Account();
		a1.cal_Bal();
		a1.acc_Service();
		Account.acc_Service();
		acc_Service();
		}
}