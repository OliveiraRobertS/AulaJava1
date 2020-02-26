import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario, horas;
		Double Vhoras; 
		
		System.out.println("Digite a quantidade de funcionários: ");
		funcionario = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		Vhoras = sc.nextDouble();
		
		Double Salario = horas*Vhoras;
		
		System.out.println("NUMBER: " + funcionario);
		System.out.printf("SALARY: U$%.2f%n", Salario);
		
		
		sc.close();

	}

}
