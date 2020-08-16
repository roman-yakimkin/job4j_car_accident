package ru.job4j.accident.model;

import java.util.Objects;

/**
 * The authority class
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.08.2020
 * @version 1.0
 */
public class Authority {
    private int id;
    private String authority;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Authority)) return false;
        Authority authority = (Authority) o;
        return getId() == authority.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
