package Const;

public class Account2 {
		int acc_id;
		String acc_Name;
		Account2(int a, String b){
			this.acc_id =a;
			this.acc_Name=b;
		//System.out.println(a+b);
		}
		
		public static void main(String[] args){
			
		Account2 a1 = new Account2(101,"Rahul");

		Account2 a2 = new Account2(102,"Sonia");
		System.out.println(a1.acc_id);
		System.out.println(a2.acc_id);
		
		}
}
