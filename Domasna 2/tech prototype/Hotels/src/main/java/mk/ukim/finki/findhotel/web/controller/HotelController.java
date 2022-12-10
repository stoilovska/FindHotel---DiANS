package mk.ukim.finki.findhotel.web.controller;

import mk.ukim.finki.findhotel.model.Hotel;
import mk.ukim.finki.findhotel.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public String getHotelPage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        List<Hotel> hotels = this.hotelService.getAllHotels();
        System.out.println(hotels);
        model.addAttribute("hotels", hotels);
        return "hotels";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHotel(@PathVariable Long id) {
        this.hotelService.deleteHotel(id);
        return "redirect:/hotels";
    }

    @GetMapping("/add-form")
    public String addHotelPage(Model model) {

        return "add-hotel";
    }

    @GetMapping("/edit-form/{id}")
    public String editHotelPage(@PathVariable Long id, Model model) {
        if (this.hotelService.getHotelById(id) != null) {
            Hotel hotel = this.hotelService.getHotelById(id);

            model.addAttribute("hotel", hotel);
            return "add-product";
        }
        return "redirect:/hotels?error=HotelNotFound";
    }

    @GetMapping("/filterInternetAccess")
    public String filterHotel(Model model) {
        List<Hotel> hoteli = this.hotelService.findByInternet_access();
        model.addAttribute("hotelsInternet", hoteli);
        return "filterInternetAccess";
    }

    @GetMapping("/filterSwimmingPool")
    public String filterHotelSwimmingPool(Model model) {
        List<Hotel> hotelii = this.hotelService.findBySwimmingPool();
        model.addAttribute("hotelsSwimmingPool", hotelii);
        return "filterSwimmingPool";
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
