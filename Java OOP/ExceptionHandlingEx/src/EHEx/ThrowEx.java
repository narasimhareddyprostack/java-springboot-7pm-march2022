package EHEx;

public class ThrowEx {

	public static void main(String[] args) throws ArithmeticException {
		//System.out.println(10/0); //AE object created internally
	    throw new ArithmeticException("/by Zero ....."); //we are creating one AE and handover to jvm
	}

}


//throw : to handover Excption object to the JvM manually
