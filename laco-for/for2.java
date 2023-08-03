package JavaTech;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3=0;
		
		Scanner leia = new Scanner(System.in);
				
				System.out.println("Escreva o primeiro numero: "); //inicio em 10
				n1 = leia.nextInt();
				
				System.out.println("Escreva o segundo numero: "); //termina em 100 
				n2 = leia.nextInt();
				
				if(n1>n2) {
					System.out.println("Intervalo inválido!");
				}else {
					
				for(n3=n1;n3<=n2;n3++) {
					if(n3%3 == 0 && n3%5 == 0) {
						System.out.println("Os numeros divisiveis são:"+n3);
					}
					
				}
				}
				
		
		
	}

}
