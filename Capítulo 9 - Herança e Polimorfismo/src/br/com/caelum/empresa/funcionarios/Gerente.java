package br.com.caelum.empresa.funcionarios;

public class Gerente extends Funcionario {
	
	private int senha;
	private int NumeroDeFuncionariosGerenciados;
	
	public boolean autentica (int senha){
		if (this.senha == senha){
			System.out.println("Acesso Permitido");
			return true;
		}
		else {
			System.out.println("Acesso Negado");
			return false;
		}
	}
	
		
	//@override
	public double getBonificacao(){
		return super.getBonificacao()*1.4 + 1000;
	}
	
	//M�todo super acesso o m�todo da classe m�e, e acoplo o c�digo antigo, sem necessidade de reescrever
		
	public void setNumeroDeFuncionariosGerenciados(int NumeroDeFuncionariosGerenciados){
		this.NumeroDeFuncionariosGerenciados = NumeroDeFuncionariosGerenciados;
	}

	
	public int getNumeroDeFuncionariosGerenciados() {
		return NumeroDeFuncionariosGerenciados;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}



