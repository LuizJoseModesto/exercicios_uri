import java.io.IOException;
import java.util.Scanner;

public class uri1066 {
	public static void main (String[] args) throws IOException {
		Scanner in  = new Scanner(System.in);
		int contPos, contNeg, contPar, contImpar;
		double n;
		contPos=0;
		contNeg=0;
		contPar=0;
		contImpar=0;
		for(int i=0; i<5; i++) {
			n = in.nextDouble();
			if(n==0){
				contPar++;
			}
			else if(n>0) {
				contPos++;
				if(n%2==0) {
					contPar++;
				}else{
					contImpar++;
				}
			}else{
				contNeg++;
				if(n%2==0) {
					contPar++;
				}else{
					contImpar++;
				}
			}
		}

		
		System.out.printf("%d valor(es) par(es)\n",contPar);
		System.out.printf("%d valor(es) impar(es)\n", contImpar);		
		System.out.printf("%d valor(es) positivo(s)\n", contPos);
		System.out.printf("%d valor(es) negativo(s)\n", contNeg);

	}
}