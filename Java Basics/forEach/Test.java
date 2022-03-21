class Test{
public static void main(String[] args){
			int[][] a = { {10,20,30}, {40,60,70}};
			for(int[] x :a){
				for(int val:x){
					System.out.println(val);
				}
			}
	}
}