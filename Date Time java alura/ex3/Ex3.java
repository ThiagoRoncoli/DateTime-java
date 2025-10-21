package ex3;

import java.time.*;
import java.time.format.DateTimeFormatter;


/*Mesma coisa do outro poré eu determino manualmente a data no localDate.of*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex3 {

    public static void main(String[] args) {

       LocalDate dataHoje = LocalDate.of(2025, 9, 29);
       int prazoMeses = 1;
       LocalDate dataEntrega = dataHoje.plusMonths(prazoMeses);
       DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String dataCorreta = dataEntrega.format(dataFormatada);




        System.out.println("Nova data de vencimento: " + dataCorreta);


    }
}
