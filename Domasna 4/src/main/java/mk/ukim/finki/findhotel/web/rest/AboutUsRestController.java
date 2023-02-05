package mk.ukim.finki.findhotel.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aboutUs")
public class AboutUsRestController {
    @GetMapping
    public String getAboutUsPage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>About Us</title>\n" +
                "    <style>\n" +
                "        /*.content{*/\n" +
                "        /*    background-image: url(\"img/pozadina.jpg\");*/\n" +
                "        /*    background-repeat: no-repeat;*/\n" +
                "        /*    !*background-attachment: fixed;*!*/\n" +
                "        /*    background-size: 1522px 753px;*/\n" +
                "        /*    width: 1200px;*/\n" +
                "        /*    height: 708px;*/\n" +
                "        /*}*/\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body class=\"content\">\n" +
                "<header style=\"margin-left: 7px;margin-top: -7px; background: bisque; width: 1500px; height: 58px\">\n" +
                "\n" +
                "    <div style=\"padding-top: 18px\">\n" +
                "        <a class=\"nav-link active\" href=\"/api/home\"\n" +
                "           style=\"margin-left: 58px; text-decoration: none; font-size: 28px; font-weight: bold; color: crimson; font-family: 'Brush Script MT'; letter-spacing: 2px;\">\n" +
                "            <b>FindHotel</b>\n" +
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
                "           style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: crimson\">\n" +
                "            <i class=\"fa fa-shopping-cart\"></i>За нас\n" +
                "        </a>\n" +
                "\n" +
                "        <a class=\"btn btn-light btn-sm-ml-3\" href=\"/api/contact\"\n" +
                "           style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "            <i class=\"fa fa-shopping-cart\"></i>Контакт\n" +
                "        </a>\n" +
                "\n" +
                "        <br>\n" +
                "    </div>\n" +
                "</header>\n" +
                "<br>\n" +
                "<br>\n" +
                "<div style=\"margin-left: 466px; margin-top: 46px; font-family: 'Brush Script MT'; background: pink;  border-radius: 25px;height: 190px; width: 598px\">\n" +
                "    <div style=\"width: 408px; margin-left: 100px; padding-top: 40px;  text-align: justify;\">\n" +
                "    <span>\n" +
                "        <b style=\"margin-left: 117px\">За апликацијата</b>\n" +
                "        <br>\n" +
                "        </span>\n" +
                "        <br>\n" +
                "        На апликацијата Find Hotel со само еден клик на селектираниот хотел ќе се прикажат сите детали за самиот хотел,\n" +
                "        па така корисниците веднаш ќе знаат со што располага истиот и дали им одговара.\n" +
                "    </div>\n" +
                "</div>\n" +
                "<div style=\"margin-left: 589px; margin-top: 48px; font-family: 'Brush Script MT'; background: pink;  border-radius: 25px;height: 170px; width: 598px\">\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <div style=\"width: 408px; margin-left: 100px; margin-top: -23px;   text-align: justify;\">\n" +
                "    <span>\n" +
                "        <b style=\"margin-left: 148px\">За нас</b>\n" +
                "        <br>\n" +
                "        </span>\n" +
                "        <br>\n" +
                "        Ние сме група студенти, чија цел е да им овозможи на корисниците на едно место да ги пронајдат сите хотели кои\n" +
                "        се наоѓаат на територија на град Скопје.\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<footer style=\"margin-top: 128px\">\n" +
                "    <hr>\n" +
                "    <span style=\"margin-left: 728px\"> ©2022. FindHotel Скопје</span>\n" +
                "</footer>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
