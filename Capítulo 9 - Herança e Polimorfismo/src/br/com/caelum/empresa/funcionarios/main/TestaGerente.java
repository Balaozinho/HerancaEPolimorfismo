package br.com.caelum.empresa.funcionarios.main;

import br.com.caelum.empresa.funcionarios.Funcionario;
import br.com.caelum.empresa.funcionarios.Gerente;

public class TestaGerente{
	public static void main (String [] args){
		
		Gerente g1 = new Gerente ();
		Funcionario funcionario = g1;
		
		g1.setNome("Alvaro");
		g1.setNumeroDeFuncionariosGerenciados(3);
		g1.setSenha(1234);
		g1.setSalario(1000);
		
		
		System.out.println("Nome do Gerente: " + funcionario.getNome());
		System.out.println("Gerencia : " + g1.getNumeroDeFuncionariosGerenciados());
		System.out.println("Bonificação: " + funcionario.getBonificacao());
		System.out.println("Salario: " + funcionario.getSalario());
		
	}
}

//Note a utilização do polimorfismo quando criado um gerente e referenciado como funcionario 
//As impressões só precisa declarar o funcionario, pq um gerente é um funcionario!