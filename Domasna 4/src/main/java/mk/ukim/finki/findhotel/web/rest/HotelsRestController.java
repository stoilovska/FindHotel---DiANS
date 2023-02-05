package mk.ukim.finki.findhotel.web.rest;

import mk.ukim.finki.findhotel.model.Hotel;
import mk.ukim.finki.findhotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//NE ova
@RestController
@RequestMapping("/api/hotels")
public class HotelsRestController {


    private final HotelService hotelService;

    @Autowired
    public HotelsRestController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ResponseEntity<?> getHotelPage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        List<Hotel> hotels = this.hotelService.getAllHotels();
        System.out.println(hotels);
        model.addAttribute("hotels", hotels);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHotel(@PathVariable Long id) {
        this.hotelService.deleteHotel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/add-form")
    public ResponseEntity<?> addHotelPage(Model model) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/edit-form/{id}")
    public ResponseEntity<?> editHotelPage(@PathVariable Long id, Model model) {
        if (this.hotelService.getHotelById(id) != null) {
            Hotel hotel = this.hotelService.getHotelById(id);

            model.addAttribute("hotel", hotel);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filterInternetAccess")
    public  ResponseEntity<?> filterHotel(Model model) {
        List<Hotel> hoteli = this.hotelService.findByInternet_access();
        model.addAttribute("hotelsInternet", hoteli);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filterSwimmingPool")
    public ResponseEntity<?> filterHotelSwimmingPool(Model model) {
        List<Hotel> hotelii = this.hotelService.findBySwimmingPool();
        model.addAttribute("hotelsSwimmingPool", hotelii);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filterSmoking")
    public String filterHotelSmoking(Model model) {
        List<Hotel> hoteliii = this.hotelService.findBySmoking();
        model.addAttribute("hotelsSmoking", hoteliii);
        return "filterSmoking";
    }

    @GetMapping("/filterPetsAllowed")
    public String filterPetsAllowed(Model model) {
        List<Hotel> hoteliiii = this.hotelService.findByPetsAllowed();
        model.addAttribute("hotelsPetsAllowed", hoteliiii);
        return "filterPetsAllowed";
    }

    @GetMapping("/showHotels/{id}")
    public String showHotel(@PathVariable Long id, Model model) {
        Hotel hotel = this.hotelService.getHotelById(id);
        model.addAttribute("hotel", hotel);
        return "hotelDescriptionMap";
    }

    @PostMapping("/add")
    public String saveHotel(@RequestParam String name,
                            @RequestParam Double lon,
                            @RequestParam Double lat,
                            @RequestParam String street,
                            @RequestParam String opening_hours,
                            @RequestParam String email,
                            @RequestParam String phone,
                            @RequestParam String country,
                            @RequestParam String city,
                            @RequestParam String house_number,
                            @RequestParam String internet_access,
                            @RequestParam(required = false) Integer stars,
                            @RequestParam String smoking,
                            @RequestParam String swimming_pool,
                            @RequestParam String building,
                            @RequestParam String web_site,
                            @RequestParam String operator,
                            @RequestParam(required = false) Integer rooms,
                            @RequestParam String linkMapa,
                            @RequestParam String pets_allowed) {

        this.hotelService.save(name, lon, lat, street, opening_hours, email, phone, country, city, house_number,
                internet_access, stars, smoking, swimming_pool, building, web_site, operator, rooms,
                linkMapa, pets_allowed);

        return "redirect:/hotels";
    }
}
