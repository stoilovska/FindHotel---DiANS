package mk.ukim.finki.findhotel.service.impl;

import mk.ukim.finki.findhotel.model.Hotel;
import mk.ukim.finki.findhotel.repository.HotelRepository;
import mk.ukim.finki.findhotel.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    //Zachuvuvanje na hotel vo samata baza
    @Override
    public Hotel save(String name, Double lon, Double lat, String street,
                      String opening_hours, String email, String phone, String country,
                      String city, String house_number, String internet_access, Integer stars,
                      String smoking, String swimming_pool, String building, String web_site,
                      String operator, Integer rooms, String linkMapa, String pets_allowed) {

        return hotelRepository.save(new Hotel(name, lon, lat, web_site, operator, opening_hours, email, phone, country, city, street, house_number, internet_access, stars, rooms, smoking, swimming_pool, building, linkMapa, pets_allowed));
    }

    //Se zemaat site hoteli od bazata
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll().stream().sorted(Comparator.comparing(Hotel::getId)).collect(Collectors.toList());
    }

    //Se pronaogja hotelot za dadeno id
    @Override
    public Hotel getHotelById(Long Id) {
        return hotelRepository.getHotelById(Id);
    }

    //Se pronaogjaat i vrakjaat site hoteli koi imaat dostapnost do internet
    @Override
    public List<Hotel> findByInternet_access() {
        List<Hotel> hotels = this.getAllHotels();
        return hotels.stream()
                .filter(i -> i.getInternet_access().equals("да"))
                .collect(Collectors.toList());
    }

    //Se pronaogjaat i vrakjaat site hoteli koi imaat bazen
    @Override
    public List<Hotel> findBySwimmingPool() {
        List<Hotel> hotels = this.getAllHotels();
        return hotels.stream()
                .filter(i -> i.getSwimming_pool().equals("да"))
                .collect(Collectors.toList());
    }

    //Se pronaogjaat i vrakjaat site hoteli koi imaat dozvola za pushenje
    @Override
    public List<Hotel> findBySmoking() {
        List<Hotel> hotels = this.getAllHotels();
        return hotels.stream()
                .filter(i -> i.getSmoking().equals("да"))
                .collect(Collectors.toList());
    }

    //Se pronaogjaat i vrakjaat site hoteli koi imaat dozvola za domashni milenici
    @Override
    public List<Hotel> findByPetsAllowed() {
        List<Hotel> hotels = this.getAllHotels();
        return hotels.stream()
                .filter(i -> i.getPets_allowed().equals("да"))
                .collect(Collectors.toList());
    }

    //Pronaogja hotel po dadeno ime
    @Override
    public Hotel findHotelByName(String name) {
        return hotelRepository.findHotelByName(name);
    }

    //Pronaogja hotel po dadena ulica
    @Override
    public List<Hotel> findHotelByStreet(String street) {
        return hotelRepository.findHotelByStreet(street);
    }

    //Brishe hotel so dadenoto id od bazata
    @Override
    public void deleteHotel(Long Id) {

        Hotel hotel = hotelRepository.getHotelById(Id);

        hotelRepository.delete(hotel);
    }
}
