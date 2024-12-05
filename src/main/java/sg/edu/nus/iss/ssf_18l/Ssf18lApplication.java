package sg.edu.nus.iss.ssf_18l;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ssf18lApplication {

	public static void main(String[] args) {
		OffsetDateTime datetime = LocalDateTime.parse("2024-11-29T18:00:00").atOffset(ZoneOffset.of("+08:00"));
		System.out.println(datetime.toString());
		SpringApplication.run(Ssf18lApplication.class, args);
	}

}
