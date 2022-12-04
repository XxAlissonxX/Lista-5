package Questao3;

public class Circulo {
	
	public double raio,perc,area;
	
	public double area(double raio) {
		
		area = (raio*raio*3.14);
		return area;
	}
	public double circun(double raio) {
		
		area = 2*raio*3.14;
		return area;
	}
	
	//Fornaça o perc em porcentagem.
	public double aumentar(double perc,double raio) {
		
		this.perc = (perc/100)+1;	
		raio = raio * this.perc;
		return raio;
	}
}
