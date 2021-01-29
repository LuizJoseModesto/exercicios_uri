import java.io.IOException;
import java.util.Scanner;

public class uri1172 {
	public static void main (String[] args) throws IOException {
		Scanner in  = new Scanner(System.in);
		int n;
		int vetor[];
		for(int i=0; i<10; i++) {
			n=0;
			n = in.nextInt();
			if (n>0){
				System.out.printf("X[%d] = %d\n", i, n);
			}else{
				System.out.printf("X[%d] = %d\n", i, 1);
			}

		}
	}
}