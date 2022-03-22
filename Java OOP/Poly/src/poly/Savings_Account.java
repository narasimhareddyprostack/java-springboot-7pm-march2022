package poly;

public class Savings_Account extends Account {
	private double min_Bal;

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
    public void cal_Bal() {
    	double bal = getAcc_Bal(); //5000
    	bal = bal - getMin_Bal();  // 5000 - 500  = 4500.00
    	System.out.println("Account Holder Name :"+ getAcc_Name()+ " Available Balance is: " + bal);
    }
}
