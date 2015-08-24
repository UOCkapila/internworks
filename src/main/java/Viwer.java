import org.joda.time.*;
import org.joda.time.Duration;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


import javax.xml.datatype.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by kapila on 8/21/15.
 */
public class Viwer {
    public static void main(String[] args){
        dates getdates = new dates();
        System.out.println(" '1' for Birth cal , '2' for get BC date, '3' for get date information ,'4' for exit ");
        int value=0;
        while(value!= 4){
            Scanner in = new Scanner(System.in);
            value = in.nextInt();
            switch (value){
                case 1:
                    Scanner bday = new Scanner(System.in);
                    System.out.println("Enter your birth day (YYYY-MM-DD)");
                    String input = bday.next();
                    String[] inputarray = input.split("-");
                    int year = Integer.parseInt(inputarray[0]);
                    int month = Integer.parseInt(inputarray[1]);
                    int day = Integer.parseInt(inputarray[2]);
                    DateTime start = new DateTime(year, month, day, 0, 0, 0, 0);
                    getdates.today();
                    getdates.period(start);
                    value=0;
                    break;
                case 2:
                    getdates.BCdate();
                    value=0;
                    break;
                case 3:
                    getdates.Information(getdates.today());
                    value=0;
                    break;
                default:
                    value=0;
            }
        }
    }
}
