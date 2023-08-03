package JavaTech;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2=0;
		float media,n3=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Escreve um numero: ");
			n1 = leia.nextInt();
			
			if(n1%3 ==0 && n1>0) {
			 n2 += n1; //n2 = n2+n1
			 	n3++; //n3 = n3+1	
			}	
			} while(n1>0 || n1<0);
			
			media = n2 / n3;
			System.out.printf("\nA media dos multiplos de 3 é de: %.2f",media);
		
		
	}

}
