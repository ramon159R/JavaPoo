package Aplicacao;

import java.util.ArrayList;
import java.util.List;

public class testeAnimal {

	public static void main(String[] args) {
			List<Animal> list = new ArrayList();
			
			list.add(new Cachorro ("O Cachorro Bakugou",17,"O Cachorro est� Latindo..","O cachorro come�ou a correr"));
			list.add(new Cavalo ("O Cavalo P� de Pano",20,"O Cavalo est� Relichando..","O cavalo est� correndo.."));
			list.add(new Preguica ("A Pregui�a Deku",15,"A pregui�a est� fazendo um barulho estranho..","Agora ela esta subindo na arvore.."));
			
			for (Animal animal :list)
			{
				System.out.println("\n--------------"+animal.getNome()+"-------------\n"+""+animal.getIdade()+" Anos. "+"\n"+animal.getSom()+"\n"+animal.getCorrer());
			}

	}

}
