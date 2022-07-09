package week1.day1;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, n = 11, c = 0;
		
		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i <= n; i++) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
	}

}
