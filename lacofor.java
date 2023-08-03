package JavaTech;

import java.util.Scanner;

public class lacofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,x,contImpar=0,contPar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=10;x++) { 
		
		System.out.print("Escreva o numero:");
		numero = leia.nextInt();
		
		if (numero %2==0) {
			contPar ++;
			
		} 
		else {
			contImpar++;
		}

		}
		System.out.println("A quantidade de numeros pares é: "+contPar);
		
		System.out.println("A quantidade de numeros impares é: "+contImpar);
		}
		
	
}			
		
		
			
						
		
