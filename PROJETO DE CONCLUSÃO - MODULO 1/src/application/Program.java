package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Sistema de leitura e analise de pressão //
		
		Scanner leia = new Scanner(System.in);
		
		float pressaoNs, pressaoNd, pressaoAs, pressaoAd, semana;
		//pressaoNs = pressão normal sistólica
		//pressaoNd = pressão normal diastólica
		//pressaoAs = pressão atual sistólica
		//pressaoAd = pressão atual diastólica
		
		System.out.printf("Informe em qual semana de gestão está: ");
		semana = leia.nextFloat();				
		
		System.out.printf("Considerando sua pressão habitual, Informe sua pressão sistólica: ");
		pressaoNs = leia.nextFloat();
		
		System.out.printf("Considerando sua pressão habitual, Informe sua pressão diastólica:");
		pressaoNd = leia.nextFloat();
		
		
		System.out.printf("Informe sua pressão sistólica atual: ");
		pressaoAs = leia.nextFloat();
		
		System.out.printf("Informe sua pressão diastólica atual: ");
		pressaoAd = leia.nextFloat();
		
		
		//--------------------PRIMEIRO TRIMESTRE-----------------------
		
		if (semana <= 14)
		{ 
			if (pressaoAs != pressaoNs)//sistólica
			{ 
				if (pressaoAs < ((pressaoNs - 1.5)- 3))
				{ 
					System.out.println("Sua pressão sistólica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > ((pressaoNs - 1.5)+ 3))
				{ 
					System.out.println("Sua pressão sistólica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua pressão sistólica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua pressão sistólica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diastólica
			{ 
				{ 
					if (pressaoAd < ((pressaoNd - 1.5)- 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > ((pressaoNd - 1.5)+ 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua pressão diastólica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua pressão diastólica esta dentro do esperada para semana.");

			}
		}
		
		//--------------------SEGUNDO TRIMESTRE-----------------------
		
		if (semana >= 15 && semana <= 28)
		{ 
			if (pressaoAs != pressaoNs)//sistólica
			{ 
				if (pressaoAs < ((pressaoNs - 3)- 3))
				{ 
					System.out.println("Sua pressão sistólica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > ((pressaoNs - 3)+ 3))
				{ 
					System.out.println("Sua pressão sistólica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua pressão sistólica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua pressão sistólica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diastólica
			{ 
				{ 
					if (pressaoAd < ((pressaoNd - 3)- 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > ((pressaoNd - 3)+ 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua pressão diastólica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua pressão diastólica esta dentro do esperada para semana.");

			}
		}
		
		
		//--------------------TERCEIRO TRIMESTRE-----------------------

		if (semana >= 29 && semana <= 42)
		{ 
			if (pressaoAs != pressaoNs)//sistólica
			{ 
				if (pressaoAs < (pressaoNs - 3))
				{ 
					System.out.println("Sua pressão sistólica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > (pressaoNs + 3))
				{ 
					System.out.println("Sua pressão sistólica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua pressão sistólica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua pressão sistólica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diastólica
			{ 
				{ 
					if (pressaoAd < (pressaoNd - 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > (pressaoNd + 1.5))
					{ 
						System.out.println("Sua pressão diastólica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua pressão diastólica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua pressão diastólica esta dentro do esperada para semana.");

			}
		}
		
		
		
		
  }

}
