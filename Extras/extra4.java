package JavaTech;

import java.util.Scanner;

public class extra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,n4;
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nDigite o primeiro numero: ");
		n1 = (float)leia.nextFloat();
		System.out.println("\nDigite o segundo numero: ");
		n2 = (float)leia.nextFloat();
		System.out.println("\nDigite o terceiro numero: ");
		n3 = (float)leia.nextFloat();
		System.out.println("Digite o quarto numero: ");
		n4 = (float)leia.nextFloat();
		
		float n5 = ((n1*n2)-(n3*n4));
		System.out.println("\n O resultado final foi de: "+n5);
	
		
	}

}
