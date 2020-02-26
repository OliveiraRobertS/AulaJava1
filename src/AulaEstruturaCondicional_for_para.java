import java.util.Scanner;

public class AulaEstruturaCondicional_for_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 números: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i=i+1) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		sc.close();

	}

}
