import java.io.IOException;
import java.util.Scanner;

public class uri1178{
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);
		double v[] = new double [100];
		double n = in.nextDouble();

	    for(int i=0; i<100; i++) {
	        v[i] = n;
	        n = n/2;
	    }

    	for(int i=0; i<100; i++){
    		System.out.printf("N[%d] = %.4f\n", i, v[i]);
    	}
	}
}