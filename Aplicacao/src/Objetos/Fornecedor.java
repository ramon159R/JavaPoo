package Objetos;

public class Fornecedor extends Pessoa {
	
	
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	

	public Fornecedor(String nome, String endereço, int telefone, double valorCredito, double valorDivida,
		 double obterSaldo) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}


	public double getObterSaldo() {
		return obterSaldo;
	}


	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	public double obterSaldo(double valorDivida, double valorCredito) {
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		return  valorCredito - valorDivida;
	}
	
	
}
