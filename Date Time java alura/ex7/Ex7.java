package ex7;
import java.time.*;
import java.time.format.DateTimeFormatter;


/*Horas Brasil e Sydney*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex7 {

    public static void main(String[] args) {

        ZonedDateTime  momentoAtual = ZonedDateTime.now();
        DateTimeFormatter momentoAtFormatado = DateTimeFormatter.ofPattern("HH:mm");
        String momemtoAtform = momentoAtual.format(momentoAtFormatado);


        ZonedDateTime horaInternacional = momentoAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter hrInternacionalFormat = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = horaInternacional.format(hrInternacionalFormat);

        System.out.println("Horário atual no sistema: " + momemtoAtform);
        System.out.println("Horário atual em Sydney: " + horaFormatada);

    }
}