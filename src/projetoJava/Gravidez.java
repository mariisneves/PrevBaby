package projetoJava;

public class Gravidez {
	
	private String nome;
	private int semana;
	private double glicose;
	private int qtdBebes;
	
	public Gravidez (String nome, int semana, double glicose, int qtdBebes) {
		super();
		this.nome = nome;
		this.semana = semana;
		this.glicose = glicose;
		this.qtdBebes = qtdBebes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public double getGlicose() {
		return glicose;
	}

	public void setGlicose(double glicose) {
		this.glicose = glicose;
	}

	public int getQtdBebes() {
		return qtdBebes;
	}

	public void setQtdBebes(int qtdBebes) {
		this.qtdBebes = qtdBebes;
	}
	
	
}
