import java.util.function.Function;
class Test {
//static Function<Integer, Integer> f = (a)->{return a*a;} ;
static Function<Integer, Integer> f = a->a*a;
public static void main(String[] args){
	System.out.println("SQRT of "+f.apply(10));
}
}