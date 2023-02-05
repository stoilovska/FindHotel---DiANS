package mk.ukim.finki.findhotel.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeRestController {
    @GetMapping
    public String getContactPage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Home</title>\n" +
                "    <style th:inline=\"text\">\n" +
                "\n" +
                "\n" +
                "        footer {\n" +
                "            margin: auto;\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<!--<body style=\"background-image: url('img/pozadina.jpg'); background-repeat: no-repeat; background-size: 1522px 717px; width: 1200px;-->\n" +
                "<!-- <body class=\"container\" style=\"background: url('../static/images/pozadina.jpg') center no-repeat; background-size:cover; padding:200px;\">-->\n" +
                "<!-- <img th:src=\"@{/images/pozadina.jpg}\">-->\n" +
                "\n" +
                "<body class=\"container\">\n" +
                "\n" +
                "<div>\n" +
                "    <header style=\"margin-left: 7px;margin-top: -7px; background: bisque; width: 1500px; height: 58px\">\n" +
                "\n" +
                "        <div style=\"padding-top: 18px\">\n" +
                "            <a class=\"nav-link active\" href=\"/api/home\"\n" +
                "               style=\"margin-left: 58px; text-decoration: none; font-size: 28px; font-weight: bold; color: crimson; font-family: 'Brush Script MT'; letter-spacing: 2px;\">\n" +
                "                FindHotel\n" +
                "            </a>\n" +
                "        </div>\n" +
                "\n" +
                "        <div style=\"margin-top: -30px\">\n" +
                "            <a class=\"nav-link active\" href=\"/api/home\"\n" +
                "               style=\"margin-left: 518px; text-decoration: none; font-size: 21px; font-weight: bold; color: crimson\">\n" +
                "                Почетна\n" +
                "            </a>\n" +
                "            <a class=\"nav-link active\" href=\"/hotels\"\n" +
                "               style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "                Хотели\n" +
                "            </a>\n" +
                "\n" +
                "            <a class=\"btn btn-success btn-sm-ml-3\" href=\"/api/aboutUs\"\n" +
                "               style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "                <i class=\"fa fa-shopping-cart\"></i>За нас\n" +
                "            </a>\n" +
                "\n" +
                "            <a class=\"btn btn-light btn-sm-ml-3\" href=\"/api/contact\"\n" +
                "               style=\"margin-left: 110px; text-decoration: none;font-size: 21px; font-weight: bold; color: saddlebrown\">\n" +
                "                <i class=\"fa fa-shopping-cart\"></i>Контакт\n" +
                "            </a>\n" +
                "\n" +
                "            <br>\n" +
                "        </div>\n" +
                "    </header>\n" +
                "\n" +
                "    <div style=\"margin-left: 538px; margin-top: 126px; font-family: 'Brush Script MT'; background: pink;  border-radius: 25px;height: 388px; width: 598px\">\n" +
                "        <br>\n" +
                "        <br>\n" +
                "\n" +
                "        <div style=\"font-size: 18px; margin-left: 20px; \">\n" +
                "\n" +
                "            <h3 style=\"margin-left: 108px; font-family: 'Brush Script MT'\">Одберете го најдобриот хотел за вас</h3>\n" +
                "            <br>\n" +
                "\n" +
                "            Кликнете <a href=\"/hotels\" style=\"text-decoration: none; color: black; font-weight: bold; font-size: 20px;font-family: 'Brush Script MT'\">ОВДЕ</a> за да Ви се\n" +
                "            прикажат сите достапни хотели во Скопје.\n" +
                "\n" +
                "            <br>\n" +
                "\n" +
                "            <ul style=\"font-family: 'Brush Script MT'; font-size: 20px\">\n" +
                "                <li>\n" +
                "                    Ви нудиме и приказ на мапа\n" +
                "                </li>\n" +
                "                <br>\n" +
                "                <li>\n" +
                "                    Сите хотели во Скопје\n" +
                "                </li>\n" +
                "                <br>\n" +
                "                <li>\n" +
                "                    Можност за додавање на новоизграден хотел\n" +
                "                </li>\n" +
                "                <br>\n" +
                "                <li>\n" +
                "                    Приказ на сите достапни детали за избраниот хотел\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <footer style=\"margin-top: 108px; margin-left: 5px\">\n" +
                "        <hr>\n" +
                "        <span style=\"margin-left: 728px\"> ©2022. FindHotel Скопје</span>\n" +
                "    </footer>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }
}
