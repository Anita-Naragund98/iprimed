public class Triangle {
	public static void main(String[] args) {
	int num=3;
	int val=1;
		for (int i = num; i >=1; i--) {
		for(int j=i-1;j>=1;j--) {
		System.out.print(" ");
	}
		for (int k = 1; k <=val; k++) {
		System.out.print("*");
	}
	System.out.println();
	val+=2;
	}
    }
}