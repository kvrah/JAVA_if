package JavaTech;

import java.util.Scanner;

public class exercicioextra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario,abono;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = (float) leia.nextFloat();
		System.out.println("\nDigite o valor do abono: ");
		abono = (float) leia.nextFloat();
		
		float novosalario = (salario+abono);
		System.out.println("\nO valor que receberá será de: "+novosalario);
		
		
		
		
		
		
		
		
	}

}
