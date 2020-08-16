package ru.job4j.accident.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.accident.model.Authority;

/**
 * The JPA repository for authorities
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.08.2020
 * @version 1.0
 */
public interface AuthorityRepository extends CrudRepository<Authority, Integer> {
    Authority findByAuthority(String authority);
}
