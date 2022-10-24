package beecrowd_Java14;

import java.io.IOException;
import java.util.Scanner;

public class n_1005 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub 

		Scanner in = new Scanner(System.in);
		
		double A, B, MEDIA;
		
		A = in.nextDouble();
		B = in.nextDouble();
		
		MEDIA = ((A*3.5)+(B*7.5))/(3.5+7.5);
		
		System.out.printf("%s%,.5f%n", "MEDIA = ", MEDIA);
		
		in.close();
	}

}
