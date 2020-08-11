package ru.job4j.accident.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;
import ru.job4j.accident.repository.AccidentJdbcTemplate;
import ru.job4j.accident.repository.AccidentRepository;

import java.util.Optional;

/**
 * The accident controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.07.2020
 * @version 1.0
 */
@Controller
@RequestMapping("/accident")
public class AccidentControl {
    private final AccidentRepository accidentRepository;
    private static final Logger logger = LoggerFactory.getLogger(AccidentControl.class);

    public AccidentControl(AccidentRepository accidentRepository) {
        this.accidentRepository = accidentRepository;
    }

    @GetMapping("/create")
    public String create() {
        return "accident/create";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable String id, Model model) {
        String path = "accident/edit";
        try {
            int accidentId = Integer.parseInt(id);
            Optional<Accident> accident = accidentRepository.findById(accidentId);
            if (accident.isEmpty()) {
                throw new NullPointerException("Can't find an accident with this id");
            }
            model.addAttribute("item", accident.get());
        } catch (Exception e) {
            logger.debug(e.getMessage());
            e.printStackTrace();
            path = "redirect:/";
        }
        return path;
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String id) {
        try {
            int accidentId = Integer.parseInt(id);
            accidentRepository.deleteById(accidentId);
        } catch (NumberFormatException e) {
            logger.debug(e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidentRepository.save(accident);
        return "redirect:/";
    }
}
