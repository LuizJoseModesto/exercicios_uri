import java.io.IOException;
import java.util.Scanner;

public class uri1173 {
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);
		int v[] = new int[10];
		int n, x;
		n = in.nextInt();

		if(n>0 || n<=50) {
        	v[0] = n;
	        for(int i=1; i<10; i++) {
	            x = n * 2;
	            v[i] = x;
	            n=x;
	        }
    	}
    	for(int i=0; i<10; i++){
    		System.out.printf("N[%d] = %d\n", i, v[i]);
    	}
	}
}



