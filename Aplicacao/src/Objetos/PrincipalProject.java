package Objetos;

public class PrincipalProject {

	public static void main(String[] args) {
		
		Pessoa pessoaMain = new Pessoa("ragnar lothbrok","Escandin�via",911);
		Fornecedor fornecedorMain = new Fornecedor("Lagertha","Noruega",911,1500,900,500);
		Empregado EmpregadoMain = new Empregado("Ivar","Noruega",811,554874,20000,100);
		System.out.println("\n------------------Classe Pessoa----------------");
		System.out.println("\nNome da Pessoa:");
		System.out.println(pessoaMain.getNome());
		System.out.println("\nEndere�o:");
		System.out.println(pessoaMain.getEndere�o());
		System.out.println("\nTelefone: ");
		System.out.println(pessoaMain.getTelefone());
		System.out.println("\n-------------------Fornecedor------------------");
		System.out.println("\nNome da Pessoa: ");
		System.out.println(fornecedorMain.getNome());
		System.out.println("\nEndere�o: ");
		System.out.println(fornecedorMain.getEndere�o());
		System.out.println("\nTelefone: ");
		System.out.println(fornecedorMain.getTelefone());
		System.out.println("\nCr�dito M�ximo Disponivel: ");
		System.out.println(fornecedorMain.getValorCredito());
		System.out.println("\nSua Divida: ");
		System.out.println(fornecedorMain.getValorDivida());
		System.out.println("\nValor Restante: ");
		System.out.println(fornecedorMain.getObterSaldo());
		System.out.println("\n----------------Empregado----------------------");
		System.out.println("\nNome da Pessoa: ");
		System.out.println(EmpregadoMain.getNome());
		System.out.println("\nC�digo do Setor: ");
		System.out.println(EmpregadoMain.getCodigoSetor());
		System.out.println("\nEndere�o: ");
		System.out.println(EmpregadoMain.getEndere�o());
		System.out.println("\nTelefone: ");
		System.out.println(EmpregadoMain.getTelefone());
		System.out.println("\nSal�rio Base : ");
		System.out.println(EmpregadoMain.getSalarioBase());
		System.out.println("\nImposto: ");
		System.out.println(EmpregadoMain.getImposto());
		System.out.println("\nValor a Receber: ");
		System.out.println(EmpregadoMain.calculo(EmpregadoMain.getSalarioBase(),EmpregadoMain.getImposto()));
	}

}
