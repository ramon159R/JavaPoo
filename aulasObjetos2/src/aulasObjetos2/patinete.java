package aulasObjetos2;

public class patinete {
	
	public String corPatinete;
	public String freios;
	public String rodinhas;
	public String tamanho;
	
	public void construcao () {
		
		corPatinete = "Preto";
		freios = "Se for Automatico Sim, senão Freia com o pé. ";
		rodinhas = "sim";
		tamanho = "Tamanho Adulto ou Criança";
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Cor do patinete: "+corPatinete);
		System.out.println("\n-------------------------------------------------------");
		System.out.println("O Patinete tem Freios?: "+freios);
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Patinete usa Rodinhas para se Locomover?: "+rodinhas);
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Qual o Tamanho de um Patinete?: "+tamanho);
	}
}
