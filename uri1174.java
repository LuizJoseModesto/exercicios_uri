import java.io.IOException;
import java.util.Scanner;

public class uri1174{
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);
		double v[] = new double[10];
		double n;

	    for(int i=0; i<10; i++) {
			n = in.nextDouble();
	        v[i] = n;
	    }

    	for(int i=0; i<10; i++){
    		if(v[i]<=10){
    			System.out.printf("A[%d] = %.1f\n", i, v[i]);
    		}
    	}
	}
}