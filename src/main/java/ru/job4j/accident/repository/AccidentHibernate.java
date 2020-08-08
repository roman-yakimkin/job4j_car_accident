package ru.job4j.accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.job4j.accident.model.Accident;

import java.util.List;

/**
 * The class for working with the database via Hibernate
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.07.2020
 * @version 1.0
 */
public class AccidentHibernate {
    private final SessionFactory sf;

    public AccidentHibernate(SessionFactory sf) {
        this.sf = sf;
    }

    public List<Accident> getAll() {
        try (Session session = sf.openSession()) {
            return session
                    .createQuery("from Accident", Accident.class)
                    .list();
        }
    }

    public Accident getAccident(int id) {
        try (Session session = sf.openSession()) {
            return session
                    .createQuery("from ru.job4j.accident.model.Accident where id = :id", Accident.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

    public void save(Accident accident) {
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            if (accident.getId() == 0){
                accident.setId(null);
                session.save(accident);
            } else {
                session.update(accident);
            }
            session.getTransaction().commit();
        }
    }

    public void delete(int id) {
        try (Session session = sf.openSession()) {
            Accident accident = new Accident();
            accident.setId(id);
            session.beginTransaction();
            session.delete(accident);
            session.getTransaction().commit();
        }
    }

}
