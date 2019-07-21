import java.time.*;
public class FormatData{
public static void main(String args[]){


LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
LocalTime time = LocalTime.of(11, 12, 34);
LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(date
.format(DateTimeFormatter.ISO_LOCAL_DATE));
System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));

System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

}
}