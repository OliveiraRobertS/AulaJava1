import java.util.Scanner;

public class Exercicio1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		B = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		C = sc.nextInt();
		System.out.println("Digite mais um n�mero: ");
		D = sc.nextInt();
		
		int Diferenca = A*B-C*D; 
		
		System.out.println("A diferen�a dos n�meros �: " + Diferenca);
		
		
sc.close();
	}

}
