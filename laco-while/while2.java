package JavaTech;

import java.util.Scanner;

public class while2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,sexo,departamento,backend=0,frontend=0,full=0,mobile=0;
		String opcao ="S";
				
		Scanner leia = new Scanner(System.in);
		
		while (opcao.equals("S")) {
			
		System.out.println("\nColoque a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nColoque a opção refernte ao sexo: ");
		System.out.println("\n1- Masculino \n2- Feminino \n3- Outros");
		sexo = leia.nextInt();
		
		System.out.println("\nColoque a opção referente ao seu departamento: ");
		System.out.println("\n1- Backend \n2- Frontend \n3-Mobile \n4-FullStack");
		departamento = leia.nextInt();
		
		System.out.println("\nDeseja continuar? (S/N) : ");
		opcao = leia.next();
		
		if (departamento == 1) {
			backend++;
		}
		if (sexo == 2 && departamento == 2) {
			frontend++;
		}
		if (departamento == 3 && idade > 40) {
			mobile++;
		}
		else if (sexo == 2 && idade < 30) {
			full++;
			break;
		}
		
				
		

		}
		
		
		
		
	

	}

}
