package JavaTech.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		
		for (int x=0;x<10;x++) {
		System.out.println("\nDigite o numero desejado: ");
		
		int number = leia.nextInt();
		numeros.add(number);
			
		}
		System.out.println(numeros);
		leia.close();

	}

}
