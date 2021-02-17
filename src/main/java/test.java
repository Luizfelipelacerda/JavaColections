import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class test {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);

        LocalDateTime hojeAgora = LocalDateTime.now();
        System.out.println(hojeAgora);
        LocalDateTime logo = hojeAgora.plusHours(2).plusDays(10).plusMonths(5).plusYears(1);
        System.out.println(logo);

        Date kk = new Date();
        System.out.println(kk);
    }
}
