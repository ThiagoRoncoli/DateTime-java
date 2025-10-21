package ex2;

import java.time.*;
import java.time.format.DateTimeFormatter;


/*Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex2 {

    public static void main(String[] args) {

       LocalDate dataHoje = LocalDate.now();
       int prazoDias = 15;
       LocalDate dataEntrega = dataHoje.plusDays(prazoDias);
       DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String dataCorreta = dataEntrega.format(dataFormatada);

        System.out.println("Data de entrega: " + dataCorreta);


    }
}

