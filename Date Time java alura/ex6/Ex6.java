package ex6;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*Horas tokyo*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex6 {

    public static void main(String[] args) {

        ZonedDateTime  momentoAtual = ZonedDateTime.now();
        ZonedDateTime horaInternacional = momentoAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter hrInternacionalFormat = DateTimeFormatter.
        ofPattern("HH:mm:ss");
        
        String horaFormatada = horaInternacional.format(hrInternacionalFormat);
        System.out.println("Horário: " + horaFormatada);
        
    }
}