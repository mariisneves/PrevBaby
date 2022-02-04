package projetoJava;

public class Glicose extends Gravidez{
	
	protected int glicose;
	
	public Glicose(int glicose) {
		this.glicose = glicose;
	}
	
	public void medirGlicose(int glicose) {
		if (glicose <= 91) {
			System.out.println("O valor está dentro do esperado.");
		} else {
			System.out.println("O valor está acima do esperado.");
		}
	}

	public int getGlicose() {
		return glicose;
	}

	public void setGlicose(int glicose) {
		this.glicose = glicose;
	}

	@Override
	public void calculoImc(int semana, double pesoAtual, double pesoPre, double altura) {
	}
	
	

}
