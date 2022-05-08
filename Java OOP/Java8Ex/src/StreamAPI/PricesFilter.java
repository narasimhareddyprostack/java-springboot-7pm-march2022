package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PricesFilter {
public static void main(String[] args) {
	ArrayList<Integer> prices =new ArrayList<Integer>();
	prices.add(399);
	prices.add(199);
	prices.add(299);
	prices.add(99);
	prices.add(599);
	System.out.println(prices);
	//configuring stram and processing stream
	List newPrices=prices.stream().map(price -> price+10).collect(Collectors.toList());
	System.out.println(newPrices);
}
}
