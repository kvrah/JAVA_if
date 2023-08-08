package Queuelista;

import java.util.Scanner;
import java.util.Stack;

public class stackpilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String livro;
		
		
		do {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro na pilha             ");
			System.out.println("            2 - Listar todos os Livros               ");
			System.out.println("            3 - Retirar Livro da Pilha               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
                System.out.println("Digite o nome do livro: ");
                livro = leia.next();
                pilha.push(livro);
                System.out.println("\n Livro adicionado");
                break;
			case 2:
				System.out.println("\nOs livros da fila são: "+pilha);
				break;
			case 3:
				System.out.println("\nO livro retirado foi !"+pilha.pop());
				break;
			}
		}while(opcao!=0);
		System.out.println("\n Programa Finalizado!");
		leia.close();
	}
	

}
