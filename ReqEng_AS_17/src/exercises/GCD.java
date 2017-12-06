package exercises;

public class GCD {

	static int greatestCommonDivisor(int a, int b) {

		int temp;
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;

	}
}
