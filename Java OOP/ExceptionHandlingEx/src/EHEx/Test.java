package EHEx;

public class Test {

	public static void main(String[] args) {
		
		getData();
	}
	public static void getData() {
		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException e) {
			 //e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Hello,");
			
		}

	}

}
