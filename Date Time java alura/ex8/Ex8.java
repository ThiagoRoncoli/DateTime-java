package ex8;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/*O programa deve:

Capturar o horário de entrada.
Adicionar a carga horária diária para calcular o horário de saída previsto.
Capturar o horário real de saída
Calcular a diferença entre o tempo trabalhado e a carga horária.
Exibir as informações formatadas corretamente.*/

public class Ex8 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter hrEntradaForm = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), hrEntradaForm);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHorariaHoras = scanner.nextInt(); // Use int ou double


        DateTimeFormatter hrSaidaForm = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(scanner.next(), hrSaidaForm);

        LocalTime saidaPrevista = entrada.plusHours(cargaHorariaHoras);


        System.out.println("Horário real de entrada: " + entrada);
        System.out.println("Horário de saída previsto: " + saidaPrevista);
        System.out.println("Horário real de saída: " + saida);

        Duration saldoHoras = Duration.between(saidaPrevista, saida);
        long horasExtras = saldoHoras.toHours();
        long minutosExtras = saldoHoras.toMinutesPart();

        if(saldoHoras.isZero()){
            System.out.println("Saldo de horas: " + horasExtras + "hrs " + minutosExtras + "min");
        }else if(saldoHoras.isPositive()){
            System.out.println("Saldo de horas: +" + horasExtras + "hrs " +minutosExtras + "min" );
        }else if(saldoHoras.isNegative()){
            System.out.println("Saldo de horas: -" + horasExtras + "hrs " + minutosExtras + "min");
        }else{
            System.out.println("Erro na verificação de saldo de horas");
        }

    }
}

