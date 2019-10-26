import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.SimpleDateFormat;


public class DzienTygodnia {
    public static void main(String[] args) {

        System.out.println("Podaj date:");
        Scanner s = new Scanner(System.in);
        String Date = s.nextLine();
        GregorianCalendar gc = new GregorianCalendar(new Locale("pl", "PL"));

        try {
            boolean dv = dateValidate(Date);

            if (dv) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
                Date d = sdf.parse(Date);
                sdf.applyPattern("EEEE");
                Calendar c = gc;
                c.setTime(d);
                c.add(Calendar.YEAR, 1);
                Date nr = c.getTime();
                gc.setTime(d);
                System.out.println(sdf.format(gc.getTime()));
                System.out.println(sdf.format(nr));

            } else {
                System.out.println("Bledna data!!!");
            }
        } catch (Exception e) {
            System.out.println("Bledna data!!!");

        }

    }

    private static boolean dateValidate(String date) {

        return true;
    }

}
