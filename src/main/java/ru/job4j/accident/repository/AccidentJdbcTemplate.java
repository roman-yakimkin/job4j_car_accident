package ru.job4j.accident.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.List;

/**
 * The Accident JDBC Template class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.07.2020
 * @version 1.0
 */
@Repository
public class AccidentJdbcTemplate {
    private final JdbcTemplate jdbc;

    public AccidentJdbcTemplate(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Accident save(Accident accident) {
        if (accident.getId() == 0) {
            return insert(accident);
        } else {
            return update(accident);
        }
    }

    private Accident insert(Accident accident) {
        jdbc.update("insert into accident (name, text, address) values (?, ?, ?) ",
                accident.getName(), accident.getText(), accident.getAddress());
        return accident;
    }

    private Accident update(Accident accident) {
        jdbc.update("update accident set name = ?, text = ?, address = ? where id = ?",
                accident.getName(), accident.getText(), accident.getAddress(), accident.getId());
        return accident;
    }

    public Accident getAccident(int accidentId) {
        return jdbc.queryForObject("select id, name, text, address from accident where id = ?",
                (rs, row) -> {
                    return new Accident(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("text"),
                            rs.getString("address"));
                }, accidentId);
    }

    public List<Accident> getAll() {
        return jdbc.query("select id, name, text, address from accident",
                (rs, row) -> {
                    Accident accident = new Accident();
                    accident.setId(rs.getInt("id"));
                    accident.setName(rs.getString("name"));
                    accident.setText(rs.getString("text"));
                    accident.setAddress(rs.getString("address"));
                    return accident;
                });
    }

    public void delete(int accidentId) {
        jdbc.update("delete from accident where id = ?", accidentId);
    }
}
