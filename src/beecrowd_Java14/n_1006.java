package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1006 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub 

		Scanner in = new Scanner(System.in);
		
		double A, B, C, MEDIA;
		
		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		
		MEDIA = ((A*2)+(B*3)+(C*5))/(2+3+5);
		
		System.out.printf("%s%,.1f%n", "MEDIA = ", MEDIA);
		
		in.close();
	}
}
