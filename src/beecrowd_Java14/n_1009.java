package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1009 {
	
	public static void main(String[] args) throws IOException {
		 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         *
         * 
         */
         String name;
         
         double salary, selling, total;
         
         Scanner in = new Scanner(System.in);
         
         name = in.next();
         salary = in.nextDouble();
         selling = in.nextDouble();
         
         
         total = salary + (selling * 0.15);
         
         System.out.printf("%s%.2f%n",
         "TOTAL = R$ ",
         total );
         
         in.close();
  
   }

}
