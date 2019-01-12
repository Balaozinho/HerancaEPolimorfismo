package br.com.caelum.empresa.funcionarios;

public abstract class Funcionario {
	
	//modificador de acesso abstract impede que a classe pode ser instanciada 
	//Se Funcionario f1 = new Funcionario (), não compila mais!! 
	//Não podendo ser instanciada, posso trabalhar com polimorfismo e herança
	
	protected String nome;
	protected String CPF;
	protected double salario;
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public void setCPF (String CPF){
		this.CPF = CPF;
	}

	public void setSalario (double salario){
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public double getSalario() {
		return salario;
	}
	
	public double getBonificacao(){
		return this.salario*1.2;
	}
	
}
