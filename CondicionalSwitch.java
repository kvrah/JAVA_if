package JavaTech;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2;
		int n3=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com valor de n1: ");
		n1 = (float) leia.nextFloat();
		System.out.println("\nEntre com valor de n2: ");
		n2 = (float) leia.nextFloat();
		System.out.println("\nEntre com valor de n3: ");
		n3 = (int) leia.nextFloat();
		
		switch(n3) {
		case 1: 
			System.out.println(n1+n2);
		break;
		case 2: 
			System.out.println(n1-n2);
		break;
		case 3: 
			System.out.println(n1*n2);
		break;
		case 4: 
			System.out.println(n1/n2);
		break;
		default:
			System.out.println("Operação inválida");
	
		}
	
	}

}
