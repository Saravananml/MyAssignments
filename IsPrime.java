package week1.day2.assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 712;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {//check n divided by 1 and by itself
				j++;
			}
		}
		if (j == 2) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
