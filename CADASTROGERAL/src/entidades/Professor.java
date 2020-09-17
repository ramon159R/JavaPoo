package entidades;

public class Professor extends Pessoa {

	private String materialLecionada;
	private boolean mestre;
	
	public Professor(String nome, String materialLecionada) {
		super(nome);
		this.materialLecionada = materialLecionada;
		
		
	}

	public String getMaterialLecionada() {
		return materialLecionada;
	}

	public void setMaterialLecionada(String materialLecionada) {
		this.materialLecionada = materialLecionada;
	}
	
	
}
