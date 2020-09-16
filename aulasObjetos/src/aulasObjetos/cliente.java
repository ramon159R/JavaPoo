package aulasObjetos;

public class cliente {

	public String nomeAluno;
	public int anoDeNascimento;
	public String formaçãoAcademica;
	public char sexoDaPessoa;
	public char objetivosDoCurso;
	
	public void generoSexo () {
		
		if (sexoDaPessoa == 'M')
		{
			System.out.printf("\nOi %s Como vai meu amigo?, Sua idade é %d anos Correto? Vamos continuar.",nomeAluno,(2020-anoDeNascimento));
			
		}
		else if (sexoDaPessoa == 'F')
		{
			System.out.printf("\nOi %s Como vai minha amiga?, Sua idade é %d anos Correto? Vamos continuar.",nomeAluno,(2020-anoDeNascimento));
		}
		
	}
	public void dificuldade () {
		
		if (objetivosDoCurso == 'S')
		{
			System.out.printf("Que ótimo %s, você vai ter menos dificuldade com o conteúdo que nós iremos passar!",nomeAluno);
		}
		else if (objetivosDoCurso =='N')
		{
			System.out.printf("Sem Problemas %s, Nós vamos passar conteudos que todos poderá aprender mesmo que não saiba sobre nada!",nomeAluno);
		}
	}
		

}
