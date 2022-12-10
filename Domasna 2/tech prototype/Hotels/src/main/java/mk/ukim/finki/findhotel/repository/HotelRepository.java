package mk.ukim.finki.findhotel.repository;

import mk.ukim.finki.findhotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findHotelByStreet(String street);

    Hotel findHotelByName(String name);

    Hotel getHotelById(Long id);
}
