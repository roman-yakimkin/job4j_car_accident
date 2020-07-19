package ru.job4j.accident.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.HashMap;
import java.util.Map;

/**
 * The storage for Accidents
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
@Repository
public class AccidentMem {
    private Map<Integer, Accident> accidents = new HashMap<>();

    public AccidentMem() {
        accidents = Map.of(
                1, new Accident(1, "Accident 1", "Description of Accident 1", "Address 1"),
                2, new Accident(2, "Accident 2", "Description of Accident 2", "Address 2"),
                3, new Accident(3, "Accident 3", "Description of Accident 3", "Address 3"),
                4, new Accident(4, "Accident 4", "Description of Accident 4", "Address 4")
        );
    }

    public Map<Integer, Accident> getAccidents() {
        return accidents;
    }
}
