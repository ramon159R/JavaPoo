package aulasObjetos2;

public class patinete {
	
	public String corPatinete;
	public String freios;
	public String rodinhas;
	public String tamanho;
	
	public void construcao () {
		
		corPatinete = "Preto";
		freios = "Se for Automatico Sim, sen�o Freia com o p�. ";
		rodinhas = "sim";
		tamanho = "Tamanho Adulto ou Crian�a";
		
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
