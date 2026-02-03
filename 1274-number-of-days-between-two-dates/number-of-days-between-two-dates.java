import java.time.*;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
     LocalDate d = LocalDate.parse(date1);
     LocalDate d2 = LocalDate.parse(date2);
     long ans = Math.abs(ChronoUnit.DAYS.between(d,d2));
     return (int) ans;
    }
}