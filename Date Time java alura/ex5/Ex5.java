package ex5;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex5 {

    public static void main(String[] args) {

       LocalDate dataVencimento = LocalDate.of(2025, 9, 29);
       int periodoAntecedencia = 5;
       LocalDate dataLembrete = dataVencimento.minusDays(periodoAntecedencia);

       DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       String dataLembreteFormat = dataLembrete.format(dataFormatada);

        System.out.println("Data do Lembrete: " + dataLembreteFormat);



    }
}
