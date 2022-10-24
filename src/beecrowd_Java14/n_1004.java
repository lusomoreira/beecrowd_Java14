package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1004 {

    public static void main(String[] args) throws IOException {
    	 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner(System.in);
         
         int A, B, PROD;
         
         A = input.nextInt();
         B = input.nextInt();
         
         PROD = A * B;
         
         System.out.printf("%s%d%n", "PROD = ", PROD);
         
         input.close();
 
    }
}
