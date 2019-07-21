import java.time.*;
public class DataeHora{

public static void main(String []args){
LocalTime time3 = LocalTime.of(6, 15, 30, 200);
LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.JANUARY, 20, 6, 15, 30);
//LocalDateTime dateTime2 = LocalDateTime.of(date1, time1)

System.out.println(time3);
System.out.println(dateTime1);
//System.out.println(dateTime2);

System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
System.out.println(LocalDateTime.now());
}
}