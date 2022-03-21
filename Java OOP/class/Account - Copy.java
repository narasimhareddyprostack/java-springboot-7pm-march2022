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
		System.out.println(a1.acc_Id);
		System.out.println(a1.acc_Name);
		System.out.println(a1.acc_Bal);
		}
}