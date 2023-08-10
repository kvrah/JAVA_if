package Classe;

public class pessoaJuridica extends ClasseCliente {
	
	private String cnpj;

	public pessoaJuridica(String nome, String sexo, int idade, long telefone, String endereco, String cnpj) {
		super(nome, sexo, idade, telefone, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void imprimirInformacao() {
		System.out.println("\nEmpresa "+getNome()+" inscrita no cnpj : "+cnpj+" numero "+this.formatarTelefone()+" no endereço :"+getEndereco());
	}

	
	
}
