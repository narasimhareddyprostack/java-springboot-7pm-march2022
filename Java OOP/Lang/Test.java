class Test extends Object{
public String toString() {
        return getClass().getName() + "*****" + Integer.toHexString(hashCode());
    }
public static void main(String[] args){
	System.out.println(new Test());
	System.out.println(new String("Rahul Gandhi"));
}
}