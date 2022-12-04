package Questao3;

public class Main {

	public void rodar() {
		
		Circulo c = new Circulo();
		
		System.out.println("Area: "+c.area(3));
		System.out.println("Circunferencia: "+c.circun(3));
		System.out.println("Nova Area: "+c.area(c.aumentar(100,3)));
		System.out.println("Nova Circunferencia: "+c.circun(c.aumentar(100,3)));
		
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.rodar();
	
	}

}
