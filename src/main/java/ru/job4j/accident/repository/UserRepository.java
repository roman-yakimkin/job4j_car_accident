package ru.job4j.accident.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.accident.model.User;

/**
 * The JPA repository for users
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 16.08.2020
 * @version 1.0
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
