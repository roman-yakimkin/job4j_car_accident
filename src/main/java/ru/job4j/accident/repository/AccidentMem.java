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
    private int id = 5;

    public AccidentMem() {
        accidents.put(1, new Accident(1, "Accident 1", "Description of Accident 1", "Address 1"));
        accidents.put(2, new Accident(2, "Accident 2", "Description of Accident 2", "Address 2"));
        accidents.put(3, new Accident(3, "Accident 3", "Description of Accident 3", "Address 3"));
        accidents.put(4, new Accident(4, "Accident 4", "Description of Accident 4", "Address 4"));
    }

    public void create(Accident accident) {
        if (accident.getId() == 0){
            accident.setId(newId());
        }
        accidents.put(accident.getId(), accident);
    }

    public int newId(){
        return id++;
    }

    public Map<Integer, Accident> getAccidents() {
        return accidents;
    }

    public Accident getAccident(int id) {
        return accidents.get(id);
    }
}
