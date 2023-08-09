package Classe;

import java.text.DecimalFormat;

public class ClasseCliente {

	
	private String nome;
	private String sexo;
	private int idade;
	private long telefone;
	private String endereco;
	
	public ClasseCliente(String nome, String sexo, int idade, long telefone, String endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
	public void imprimirInfo() {
		System.out.println("\n"+nome+" do sexo "+sexo+" tem  "+idade+
				" e numero de telefone: "+telefone+" Mora no endereço :"+endereco);
	}
	
}
