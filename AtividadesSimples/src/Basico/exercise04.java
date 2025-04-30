package Basico;
import java.util.Scanner; 

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class exercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual horário o jogo iniciou?");
		int horaInicial = sc.nextInt();
		System.out.println("Qual horŕrio o jogo terminou?");
		int horaFinal = sc.nextInt();
		int horaTotal = horaInicial + horaFinal;
		if (horaInicial + horaFinal > 24) {
			horaTotal -= 24;
		}
		System.out.println(horaTotal);
		sc.close();
	}

}
