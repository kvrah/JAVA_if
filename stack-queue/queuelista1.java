package Queuelista;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queuelista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		

		do {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cliente na Fila            ");
			System.out.println("            2 - Listar todos os clientes             ");
			System.out.println("            3 - Retirar Cliente da fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\nAdicione o nome do cliente: ");
				String nome = leia.next();
				fila.add(nome);
				break;
			case 2:
				System.out.println("\nOs clientes da fila são: "+fila);
				break;
			case 3:
				System.out.println("\nO cliente foi chamado ! \n"+fila.poll());
				break;
			}
		}while(opcao!=0);
		System.out.println("\n Programa Finalizado!");

		
		
		
		
	}

}
