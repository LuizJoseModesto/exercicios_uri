import java.io.IOException;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        double C = entrada.nextDouble();
        double salario = (B*C);
        System.out.printf("NUMBER = %d\n",A);
        System.out.printf("SALARY = U$ %.2f\n",salario);   
    }
}