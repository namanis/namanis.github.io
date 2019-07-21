import java.time.*;
//import java.text.DateFormat;
import java.util.Date.*;
public final class DateTimeFormatter{
public static void main(String []args){

DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
LocalDate date = LocalDate.parse("01 02 2015", f);
LocalTime time = LocalTime.parse("11:22");
System.out.println(date); // 2015-01-02
System.out.println(time); // 11:22








}
}