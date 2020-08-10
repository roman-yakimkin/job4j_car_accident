package ru.job4j.accident.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.accident.model.Accident;

/**
 * Implementation for Accident repository
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 10.08.2020
 * @version 1.0
 */
public interface AccidentRepository extends JpaRepository<Accident, Integer> {
}
