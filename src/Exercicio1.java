import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		int y;
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();
		System.out.println("Digite outro n�mero");
		y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("A soma dos n�meros s�o: " + soma);
		
		sc.close();
	}

}
