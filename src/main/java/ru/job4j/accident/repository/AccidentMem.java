package ru.job4j.accident.repository;

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

    public Map<Integer, Accident> getAccidents() {
        return accidents;
    }
}
