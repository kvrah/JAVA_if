package Classe;

public class pessoaFisica extends ClasseCliente {
	
	private String cpf;
	
	public pessoaFisica (String nome, String sexo, int idade, long telefone, String endereco, String cpf) {
		super(nome, sexo, idade, telefone, endereco);
		this.cpf = cpf;
		
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.println("\n"+getNome()+" do sexo "+getSexo()+" tem  "+getIdade()+
				" e numero de "+this.formatarTelefone()+" Mora no endereço :"+getEndereco()+cpf);
}
}