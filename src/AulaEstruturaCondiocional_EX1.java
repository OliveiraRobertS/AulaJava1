import java.util.Scanner;

public class AulaEstruturaCondiocional_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		int N = sc.nextInt();
		
		if (N <0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N�O NEGATIVO");
		}
		sc.close();
	}

}
