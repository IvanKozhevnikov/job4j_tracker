package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка.
 * Класс осуществляет доступ к полям passport и username
 * и возможности их сравнения.
 *
 * @author IVAN KOZHEVNIKOV
 * @version 1.0
 */
public class User {

    /**
     * Через данное поле осуществляется доступ к номеу паспорта пользователя.
     */
    private String passport;

    /**
     * Через данное поле осуществляется доступ к имени пользователя.
     */
    private String username;

    /**
     * Метод принимает на вход номер паспорта и имя пользователя.
     * и после этого изменяет свойства класса записывая значения в переменные.
     *
     * @param passport номер паспорта пользователя.
     * @param username имя пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает значение переменной номера паспорта пользователя.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход номер паспорта пользователя.
     * и после этого изменяет свойства класса записывая значения в переменную.
     *
     * @param passport номер паспорта пользователя.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает значение переменной имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает на вход имя пользователя.
     * и после этого изменяет свойства класса записывая значения в переменную.
     *
     * @param username имя пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals,
     * после которого метод учитывает содержание полей,
     * возвращая результат сравнения вводимого значения с содержанием поля.
     *
     * @param o переменная класса Object.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hashCode,
     * создаёт низкую вероятность возникновения переменных с одинаковым адресом.
     * Возращает этот метод хеш код переменной.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}