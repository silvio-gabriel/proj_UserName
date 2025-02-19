package projetos_LPA.aula4;

import java.util.Scanner;

public class CodSalario {

	public static void main(String[] args) {
		double htrab, vhora, sbruto, sliq, inss;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalha por dia?");
			htrab = ler.nextDouble();
		System.out.println("Qual o valor da sua hora trabalhada?");
			vhora = ler.nextDouble();
			
						sbruto = htrab * vhora;
						inss = sbruto * 0.12;
						sliq = sbruto - inss;
						
		System.out.print("O valor do salário bruto é: R$" + sbruto);
		System.out.print("\nO valor do salário liquido é: R$" + sliq);

	}

}
