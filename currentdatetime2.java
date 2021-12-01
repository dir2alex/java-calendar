import java.util.Date;

public class currentdatetime2 {
    public static void main(String [] args)
    {
        Date d = new Date();
        double seconds = d.getTime() / 1000;
        double minutes = seconds / 60;
        double hours = minutes / 60;
        double days = hours / 24;
        double months = days / 30;
        double years = days / 365;

        System.out.print("Waktu sudah berlalu dari Januari 1 1970 selama...");
        System.out.print(seconds + "detik atau ");
        System.out.print(minutes + "menit atau ");
        System.out.print(hours + "jam atau ");
        System.out.print(days + "hari atau ");
        System.out.print(months + "bulan atau ");
        System.out.print(years + "tahun.");
        

    }
    
}
