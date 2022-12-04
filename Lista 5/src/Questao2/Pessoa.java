package Questao2;

public  class Pessoa {
	
	public int idade;
	public int dia;
	public int dian;
	public int mes;
	public int mesn;
	public int ano;
	public int anoNasc;
	public String nome;
			
	public String informaNome(String nome) {
		
		this.nome = nome;
		return nome;
	}
	
	public void ajustaDataDeNascimento(int dian,int mesn,int anoNasc) {
		
		this.dian = dian;
		this.mesn = mesn;
		this.anoNasc = anoNasc;
	}
	
	public int calculaIdade(int dia,int mes,int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.idade = ano - anoNasc;
		
		return idade;
	}
	
	
}
