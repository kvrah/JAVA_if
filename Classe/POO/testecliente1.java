package Classe;

public class testecliente1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pessoaFisica pessoafisica1 = new pessoaFisica("Richard","masculino",29,11970310899L,"Rua Gen,123","23498767890");
		pessoafisica1.imprimir();
		pessoaFisica pessoafisica2 = new pessoaFisica("Carolina","feminine",26,11986767898L,"Rua da brisa, 160","34567890877");
		pessoafisica2.imprimir();
		
		pessoaJuridica pessoajuridica1 = new pessoaJuridica("Generation","masculino",2,11987645638L,"Rua Teste, 234","12345678000123");
		pessoajuridica1.imprimirInformacao();
		pessoaJuridica pessoajuridica2 = new pessoaJuridica("Carnevalli","feminine",2,11987654367L,"Rua da barra, 455","34567890000144");
		pessoajuridica2.imprimirInformacao();

	}

}
