package projetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteGravidez2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0;
		Scanner leia = new Scanner(System.in);
		Glicose glicose = new Glicose(0);
		Pressao pressao = new Pressao(0, 0, 0, 0, 0, 0);
		ImcUni imcuni = new ImcUni(0, 0, 0, 0);
		ImcMulti imcmulti = new ImcMulti(0, 0, 0, 0);

		do {
			try {
				System.out.println("\n\n----------------- PrevBaby ---------------------");
				System.out.println("(1) Medir glicose");
				System.out.println("(2) Medir press�o");
				System.out.println("(3) Medir IMC");
				System.out.println("(0) Encerrar sistema");
//			System.out.println("\n-----------------------------------------------");
				System.out.print("\nDigite sua op��o desejada: ");
				op = leia.nextInt();

				switch (op) {
				case 1: // GLICOSE
					System.out.print("\nDigite o valor da glicose: ");
					glicose.glicose = leia.nextInt();
					glicose.medirGlicose(glicose.glicose);
					break;

				case 2: // PRESS�O
					leia.nextLine();
					System.out.printf("\nInforme em qual semana de gest�o voc� est�: ");
					pressao.semana = leia.nextInt();
					System.out.printf("Considerando sua press�o habitual, Informe sua press�o sist�lica: ");
					pressao.sis1 = leia.nextFloat();
					System.out.printf("Considerando sua press�o habitual, Informe sua press�o diast�lica:");
					pressao.dis1 = leia.nextFloat();
					System.out.printf("Informe sua press�o sist�lica atual: ");
					pressao.sis2 = leia.nextFloat();
					System.out.printf("Informe sua press�o diast�lica atual: ");
					pressao.dis2 = leia.nextFloat();
					pressao.trimestre();
					pressao.medirSis();
					pressao.medirDis();
					break;

				case 3: // IMC
					leia.nextLine();
					System.out.printf("\nInforme a quantidade de beb�s que est� esperando: ");
					int qtdBebes = leia.nextInt();
					if (qtdBebes == 1) {
						System.out.printf("\nInforme em qual semana de gest�o voc� est�: ");
						imcuni.semana = leia.nextInt();
						System.out.print("Informe o seu peso atual: ");
						imcuni.pesoAtual = leia.nextDouble();
						System.out.print("Informe a sua altura: ");
						imcuni.altura = leia.nextDouble();

						imcuni.calculoImc(imcuni.semana, imcuni.pesoAtual, 0, imcuni.altura);
					} else {
//					System.out.printf("\nInforme em qual semana de gest�o voc� est�: ");
//					imcuni.semana = leia.nextInt();	
						System.out.print("Informe o seu peso atual: ");
						imcuni.pesoAtual = leia.nextDouble();
						System.out.print("Informe o seu peso pr�-gestacional: ");
						imcuni.pesoPre = leia.nextDouble();
						System.out.print("Informe a sua altura: ");
						imcuni.altura = leia.nextDouble();

						imcmulti.calculoImc(0, imcmulti.pesoAtual, imcmulti.pesoPre, imcmulti.altura);
					}
					break;

				default:
					if (op == 0) {
						System.out.println("Obrigade por utilizar o programa PrevBaby");
					} else {
						System.out.println("Op��o inv�lida! Tente novamente.");
					}
				}
			} catch (InputMismatchException erro1) {
				System.err.println("N�o � permitido inserir letras, informe apenas n�meros!");
				leia.nextLine();
			}
		} while (op != 0);

		leia.close();

	}

}
