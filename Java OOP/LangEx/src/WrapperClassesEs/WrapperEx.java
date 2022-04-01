package WrapperClassesEs;

public class WrapperEx {

	public static void main(String[] args) {
		int price = 5600;
		Integer i = Integer.valueOf(price);
		Float f = Float.valueOf(price);
		
		System.out.println(i.toString());
		System.out.println(f);
		Boolean b = Boolean.valueOf(false);
		
	}

}
