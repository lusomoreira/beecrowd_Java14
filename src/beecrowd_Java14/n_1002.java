package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1002 {

    public static void main(String[] args) throws IOException {
    	 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner(System.in);
         
         double R, A;
         double N = 3.14159;
         
         R = input.nextDouble();
         
         A = N * Math.pow(R, 2);
         
         System.out.printf("%s%.4f%n", "A=", A);
 
         input.close();
    }

}
