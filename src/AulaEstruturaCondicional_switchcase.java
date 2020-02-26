import java.util.Scanner;

public class AulaEstruturaCondicional_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que corresponde o dia da semana: ");
		
		int x = sc.nextInt();
		String dia;
					
		if (x == 1) {
			dia = "Domingo";			
		} else if (x == 2) {
			dia = "Segunda";
		} else if (x == 3){
			dia = "Terça";
		} else if (x == 4){
			dia = "Quarta";
		} else if (x == 5){
			dia = "Quinta";
		} else if (x == 6) {
			dia = "Sexta";
		} else if (x == 7) {
			dia = "Sábado";
		}
		else {
			dia = "Valor Inválido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
	}

}
