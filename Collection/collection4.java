package JavaTech.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x;

        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite um numero: ");
        x = leia.nextInt();
        
        for (Integer lista:numeros) 
        	if (numeros.contains(x)) {
        System.out.println("\n o numero " + x +" foi encontrado");
        break;
        
	} else {
        	System.out.println("o numero "+ x +" nao foi encontrado");
        	break;
        }
        
	}
}

