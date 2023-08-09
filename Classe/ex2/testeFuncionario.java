package Classe;

public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario [] lista = new Funcionario[4];
		
		lista[0] = new Funcionario("Richard",30000,"diretor","diretoria geral","horario comercial");
		lista[1] = new Funcionario("Luan",10000,"auditor","fiscal","horario comercial");
		lista[2] = new Funcionario("Vinicios",5000,"programador jr","desenvolvimento","horario comercial");
		lista[3] = new Funcionario("Guilherme",20000,"diretor comercial","comercial","horario comercial");
		
		for (Funcionario roda:lista) {
			roda.impressao();
			System.out.println("\n*************************************************");
		}
	}

}
