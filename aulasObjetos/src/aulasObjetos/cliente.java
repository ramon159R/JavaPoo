package aulasObjetos;

public class cliente {

	public String nomeAluno;
	public int anoDeNascimento;
	public String forma��oAcademica;
	public char sexoDaPessoa;
	public char objetivosDoCurso;
	
	public void generoSexo () {
		
		if (sexoDaPessoa == 'M')
		{
			System.out.printf("\nOi %s Como vai meu amigo?, Sua idade � %d anos Correto? Vamos continuar.",nomeAluno,(2020-anoDeNascimento));
			
		}
		else if (sexoDaPessoa == 'F')
		{
			System.out.printf("\nOi %s Como vai minha amiga?, Sua idade � %d anos Correto? Vamos continuar.",nomeAluno,(2020-anoDeNascimento));
		}
		
	}
	public void dificuldade () {
		
		if (objetivosDoCurso == 'S')
		{
			System.out.printf("Que �timo %s, voc� vai ter menos dificuldade com o conte�do que n�s iremos passar!",nomeAluno);
		}
		else if (objetivosDoCurso =='N')
		{
			System.out.printf("Sem Problemas %s, N�s vamos passar conteudos que todos poder� aprender mesmo que n�o saiba sobre nada!",nomeAluno);
		}
	}
		

}
