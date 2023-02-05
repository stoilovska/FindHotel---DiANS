package mk.ukim.finki.findhotel.repository;

import mk.ukim.finki.findhotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findHotelByStreet(String street); //Pronaogja hotel po barana ulica

    Hotel findHotelByName(String name); //Pronaogja hotel za dadeno ime

    Hotel getHotelById(Long id); //Pronaogja hotel za dadeno id
}
