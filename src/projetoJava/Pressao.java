package projetoJava;

public class Pressao extends Gravidez {

	protected int semana;
	protected double sis1;
	protected double sis2;
	protected double dis1;
	protected double dis2;
	protected double trimestre;

	public Pressao(int semana, double sis1, double sis2, double dis1, double dis2, double trimestre) {
		this.semana = semana;
		this.sis1 = sis1;
		this.sis2 = sis2;
		this.dis1 = dis1;
		this.dis2 = dis2;
		this.trimestre = trimestre;
	}

	public int trimestre() {
		if (getSemana() <= 14) {
			trimestre = 1.5;
		} else if (getSemana() >= 15 && getSemana() <= 28) {
			trimestre = 3;
		} else if (getSemana() >= 29 && getSemana() <= 42) {
			trimestre = 0;
		}
		return (int) trimestre;
	}

	public void medirSis() {
		if (getSis2() < (getSis1() - trimestre) - 3) {
			System.out.print("\nSua pressão sistólica está abaixo do esperado para a semana");
		} else if (getSis2() > (getSis1() - trimestre) + 3) {
			System.out.print("\nSua pressão sistólica está acima do esperado para a semana");
		} else {
			System.out.print("\nSua pressão sistólica está dentro do esperado para a semana");
		}

	}

	public void medirDis() {
		if (getDis2() < (getDis1() - trimestre) - 3) {
			System.out.print("\nSua pressão diastólica está abaixo do esperado para a semana");
		} else if (getDis2() > (getDis1() - trimestre) + 3) {
			System.out.print("\nSua pressão diastólica está acima do esperado para a semana");
		} else {
			System.out.print("\nSua pressão diastólica está dentro do esperado para a semana");
		}

	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public double getSis1() {
		return sis1;
	}

	public void setSis1(double sis1) {
		this.sis1 = sis1;
	}

	public double getSis2() {
		return sis2;
	}

	public void setSis2(double sis2) {
		this.sis2 = sis2;
	}

	public double getDis1() {
		return dis1;
	}

	public void setDis1(double dis1) {
		this.dis1 = dis1;
	}

	public double getDis2() {
		return dis2;
	}

	public void setDis2(double dis2) {
		this.dis2 = dis2;
	}

	public double getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(double trimestre) {
		this.trimestre = trimestre;
	}

	@Override
	public void calculoImc(int semana, double pesoAtual, double pesoPre, double altura) {
		// TODO Auto-generated method stub

	}

}
