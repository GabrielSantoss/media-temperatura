package exercicio_meses_temperatura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMeses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> temperatura = new ArrayList<>();
		int media;
		
		for(int i = 1; i <= 6; i++) {
			System.out.print("Informe a temperatura para o " + i + "° mês: ");
			temperatura.add(sc.nextInt());
		}
		
		System.out.println();
		System.out.println("-------------//-------------");
		System.out.println();
		
		Iterator<Integer> iterator = temperatura.iterator(); 
		int soma = 0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		
		media = soma/temperatura.size(); 
		System.out.print("Média semestral das temperaturas para os seis primieros meses: " + media + "\n");
	
		System.out.println();
		System.out.println("-------------//-------------");
		System.out.println();
		
		System.out.println("Meses com a temperatura acima da média no 1° semestre: ");
		
		for(int i = 0; i < temperatura.size() ; i++) {
			if(temperatura.get(i) > media ) {
				System.out.println(mesPorExtenso(i) + " com média: " + temperatura.get(i) );
			}
		}
		
		sc.close();

	}
	
	public static String mesPorExtenso(int mes) {
		
		switch (mes) {
		case 0: {
			return "1 - Janeiro";
		}
		case 1: {
			return "2 - Fevereiro";
		}
		case 2: {
			return "3 - Março";
		}
		case 3: {
			return "4 - Abril";
		}
		case 4: {
			return "5 - Maio";
		}
		case 5: {
			return "6 - Junho";
		}
		default:
			return "Invalido";
		}
		
	}

}
