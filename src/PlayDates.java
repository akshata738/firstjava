import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class PlayDates {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate Birthday = LocalDate.of(2000, 12, 13);
		System.out.println(Birthday);
		System.out.println(Birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		Birthday.getDayOfMonth();
		Birthday.getMonth();
		Birthday.getYear();
		Birthday.getDayOfWeek();
		System.out.println(Birthday.getDayOfMonth());
		System.out.println(Birthday.getMonth());
		System.out.println(	Birthday.getDayOfWeek());
		LocalDate futuredate = now.plusDays(10);
		System.out.println(futuredate);
		//calculate your birthdate
		Period period=Period.between(Birthday, now.plusDays(1));
		System.out.println(period);
		System.out.println(String.format("%s years, %s months", period.getYears(),period.getMonths()));
		//compare days
		System.out.println(now.isBefore(Birthday));
		System.out.println(now.isAfter(Birthday));
		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
		//localdatetime
		LocalDateTime localdatetime =LocalDateTime.now();
		System.out.println(localdatetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		System.out.println(localdatetime.getDayOfWeek());
		System.out.println(localdatetime.getHour());
		Set<String> zoneIDS =ZoneId.getAvailableZoneIds();
		System.out.println(zoneIDS);
		ZonedDateTime zone = ZonedDateTime.now(ZoneId.of("Etc/GMT+8"));
		System.out.println(zone);
		
		
		}
	

}
