import java.util.Scanner;

public class AulaEstruturaCondicional_Ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o valor? ");
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O desconto �: R$%.2f%n ", desconto );
		
		sc.close();

	}

}
