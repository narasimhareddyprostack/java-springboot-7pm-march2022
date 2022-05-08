package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		Stream s = Stream.of(10,20,30,40,50);
		s.forEach((i)->{System.out.println(i);});
		
		Double[] prices = {299.00, 399.00, 499.00};
		Stream s1 = Stream.of(prices);
		s1.forEach((price)->{System.out.println(price);});
		
	}

}
