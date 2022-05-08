package PredefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
	ArrayList<Integer> prices = new ArrayList<Integer>();
	prices.add(199);
	prices.add(399);
	prices.add(299);
	prices.add(799);
	prices.add(999);
	prices.add(99);
	List filterPrices= (List) prices.stream().filter(price -> price <500).collect(Collectors.toList());
	List newPrices= prices.stream().map(price -> price+10).collect(Collectors.toList());
	System.out.println(prices);
	System.out.println(filterPrices);
	System.out.println(newPrices);
	}
}
