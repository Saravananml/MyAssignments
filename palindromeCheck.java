package week1.day2.assignment;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, j = 0;
		int x = 1221;
		for (int i = x; i >= 1; i = i / 10) {
			rem = i % 10;
			j = j * 10 + rem;
		}
		if (x == j)

			System.out.println(x + " is a Palindrome");
		else
			System.out.println(x + " is not a Palindrome");
	}
}
