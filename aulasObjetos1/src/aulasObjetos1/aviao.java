package aulasObjetos1;

public class aviao {

	
	public String corDoAviao;
	public String nomeDoAviao;
	public String voar;
	public int limitesPassageiros;
	public String segurança;
	public void construtor () {
		
		corDoAviao = "Azul";
		nomeDoAviao = "Airbus A380";
		voar = "Sim";
		limitesPassageiros = 853;
		segurança = "É um dos Transportes mais seguros do mundo.";
		
		System.out.println("\na Cor do Avião : "+corDoAviao);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nNome do maior Avião do mundo: "+nomeDoAviao);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nEle Voa?: "+voar);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nLimites de Passageiros no Avião: "+limitesPassageiros);
		System.out.println("-------------------------------------------------------");
		System.out.println("\nÉ uma forma segura de viajar? : "+segurança);
	}
}
