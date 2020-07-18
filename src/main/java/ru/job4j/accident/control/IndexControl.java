package ru.job4j.accident.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.repository.AccidentMem;

import java.util.List;

/**
 * The index controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
@Controller
public class IndexControl {

    @Autowired
    AccidentMem accidentMem;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", accidentMem.getAccidents());
        return "index";
    }
}
