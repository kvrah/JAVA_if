package Classe;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	private String setor;
	private String turno;
	
	
	public Funcionario(String nome, double salario, String cargo, String setor, String turno) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.setor = setor;
		this.turno = turno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public void impressao() {
		System.out.println("\nNome do funcionario :"+nome+"\n Tem o cargo: "+cargo+"\n Recebe o salário de:"+this.formatarMoeda()+"\n Trabalha no departamento : "+setor+"\n Trabalha no turno :"+turno);
	
	}
	
}
	

