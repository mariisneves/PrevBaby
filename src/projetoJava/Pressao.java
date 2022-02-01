package projetoJava;

public class Pressao extends Gravidez{
	
	private float pressaoNs;
	private float pressaoNd;
	private float pressaoAs;
	private float pressaoAd;
	
	public Pressao(String nome, int semana, double glicose, int qtdBebes, float pressaoNs, 
			float pressaoNd, float pressaoAs, float pressaoAd) {
		super(nome, semana, glicose, qtdBebes);
		this.pressaoNs = pressaoNs;
		this.pressaoNd = pressaoNd;
		this.pressaoAs = pressaoAs;
		this.pressaoAd = pressaoAd;
	}

	public float getPressaoNs() {
		return pressaoNs;
	}

	public void setPressaoNs(float pressaoNs) {
		this.pressaoNs = pressaoNs;
	}

	public float getPressaoNd() {
		return pressaoNd;
	}

	public void setPressaoNd(float pressaoNd) {
		this.pressaoNd = pressaoNd;
	}

	public float getPressaoAs() {
		return pressaoAs;
	}

	public void setPressaoAs(float pressaoAs) {
		this.pressaoAs = pressaoAs;
	}

	public float getPressaoAd() {
		return pressaoAd;
	}

	public void setPressaoAd(float pressaoAd) {
		this.pressaoAd = pressaoAd;
	}

}
