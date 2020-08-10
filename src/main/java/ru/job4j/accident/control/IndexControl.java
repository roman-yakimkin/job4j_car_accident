package ru.job4j.accident.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.repository.AccidentHibernate;
import ru.job4j.accident.repository.AccidentJdbcTemplate;
import ru.job4j.accident.repository.AccidentRepository;

/**
 * The index controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
@Controller
public class IndexControl {

    private AccidentRepository accidentRepository;


    public IndexControl(AccidentRepository accidentRepository) {
        this.accidentRepository = accidentRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", accidentRepository.findAll());
        return "index";
    }
}
