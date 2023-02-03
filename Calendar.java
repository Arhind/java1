package coding;
import java.time.Instant;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {

	public static void main(String[] args) {
        System.out.println("Hello, World!");

     //   final Calendar calendar = new Calendar.Builder().setInstant(Instant.now().toEpochMilli()).setTimeZone(TimeZone.getTimeZone(timeZoneId)).setLocale(ENGLISH).build(); 	//Option c
        
        final Calendar calendar = new Calendar.Builder().setInstant(Instant.now()).setTimeZone(TimeZone.getTimeZone(timeZoneId)).setLocale(ENGLISH).build();  //option b
        
     //   final Calendar calendar = new Calendar.Builder().setInstant(Instant().toEpochMilli()).
       // 		setTimeZone(TimeZone.getTimeZone(timeZoneId)).setLocale(ENGLISH).build(); 	//option a
        
     //   final Calendar calendar = new Calendar.setInstant(Instant.now().toEpochMilli()).
     //   		setTimeZone(TimeZone.getTimeZone(timeZoneId)).setLocale(ENGLISH).build(); 	//option d
    }
}
