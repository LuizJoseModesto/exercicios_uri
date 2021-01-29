import java.io.IOException;
import java.util.Scanner;

public class uri1078 {
	public static void main (String[] args) throws IOException {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", i, n, i*n);
		}
	}
}