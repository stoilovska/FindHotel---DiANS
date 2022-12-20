package mk.ukim.finki.findhotel.service;

import mk.ukim.finki.findhotel.model.Hotel;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface HotelService {

    Hotel save(String name, Double lon, Double lat, String street,
               String opening_hours, String email, String phone, String country,
               String city, String house_number, String internet_access, Integer stars,
               String smoking, String swimming_pool, String building, String web_site,
               String operator, Integer rooms, String linkMapa, String pets_allowed);

    List<Hotel> getAllHotels();

    Hotel getHotelById(Long Id);

    Hotel findHotelByName(String name);

    List<Hotel> findHotelByStreet(String street);

    List<Hotel> findByInternet_access();

    List<Hotel> findBySwimmingPool();

    List<Hotel> findBySmoking();

    List<Hotel> findByPetsAllowed();

//    void updateHotel(Long Id, Hotel hotel);

    void deleteHotel(Long Id);
}
