import java.time.*;
import java.time.format;
//import java.text.DateFormat;

public final class DateTimeFormatter{
public static void main(String []args){

DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
LocalDate date = LocalDate.parse("01 02 2019", f);
LocalTime time = LocalTime.parse("11:22");
System.out.println(date); // 2019-01-02
System.out.println(time); // 11:22








}
}