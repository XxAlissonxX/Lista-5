package Questao2;

public class Organizar  {
	
	public void Montar() {
		
		Pessoa p = new Pessoa ();
		System.out.println("Nome:"+p.informaNome("Albert Einstein"));
		p.ajustaDataDeNascimento(14, 3, 1879);
		System.out.println("Idade:"+p.calculaIdade(10, 11, 2022)+"\n");
		
		Pessoa p2 = new Pessoa ();
		System.out.println("Nome:"+p2.informaNome("Isaac Newton"));
		p2.ajustaDataDeNascimento(4, 1, 1643);
		System.out.println("Idade:"+p2.calculaIdade(10, 11, 2022));
	}
	
}
