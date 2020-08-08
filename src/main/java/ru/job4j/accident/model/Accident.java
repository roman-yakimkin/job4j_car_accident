package ru.job4j.accident.model;

import java.util.Objects;

/**
 * The class for Model accident
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.07.2020
 * @version 1.0
 */
public class Accident {
    private Integer id = 0;
    private String name;
    private String text;
    private String address;

    public Accident() {
    }

    public Accident(String name, String text, String address) {
        this.name = name;
        this.text = text;
        this.address = address;
    }

    public Accident(Integer id, String name, String text, String address) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accident)) return false;
        Accident accident = (Accident) o;
        return id.equals(accident.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
