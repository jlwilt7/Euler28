public class Euler28 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1001; i++) {
			sum += 16 * (i * i) - 28 * i + 16;
		}
		System.out.println(sum);
	}

}
