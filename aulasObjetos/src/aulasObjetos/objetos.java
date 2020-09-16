package aulasObjetos;

import java.util.Scanner;

public class objetos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		cliente primeiraClasse = new cliente();
		
		System.out.println("\n-------------Bem-Vindo a Generation!-------------");
		System.out.println("\nMe Informe o seu nome: ");
		primeiraClasse.nomeAluno = ler.next().toUpperCase();
		System.out.println("\nQual ano você nasceu? ");
		primeiraClasse.anoDeNascimento = ler.nextInt();
		System.out.println("\nDigite o seu Sexo [M]-Masculino | [F]-Femenino ");
		primeiraClasse.sexoDaPessoa = ler.next().toUpperCase().charAt(0);

		primeiraClasse.generoSexo();
		System.out.println("\n----------------------------Informação Basica-------------------------------");
		System.out.println("\nMe informe [S]-Ja estudei Java | [N]-Nunca ");
		primeiraClasse.objetivosDoCurso = ler.next().toUpperCase().charAt(0);
		primeiraClasse.dificuldade();
		
		ler.close();
	}

}
