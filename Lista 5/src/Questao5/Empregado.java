package Questao5;

public class Empregado {
	
	public int id;
	public String nome;
	public String sobrenome;
	public double salario;
	public boolean vet[] = new boolean[30];
	public int pres,falta;
	
	
	public Empregado(int id, String nome, String sobrenome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public void preencher() {
		
		for(int i = 0;i<25;i++) {
			
			vet[i] = true;
		}for(int i = 25;i<30;i++) {
			
			vet[i] = false;
		}
	}
	
	public void avaliar() {
		preencher();
		
		pres = 0;
		falta = 0;
		for(boolean mostra : vet) {
			
			if(mostra == true) {
				
				pres++;
			}else {
				falta++;
			}
			
		}
		
		if(pres == 30) {
			
			this.salario = salario * 1.1;
		}else if(25<= pres && pres<=27) {
			
			this.salario = salario * (1-(falta*0.02));	
		}else if(20<= pres && pres<=24){
			
			this.salario = salario * (1-(falta*0.03));
		}else {
			
			this.salario = salario * 0.2;
		}
		
	}
	
	public void rodar() {
		avaliar();
		
		System.out.println("O seu Salario: " + salario);
		
	}
}
