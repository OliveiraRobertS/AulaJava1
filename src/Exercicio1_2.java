import java.util.Scanner;

public class Exercicio1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		System.out.println("Digite um número: ");
		A = sc.nextInt();
		System.out.println("Digite outro número: ");
		B = sc.nextInt();
		System.out.println("Digite outro número: ");
		C = sc.nextInt();
		System.out.println("Digite mais um número: ");
		D = sc.nextInt();
		
		int Diferenca = A*B-C*D; 
		
		System.out.println("A diferença dos números é: " + Diferenca);
		
		
sc.close();
	}

}
