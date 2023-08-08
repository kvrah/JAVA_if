package JavaTech;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = new int[10];
		int x,coluna=0,posicao=10;
		
		vetor[0] = 2;
		vetor[1] = 5;
		vetor[2] = 1;
		vetor[3] = 3;
		vetor[4] = 4;
		vetor[5] = 9;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 10;
		vetor[9] = 6;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o numero que você deseja encontrar: ");
		x = leia.nextInt();
		
		for(coluna=0;coluna<10;coluna++) {
			if (vetor[coluna] == x) {
				posicao = coluna;
				
			}
				
		}
		
		
		if(posicao==10) {
			System.out.println("\nO numero "+x+" não foi encontrado!");
			
		}
		else {
			System.out.println("\nO numero "+x+" está na posição : "+posicao);
		}
		

			
		
		
	}
	}


