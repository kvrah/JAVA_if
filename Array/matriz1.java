package JavaTech;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [][] notas = new float [10][4];
		float media [] = new float [10];
		float soma [] = new float [10];
		int aluno,nota;
		
		Scanner leia = new Scanner(System.in);
		
		for(aluno=0;aluno<10;aluno++) {
			for(nota=0;nota<4;nota++) {
				 System.out.println("\n Digite a "+(nota+1)+"ª nota do aluno"+(aluno+1)+" :");
				 notas[aluno][nota] = leia.nextFloat();
				 
				soma[aluno] += notas[aluno][nota];
			}
		}
		 System.out.println("\nAs medias foram :");
		 for(aluno=0;aluno<10;aluno++) {
			 media[aluno] = soma[aluno] / 4;
			 
			 System.out.printf("[%.1f]",media[aluno]);
		 }
						
			}
			
	}

