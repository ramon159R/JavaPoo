package Objetos;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endere�o, int telefone, int codigoSetor, int salarioBase, int imposto) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public double calculo(double salarioBase, double imposto) {
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		return salarioBase - (salarioBase *imposto );
	}
	
}
