import java.util.Calendar;
public class EnumTest {
	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("Today is " + today);
		System.out.println((today == Week.SUNDAY)? "Sunday is resing" : "Study" );
		
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week dayAnother = Week.FRIDAY;
		int compare = dayAnother.compareTo(today);
		System.out.println(compare);
		
		Week weekDay = Week.valueOf("SATURDAY");
		System.out.println(weekDay);
	
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.print(day + " ");
		}
	
	}
}
