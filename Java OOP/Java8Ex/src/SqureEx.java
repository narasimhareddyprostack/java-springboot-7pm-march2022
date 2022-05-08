import java.util.function.Function;
import java.util.function.Predicate;

public class SqureEx {

	static Function<Integer,Integer> f = (a)->{ return a*a;};
	static Predicate<Integer> p =  i -> i%2==0;
	
	public static void main(String[] args) {
		System.out.println(f.apply(10)); //100
		System.out.println(p.test(15)); //false
		
	}

}
