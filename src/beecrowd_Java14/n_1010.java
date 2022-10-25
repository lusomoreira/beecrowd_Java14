package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1010 {

	public static void main(String[] args) throws IOException {
		 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         *
         * ler cod produto 1
         * ler quantidade de produto1
         * ler preco de cada unidade produto 1
         * 
         *  ler cod produt2
         *  ler quantidade de produto 2
         *  ler preco por unidade produto 2
         *  
         */
         
         Scanner in = new Scanner(System.in);
         
         String line1 = in.next();
         String line2 = in.next();
         
         
         String output = calcFinalValue(line1, line2);
         
         
         
         in.close();
  
	}
	
	public static String calcFinalValue(String x, String y) {
		
		String[] spc1 = x.split(" ");
		
		System.out.print(spc1[0]);
		
		return null;
	}
	
	

}
