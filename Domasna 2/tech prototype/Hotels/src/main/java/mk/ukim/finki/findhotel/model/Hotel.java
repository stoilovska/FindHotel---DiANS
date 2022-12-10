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

    private String name;

    private Double lon;

    private Double lat;

    private String web_site;

    private String operator;

    private String opening_hours;

    private String email;

    private String phone;

    private String country;

    private String city;

    private String street;

    private String house_number;

    private String internet_access;

    private Integer stars;

    private Integer rooms;

    private String smoking;

    private String swimming_pool;

    private String building;

    @Column(length = 4000)
    private String linkMapa;

    private String pets_allowed;

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
