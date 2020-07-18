package ru.job4j.accident.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * The index controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        List<String> list = List.of(
                "Beatles",
                "Rolling Stones",
                "Doors",
                "Who",
                "Kinks",
                "Cream",
                "Yardbirds",
                "Hollies",
                "Animals",
                "Ventures"
        );

        model.addAttribute("rockBands60", list);
        return "index";
    }
}
