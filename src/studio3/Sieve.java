package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number and we'll find the prime numbers up to that number");
		int n = scan.nextInt();

		if (n <= 1) {
			System.out.println("Please enter a number greater than 1!");
		}
		int[] valid = new int[(n-1)];
		int indexNum = 0;
		int x;
		int y;
		for (int i = 2; i <= n; i++) { // creates array up to n
			valid[indexNum] = i;
			indexNum++;
		}

		for (int k = 0; k < indexNum-1; k++) {
			for (int h = 2; h<=(n/(k+2)); h++) {
				x = (k+2) * h;
				y = x - 2;
				if (y < (n-1)) {
				valid[y] = 0;
				}

			}
		}




		for (int j= 0; j < indexNum; j++) { // prints array
			if (valid[j] != 0) {
				System.out.print(valid[j]  + ", ");
			}

		}

	}
}
