import java.io.IOException;
import java.util.Scanner;

public class uri1051 {
	public static void main (String[] args) throws IOException {
		double x;
		Scanner in = new Scanner(System.in);
		x = in.nextFloat();

	    if (x>=0.00 && x<=2000.00){
	        System.out.printf("Isento\n");
	    }else if (x>=2000.01 && x<=3000.00){
	        double i, d;
	        d = x -2000.00; //isento
	        i = (d/100)*8;
	        System.out.printf("R$ %.2f\n", i);
	    }else if(x>=3000.001 && x<=4500.00){
	        double i, d1, d2, d3;
	        d1 = x - 2000.00;//isento
	        d2 = d1 - 1000.00;//resto 18% de imposto
	        d3 = d1 - d2;//taxa de 8% de imposto
	        i = ((d2*.18)+(d3*.08));
	        System.out.printf("R$ %.2f\n", i);
	    }else {
	        double i, d1, d2, d3, d4;
	        d1 = x -2000.00;//isento
	        d2 = d1 -2500.00;//resto 28% de imposto
	        d3 = d1 - d2 - 1000.00;//resto 18% de imposto
	        d4 = d3 - 500;//resto 8% de imposto
	        i = ((d2*.28)+(d3*.18)+(d4*.08));
	        System.out.printf("R$ %.2f\n", i);

	    }
	}
}