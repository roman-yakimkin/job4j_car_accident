package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

/**
 * The accident controller class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.07.2020
 * @version 1.0
 */
@Controller
@RequestMapping("/item")
public class AccidentControl {
    private final AccidentMem accidents;

    public AccidentControl(AccidentMem accidents) {
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
            Accident accident = accidents.getAccident(1);
            model.addAttribute("item", accident);
        } catch (NumberFormatException e) {
            path = "redirect:/";
        }
        return path;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.create(accident);
        return "redirect:/";
    }
}
