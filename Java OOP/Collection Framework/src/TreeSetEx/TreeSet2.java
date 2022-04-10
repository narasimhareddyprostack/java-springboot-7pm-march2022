package TreeSetEx;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();//default natural sorting order applied
		ts.add("Rahul Gandhi");
		ts.add("Priyanka Gandhi");
		ts.add("Rahul Gandhi");
		ts.add("Sonia Gandhi");
		System.out.println(ts);
	}

}
