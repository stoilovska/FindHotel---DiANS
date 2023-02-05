package mk.ukim.finki.findhotel.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactRestController {
    @GetMapping
    public String getContactPage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Contact</title>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "<header style=\"margin-left: 7px;margin-top: -7px; background: bisque; width: 1500px; height: 58px\">\n" +
                "\n" +
                "    <div style=\"padding-top: 18px\">\n" +
                "        <a class=\"nav-link active\" href=\"/api/home\"\n" +
                "           style=\"margin-left: 58px; text-decoration: none; font-size: 28px; font-weight: bold; color: crimson; font-family: 'Brush Script MT'; letter-spacing: 2px;\">\n" +
                "            FindHotel\n" +
                "        </a>\n" +
                "    </div>\n" +
                "\n" +
                "    <div style=\"margin-top: -30px\">\n" +
                "        <a class=\"nav-link active\" href=\"/api/home\"\n" +
                "           style=\"margin-left: 518px; text-decoration: none; font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "            Почетна\n" +
                "        </a>\n" +
                "        <a class=\"nav-link active\" href=\"/hotels\"\n" +
                "           style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "            Хотели\n" +
                "        </a>\n" +
                "\n" +
                "        <a class=\"btn btn-success btn-sm-ml-3\" href=\"/api/aboutUs\"\n" +
                "           style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "            <i class=\"fa fa-shopping-cart\"></i>За нас\n" +
                "        </a>\n" +
                "\n" +
                "        <a class=\"btn btn-light btn-sm-ml-3\" href=\"/api/contact\"\n" +
                "           style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: crimson\">\n" +
                "            <i class=\"fa fa-shopping-cart\"></i>Контакт\n" +
                "        </a>\n" +
                "\n" +
                "        <br>\n" +
                "    </div>\n" +
                "</header>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "\n" +
                "<div style=\"margin-left: 588px; margin-top: -23px;\">\n" +
                "    <div style=\"font-family: 'Brush Script MT,cursive'; background: pink;  border-radius: 25px;height: 287px; width: 488px\">\n" +
                "\n" +
                "        <div style=\"margin-left: 86px; font-size: 18px; font-weight: normal\">\n" +
                "            <br>\n" +
                "           <span>\n" +
                "        Теодора Стоиловска\n" +
                "        <br>\n" +
                "        teodora.stoilovska@students.finki.ukim.mk\n" +
                "           </span>\n" +
                "            \n" +
                "            <br>\n" +
                "            <br>\n" +
                "\n" +
                "\n" +
                "            <span>\n" +
                "        Викторија Серафимовска\n" +
                "        <br>\n" +
                "        viktorija.serafimovska@students.finki.ukim.mk\n" +
                "    </span>\n" +
                "            <br>\n" +
                "            <br>\n" +
                "\n" +
                "\n" +
                "            <span>\n" +
                "        Габриела Шурбеска\n" +
                "        <br>\n" +
                "        gabriela.shurbeska@students.finki.ukim.mk\n" +
                "    </span>\n" +
                "            <br>\n" +
                "            <br>\n" +
                "\n" +
                "            <span>\n" +
                "        Љубица Серафимовска\n" +
                "        <br>\n" +
                "        ljubica.serafimovska@students.finki.ukim.mk\n" +
                "    </span>\n" +
                "\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <br>\n" +
                "    <br>\n" +
                "\n" +
                "    <div>\n" +
                "        <a href=\"/api/home\">\n" +
                "            <img src=\"http://localhost:63342/FindHotel/templates/img/318827133_2324966554339315_7591477000255443717_n.png\" style=\"height: 180px; width: 400px; border-radius: 18px; margin-left: 38px\">\n" +
                "        </a>\n" +
                "    </div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<footer style=\"margin-top: 68px\">\n" +
                "    <hr>\n" +
                "    <span style=\"margin-left: 728px\"> ©2022. FindHotel Скопје</span>\n" +
                "</footer>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
