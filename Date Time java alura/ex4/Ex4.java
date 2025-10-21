package ex4;

import java.time.*;
import java.time.format.DateTimeFormatter;


/*vereifica se ja ocorreu o evento ou não!*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex4 {

    public static void main(String[] args) {

       LocalDate dataEvento = LocalDate.of(2025, 9, 29);
       LocalDate dataAtual = LocalDate.now();

       DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String dataCorretaEvento = dataEvento.format(dataFormatada);
       String dataCorretaAtual = dataAtual.format(dataFormatada);
       
        System.out.println("Data do evento: " + dataCorretaEvento);
        System.out.println("Data atual: " + dataCorretaAtual);

        if(dataAtual.isBefore(dataEvento)){
            System.out.println("Evento vai acontecer, se liga na data!");
        }else if(dataAtual.isEqual(dataEvento)){
            System.out.println("Evento vai acontecer esse mês");
        }else{
            System.out.println("Evento Já ocorreu");
        }
    }

}
