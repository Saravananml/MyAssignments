package week1.day2.assignment;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int n1 = 0;
		int n2 = 1;
		System.out.print("Fibonacci series are: " + n1);
		for (int j = 1; j <= n-1; j++) {
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.print(n1);
		}

	}

}
