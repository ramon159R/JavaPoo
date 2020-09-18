package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.Terceiro;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Funcionario colaborador1 = new Funcionario();
		//Funcionario colaborador2 = new Funcionario("MARIA");
		//Funcionario colaborador3 = new Funcionario("PEDRO",40,30.5);
		//Terceiro terceiro1 = new Terceiro("ZÉ",20,10,5.5);
		
		
		//System.out.println(colaborador2.getNome());
		//System.out.printf("%s vc vai receber %.2f ",colaborador2.getNome(),colaborador2.pagamento());
		//System.out.println(terceiro1.getNome());
		int n;
		char ch;
		String nome;
		int hora;
		double valor;
		double valorExtra;
		
		
		List<Funcionario> List = new ArrayList<>();
		
		System.out.println("Digite o numero de Funcionarios: ");
		n = ler.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			System.out.println("Digite o nome do Funcionario: "+i+" :");
			System.out.println("Terceiro [S/N]");
			ch = ler.next().toUpperCase().charAt(0);
			System.out.println("Nome :");
			nome = ler.next();
			System.out.println("Horas Trabalhadas: ");
			hora = ler.nextInt();
			System.out.println("Valor da Hora Trabalhada: ");
			valor = ler.nextDouble();
			
			if (ch == 'S')
			{
				System.out.println("Digite o Valor extra adicional: ");
				valorExtra = ler.nextDouble();
				
				List.add(new Terceiro(nome, hora, valor,valorExtra));
			}
			else
			{
				List.add(new Funcionario(nome, hora, valor));
			}
			
		}
			System.out.println();
			System.out.println("Pagamentos");
			for (Funcionario func : List) 
			{
				System.out.println(func.getNome()+" "+func.pagamento());
			}
				ler.close();
	}

}
