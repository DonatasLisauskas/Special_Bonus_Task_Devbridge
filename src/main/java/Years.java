import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Years {

    static void printBonusDatesBetween(int fromYear, int toYear) throws InvalidYearsException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String stringOfDate;

        List<Date> dateList = new ArrayList<Date>();
        List<Integer> years = new ArrayList<Integer>();

        if (fromYear < toYear) {
            for (int a = fromYear; a <= toYear; a++) {
                years.add(a);
            }
        } else if (fromYear > toYear) {
            for (int b = toYear; b <= fromYear; b++) {
                years.add(b);
            }
        } else {
            throw new InvalidYearsException("Invalid years entered!");
        }

        try {
            for (Integer year : years) {
                if (year % 2 == 0) {
                    stringOfDate = year + "-01-02";
                    dateList.add(dateFormat.parse(stringOfDate));
                } else {
                    stringOfDate = year + "-11-02";
                    dateList.add(dateFormat.parse(stringOfDate));
                }
            }
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        for (Date date : dateList) {
            String printDate = dateFormat.format(date);
            System.out.println(printDate);
        }
    }
}
