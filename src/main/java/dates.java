import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by kapila on 8/21/15.
 */
public class dates {

    public DateTime today(){
        DateTimeFormatter fmt = DateTimeFormat.forPattern("d MMMM, yyyy");
        LocalDate date = LocalDate.now();
        String str = date.toString(fmt);
        return date.toDateTimeAtStartOfDay();
    }
    public void period(DateTime start){
        LocalDate date = LocalDate.now();
        DateTime end = date.toDateTimeAtStartOfDay();
        Period period = new Period(start,end);
        System.out.println("Age :"+period.getYears());
    }
    public void BCdate(){
        DateTime dtISO = this.today();
        DateTime dtBudd = dtISO.withChronology(BuddhistChronology.getInstance());
        System.out.println("BC "+dtBudd);
    }

    public void Information(DateTime day){
        System.out.println("Day Of month " + day.getDayOfMonth());
        System.out.println("Day Of week "+day.getDayOfWeek());
        System.out.println("Day Of year "+day.getDayOfYear());
        System.out.println("Year Of Century "+day.getYearOfCentury());
    }
}
