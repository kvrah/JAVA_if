package Classe;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClasseCliente[] lista = new ClasseCliente[3];
		 
		lista[0] = new ClasseCliente("Richard","masculino",29,11945678903L,"R. Gen,123");
		lista[1] = new ClasseCliente("Alessandro","masculino",26,11912345678L,"R. Teste,457");
		lista[2] = new ClasseCliente("Carolina","femino",23,11923456789L,"R. Algum lugar,333");
		
		for(ClasseCliente roda:lista) {
			roda.imprimirInfo();
		}
	}
}
