package Entidades;

public class Terceiro extends Funcionario {
	
	
	private double horasAdicionais;

	public Terceiro () {
		
	}
	public Terceiro(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	@Override
	public double pagamento () 
	{
		return super.pagamento() + this.horasAdicionais * super.getValorPorHora();
		//return this.horasTrabalhadas*this.valorPorHora;
	}
}
