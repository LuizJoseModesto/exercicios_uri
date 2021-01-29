import java.io.IOException;
import java.util.Scanner;

public class uri1175{
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);
		int v[] = new int [20];
		int n;

	    for(int i=19; i>=0; i--) {
			n = in.nextInt();
	        v[i] = n;
	    }

    	for(int i=0; i<20; i++){
    		System.out.printf("N[%d] = %d\n", i, v[i]);
    	}
	}
}