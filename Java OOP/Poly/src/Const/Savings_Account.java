package Const;
public class Savings_Account extends Account {

	double acc_Bal;

	public Savings_Account(int a, String b, double d) {
		super(a,b);
		this.acc_Bal = d;
	}

	public static void main(String[] args) {
		Savings_Account a1= new Savings_Account(101,"Rahul Gandhi", 5000.00);
		System.out.println(a1.acc_id);
	}
}
