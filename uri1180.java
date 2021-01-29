import java.io.IOException;
import java.util.Scanner;

public class uri1180{
	public static void main (String[] args) throws IOException {

		Scanner in  = new Scanner(System.in);

		int aux=0, pos=0;
		int menor = Integer.MAX_VALUE;
		int n = in.nextInt();
		int v[] = new int [n];


	    for(int i=0; i<n; i++) {
	        v[i] = in.nextInt();
	    }

    	for(int i=0; i<n; i++){
        	if(v[i]<menor){
        		menor = v[i];
        		pos = i;
        	}
        }

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("posição: %d\n", pos);

    }
}