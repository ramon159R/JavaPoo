package aplicacao;
import entidades.Aluno;
import entidades.Disciplina;
import entidades.Pessoa;
import entidades.Professor;
public class Cadastro {
	public static void main(String[] args)
	{
			
		System.out.println("SISTEMA DE CADASTRO");
		
		Pessoa fulano = new Pessoa("JOÃO");
		Pessoa Sicrano = new Pessoa("MARIA",'F',1970);
		Aluno alunoNovo = new Aluno("CARLOS",'M',2000,"BRANCO","TURMA 8");
		Professor novoProfessor = new Professor("LUIZA","MODULO ll");
		
		System.out.println(fulano.getNome());
		System.out.println(Sicrano.getNome());
		System.out.println(alunoNovo.getNome());
		System.out.println(novoProfessor.getNome());
		
	
	}
}