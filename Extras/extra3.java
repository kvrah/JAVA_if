package JavaTech;

import java.util.Scanner;

public class extra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salariobruto,noturno,horaextra,desconto;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o salario Bruto: ");
		salariobruto = (float)leia.nextFloat();
		System.out.println("\nDigite o valor do adicional noturno: ");
		noturno = (float)leia.nextFloat();
		System.out.println("\nDigte o valor das horas extras:");
		horaextra = (float)leia.nextFloat();
		System.out.println("Digite o valor dos descontos: ");
		desconto = (float)leia.nextFloat();
		
		float salarioliquido = (salariobruto+noturno+horaextra-desconto);
		System.out.println("\nO salário liquido será de: "+salarioliquido);
		
		
		
		
	}

}
