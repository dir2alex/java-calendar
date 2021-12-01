import java.time.LocalDate;
import java.time.LocalDateTime;

public class localtime {
    public static void main(String [] args)
    {
        LocalDate date = LocalDate.of(2021, 1, 1);
        LocalDateTime dt = date.atTime(15, 00, 05);
        System.out.println(dt);
    }
    
}
