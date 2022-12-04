package Questao4;

public class Produto {
	
	public String nome;
	public float pc,pv,ml,despesas;
	
	public Produto(String nome, float pc, float pv) {
		super();
		this.nome = nome;
		this.pc = pc;
		this.pv = pv;
	}
		
	public void calculoML() {
		
		this.despesas = pc;
		//A formula do ml aparenta estar errada
		//pq nao tem pq fazer pc + d , pois pc e despesas sao a mesma coisa.
		this.ml=((pv-(pc))/pv)*100;
	}
	public void imprimir() {
		
		calculoML();
		System.out.println("Nome: "+ nome);
		System.out.println("Magen de Lucro: "+ml+"%");
	}
}
