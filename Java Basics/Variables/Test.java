class Test{
		int price = 100;
		static int discount =10; 
	public static void main(String[] args){
		Test t1 = new Test();
		Test t2 = new Test();
		t2.price = 120;
		t2.discount = 11;
		System.out.println(t1.price); 
		System.out.println(t2.price);
		System.out.println(t1.discount);
		System.out.println(t2.discount); 
		System.out.println(discount); 
	
	}
	
}