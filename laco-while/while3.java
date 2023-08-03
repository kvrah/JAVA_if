package JavaTech;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=1,menores=0,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while (idade>=0) {
			System.out.println("Digite a idade (para encerrar digite um numero negativo): ");
		idade = leia.nextInt();
						

		if (idade <= 21) {
			menores++;
		}
	    if (idade >=50) {
			maior++;
		}
		else if (idade < 0) {
		}
	    
		}
			System.out.println("O total de pessoas menores de 21 anos é de: "+menores);
			System.out.println("O total de pessoas maiores de 50 anos é de: "+maior);
		}
	}

