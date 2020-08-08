package ru.job4j.accident.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;
import ru.job4j.accident.repository.AccidentJdbcTemplate;

/**
 * The accident controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.07.2020
 * @version 1.0
 */
@Controller
@RequestMapping("/accident")
public class AccidentControl {

    private final AccidentHibernate accidents;

    public AccidentControl(AccidentHibernate accidents) {
        this.accidents = accidents;
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
            Accident accident = accidents.getAccident(accidentId);
            model.addAttribute("item", accident);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            path = "redirect:/";
        }
        return path;
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String id) {
        try {
            int accidentId = Integer.parseInt(id);
            accidents.delete(accidentId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.save(accident);
        return "redirect:/";
    }
}
