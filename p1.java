import java.io.IOException;
import java.util.Scanner;

public class p1 {
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);
		
		int n, x, m;
		m = in.nextInt();

		int v[] = new int[m];
		n = in.nextInt();
	
		if(n>0 || n<=50) {

	        v[0] = n;
		    for(int l=1; l<m; l++) {
		        x = n * 2;
		        v[l] = x;
		        n=x;
		    }
	    }

	    for(int p=0; p<m; p++){
	    	System.out.printf("N[%d] = %d\n", p, v[p]);
	    }
    }
}
