package DataTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
public static void main(String[] args) {
	ZoneId zone = ZoneId.systemDefault();
	System.out.println(zone);//Asia/Calcutta
	
	ZoneId india = ZoneId.of("Asia/Calcutta");
	ZonedDateTime indiaZoneDateTime= ZonedDateTime.now(india);
	System.out.println(indiaZoneDateTime);
	
	ZoneId ca= ZoneId.of("America/Los_Angeles");
	ZonedDateTime zt= ZonedDateTime.now(ca);
	System.out.println(zt);
}
}
