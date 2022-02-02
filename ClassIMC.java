package IMC;

public class ClassIMC {
	
	private Double pesoAtual;//
	private Integer semana;
	private Double altura;
	private Double pesoI;
	private static double tab[][] = {
            {6,19.9,20,24.9,25,30,30.1},
            {8,20.1,20.2,25,25.1,30.1,30.2},
            {10,20.2,20.3,25.2,25.3,30.2,30.3},
            {11,20.3,20.4,25.3,25.4,30.3,30.4},
            {12,20.4,20.5,25.4,25.5,30.3,30.4},
            {13,20.6,20.7,25.6,25.7,30.4,30.5},
            {14,20.7,20.8,25.7,25.8,30.5,30.6},
            {15,20.8,20.9,25.8,25.9,30.6,30.7},
            {16,21,21.1,25.9,26,30.7,30.8},
            {17,21.1,21.2,26,26.1,30.8,30.9},
            {18,21.2,21.3,26.1,26.2,30.9,31},
            {19,21.4,21.5,26.2,26.3,30.9,31},
            {20,21.5,21.6,26.3,26.4,31,31.1},
            {21,21.7,21.8,26.4,26.5,31.1,31.2},
            {22,21.8,21.9,26.6,26.7,31.2,31.3},
            {23,22,22.1,26.8,26.9,31.3,31.4},
            {24,22.2,22.3,26.9,27,31.5,31.6},
            {25,22.4,22.5,27,27.1,31.6,31.7},
            {26,22.6,22.7,27.2,27.3,31.7,31.8},
            {27,22.7,22.8,27.3,27.4,31.8,31.9},
            {28,22.9,23,27.5,27.6,31.9,32},
            {29,23.1,23.2,27.6,27.7,32,32.1},
            {30,23.3,23.4,27.8,27.9,32.1,32.2},
            {31,23.4,23.5,27.9,28,32.2,32.3},
            {32,23.6,23.7,28,28.1,32.3,32.4},
            {33,23.8,23.9,28.1,28.2,32.4,32.5},
            {34,23.9,24,28.3,28.4,32.5,32.6},
            {35,24.1,24.2,28.4,28.5,32.6,32.7},
            {36,24.2,24.3,28.5,28.6,32.7,32.8},
            {37,24.4,24.5,28.7,28.8,32.8,32.9},
            {38,24.5,24.6,28.8,28.9,32.9,33},
            {39,24.7,24.8,28.9,29,33,33.1},
            {40,24.9,25,29.1,29.2,33.1,33.2},
            {41,25,25.1,29.2,29.3,33.2,33.3},
            {42,25,25.1,29.2,29.3,33.2,33.3},
          };
	public ClassIMC (Integer semana, Double altura, Double pesoAtual,Double pesoI) {
		super();
		this.semana = semana;
		this.altura = altura;
		this.pesoAtual = pesoAtual;
		this.pesoI = pesoI;
	}
	public Double getPesoI() {
		return pesoI;
	}
	public void setPesoI(Double pesoI) {
		this.pesoI = pesoI;
	}
	public Double getPesoAtual() {
		return pesoAtual;
	}
	public void setPesoAtual(Double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
	public Integer getSemana() {
		return semana;
	}
	public void setSemana(Integer semana) {
		this.semana = semana;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public double[][] getTab() {
		return tab;
	}
	public void setTab(double[][] tab) {
		this.tab = tab;
	}
	public Double getImc() {
		Double Imc = pesoAtual / (altura*altura);
		for(int x=0; x<tab.length;x++) {
			if(tab[x][0] == semana) {
				if(Imc< tab[x][2]) {
					System.out.println("\nVocê está com baixo peso!");
				}else if (Imc < tab[x][4]) {
					System.out.println("\nVocê está com o peso adequado!");
				}else if (Imc < tab[x][6]) {
					System.out.println("\nVocê está com sobre peso!");
				}else {
					System.out.println("\nVocê está com obesidade!");
				}
			}
		}
		return Imc;
	}
 }



