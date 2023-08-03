package JavaTech;

import java.util.Scanner;

public class TarefaIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A , B , C ;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com valor de A: ");
		A = (int) leia.nextFloat();
		System.out.println("\nEntre com valor de B: ");
		B = (int) leia.nextFloat();
		System.out.println("\nEntre com a vaor de C: ");
		C = (int) leia.nextFloat();
						
		soma=A+B;
		
		if(soma>C)
		System.out.println("A Soma é maior que C");
			
		else if(soma<C)
		System.out.println("A soma é menor que C");
		
		else
		System.out.println("A soma é igual a C");
		
		
		
	
		
				
				
	}

}
