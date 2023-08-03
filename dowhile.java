package JavaTech;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,resultado=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEscreva o número: ");
			numero = leia.nextInt();
			
			if(numero>0) {
				if(numero %2 !=0) {
					resultado += numero;
				}
				}
			}	while (numero < 0 || numero > 0);
			
			
			System.out.println("\nA soma dos numeros positivos foi de: "+resultado);
		
		}
	}
	


