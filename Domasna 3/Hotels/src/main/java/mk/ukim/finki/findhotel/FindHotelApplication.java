package mk.ukim.finki.findhotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FindHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindHotelApplication.class, args);
    }

}
