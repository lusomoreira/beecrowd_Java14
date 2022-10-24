package beecrowd_Java14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class n_1001 {
 
    public static void main(String[] args) throws IOException {
    	 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        int A, B, X;
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        
        X = A + B;
        
        System.out.printf("X = %d\n", X);        
    }
 
}