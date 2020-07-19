package ru.job4j.accident.model;

import java.util.Objects;

/**
 * The class for Model accident
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
public class Accident {
    private final int id;
    private final String name;
    private final String text;
    private final String address;

    public Accident(int id, String name, String text, String address) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accident)) return false;
        Accident accident = (Accident) o;
        return id == accident.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
