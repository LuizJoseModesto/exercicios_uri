import java.io.IOException;
import java.util.Scanner;

public class uri1019 {
	public static void main (String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();

		int h = n/3600;
		n = n - (h*3600);

		int m = n / 60;
		n = n - (m * 60);

		System.out.printf("%d:%d:%d\n", h, m, n);

	}
}