import java.io.IOException;
import java.util.Scanner;

public class uri1064 {
	public static void main (String[] args) throws IOException {
		Scanner in  = new Scanner(System.in);
		int cont;
		double n, media, total;
		cont=0;
		total=0;
		for(int i=0; i<6; i++) {
			n = in.nextDouble();
			if(n>=0) {
				total += n;
				cont++;
			}else{
				cont=cont+0;
			}
		}
		media = total/cont;
		System.out.printf("%d valores positivos\n", cont);
		System.out.printf("%.1f\n", media);

	}
}