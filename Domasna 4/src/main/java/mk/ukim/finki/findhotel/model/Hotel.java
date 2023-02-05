package mk.ukim.finki.findhotel.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; //Ime na hotelot

    private Double lon; //Longitude

    private Double lat; //Latitude

    private String web_site; //Veb sajt na hotelot

    private String operator; //operator na hotelot

    private String opening_hours; //Koga e otvoren hotelot

    private String email; //E-mail na hotelot

    private String phone; //Telefonski broj na hotelot

    private String country; //Drzava vo koja se naogja hotelot

    private String city; //Grad vo koja se naogja hotelot

    private String street; //Ulica na koja se naogja hotelot

    private String house_number; //Broj na ulica na koja se naogja hotelot

    private String internet_access; //Dostapenost do internet konekcija vo hotelot

    private Integer stars; //Kolku zvezdichki ima hotelot

    private Integer rooms; //Broj na sobi co hotelot

    private String smoking; //Dali e dozvoleno pushenje vo hotelot

    private String swimming_pool; //Dali hotelot ima bazen

    private String building; //Zgrada

    @Column(length = 4000)
    private String linkMapa; //Link do mapata kade tochno se napgja hotelot

    private String pets_allowed; //Dali ima dozvola za domashni milenici

    public Hotel() {

    }

    public Hotel(String name, Double lon, Double lat, String web_site, String operator,
                 String opening_hours, String email, String phone, String country,
                 String city, String street, String house_number,
                 String internet_access, Integer stars, Integer rooms,
                 String smoking, String swimming_pool, String building, String linkMapa, String pets_allowed) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
        this.web_site = web_site;
        this.operator = operator;
        this.opening_hours = opening_hours;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.internet_access = internet_access;
        this.stars = stars;
        this.rooms = rooms;
        this.smoking = smoking;
        this.swimming_pool = swimming_pool;
        this.building = building;
        this.linkMapa = linkMapa;
        this.pets_allowed = pets_allowed;
    }
}
