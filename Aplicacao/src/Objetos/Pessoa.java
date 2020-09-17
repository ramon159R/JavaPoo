package Objetos;

public class Pessoa {
	
	private String nome;
	private String enderešo;
	private int telefone;
	
	public Pessoa () {
		
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}
	public Pessoa(String nome, String enderešo, int telefone) {
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
