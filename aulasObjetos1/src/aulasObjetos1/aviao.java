package aulasObjetos1;

public class aviao {

	
	public String corDoAviao;
	public String nomeDoAviao;
	public String voar;
	public int limitesPassageiros;
	public String seguran�a;
	public void construtor () {
		
		corDoAviao = "Azul";
		nomeDoAviao = "Airbus A380";
		voar = "Sim";
		limitesPassageiros = 853;
		seguran�a = "� um dos Transportes mais seguros do mundo.";
		
		System.out.println("\na Cor do Avi�o : "+corDoAviao);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nNome do maior Avi�o do mundo: "+nomeDoAviao);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nEle Voa?: "+voar);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nLimites de Passageiros no Avi�o: "+limitesPassageiros);
		System.out.println("-------------------------------------------------------");
		System.out.println("\n� uma forma segura de viajar? : "+seguran�a);
	}
}
