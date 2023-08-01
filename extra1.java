package JavaTech;

import java.util.Scanner;

public class extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,nota4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		nota1 = (float) leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		nota2 = (float) leia.nextFloat();
		System.out.println("\nEntre com a nota 3 ");
		nota3 = (float) leia.nextFloat();
		System.out.println("\nEntre com a nota 4 ");
		nota4 = (float) leia.nextFloat();
		
		
		float media = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("\na média é: "+media);
		
		
	}

}
