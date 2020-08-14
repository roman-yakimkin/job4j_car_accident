package ru.job4j.accident;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * The class for executing the main function
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 13.08.2020
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pwd = encoder.encode("password");
        System.out.println(pwd);
    }
}
