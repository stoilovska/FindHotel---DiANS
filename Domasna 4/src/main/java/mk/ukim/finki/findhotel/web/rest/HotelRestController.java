package mk.ukim.finki.findhotel.web.rest;//package mk.ukim.finki.findhotel.web.rest;
//
//import mk.ukim.finki.findhotel.model.Hotel;
//import mk.ukim.finki.findhotel.service.HotelService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/hotels")
//public class HotelRestController {
//
//    private final HotelService hotelService;
//
//    @Autowired
//    public HotelRestController(HotelService hotelService) {
//        this.hotelService = hotelService;
//    }
//
//    @GetMapping(value = "/all")
//    public ResponseEntity<List<Hotel>> getAllHotels() {
//        List<Hotel> hotels = hotelService.getAllHotels();
//        return new ResponseEntity<>(hotels, HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Hotel> getBookById(@PathVariable(value = "id") Long id) {
//        Hotel book = hotelService.getHotelById(id);
//        return new ResponseEntity<>(book, HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/hotels")
//    public ResponseEntity<?> getHotelsByHotelName(@RequestParam(value = "hotelName") String hotelName){
//        Hotel hotel = hotelService.findHotelByName(hotelName);
//        return new ResponseEntity<>(hotel, HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<?> getHotelByStreet(@RequestParam(value = "street") String street) {
//        List<Hotel> hotels = hotelService.findHotelByStreet(street);
//        return new ResponseEntity<>(hotels, HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<Hotel> createBook(@RequestBody Hotel hotel) {
//        Hotel newHotel = hotelService.createHotel(hotel);
//        return new ResponseEntity<>(newHotel, HttpStatus.CREATED);
//    }
//
//    @PostMapping(value = "update/{id}")
//    public ResponseEntity<?> updateBook(@PathVariable(value = "id") Long id, @RequestBody Hotel hotel) {
//        hotelService.updateHotel(id, hotel);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "delete/{id}")
//    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long id)  {
//        hotelService.deleteHotel(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//}
