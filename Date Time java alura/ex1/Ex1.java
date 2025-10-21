package ex1;
import java.time.*;



/*Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex1 {

    public static void main(String[] args) {

        LocalDate ini = LocalDate.of(2025, 8, 12);
        LocalDate fi = LocalDate.of(2027, 6, 22);
        Period dura = Period.between(ini, fi);

       
        System.out.println(dura.getYears() +" anos " + dura.getMonths() + " meses " + dura.getDays() + " dias");

    }
}
