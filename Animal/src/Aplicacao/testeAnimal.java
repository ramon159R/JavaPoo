package Aplicacao;

import java.util.ArrayList;
import java.util.List;

public class testeAnimal {

	public static void main(String[] args) {
			List<Animal> list = new ArrayList();
			
			list.add(new Cachorro ("O Cachorro Bakugou",17,"O Cachorro está Latindo..","O cachorro começou a correr"));
			list.add(new Cavalo ("O Cavalo Pé de Pano",20,"O Cavalo está Relichando..","O cavalo está correndo.."));
			list.add(new Preguica ("A Preguiça Deku",15,"A preguiça está fazendo um barulho estranho..","Agora ela esta subindo na arvore.."));
			
			for (Animal animal :list)
			{
				System.out.println("\n--------------"+animal.getNome()+"-------------\n"+""+animal.getIdade()+" Anos. "+"\n"+animal.getSom()+"\n"+animal.getCorrer());
			}

	}

}
