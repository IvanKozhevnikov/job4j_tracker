package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счёта.
 * Класс осуществляет доступ к полям requisite и balance и возможности их сравнения.
 *
 * @author IVAN KOZHEVNIKOV
 * @version 1.0
 */
public class Account {

    /**
     * Через данное поле осуществляется доступ к номерам реквезитов счетов.
     */
    private String requisite;

    /**
     * Через данное поле осуществляется доступ к сумме денежных средств
     * находящихся на счетах.
     */
    private double balance;

    /**
     * Метод принимает на вход реквизиты и сумму денежных средств.
     * и после этого изменяет свойства класса записывая значения в переменные.
     *
     * @param requisite реквизиты счёта.
     * @param balance сумма денежных средств счёта.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает значение реквизитов счёта.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход реквизиты счёта.
     * и после этого изменяет свойства класса записывая значения в переменную.
     *
     * @param requisite реквизиты счёта.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает значение суммы денежных средств счёта.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход сумму денежных средств счёта.
     * и после этого изменяет свойства класса записывая значения в переменную.
     *
     * @param balance сумма денежных средств счёта.
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод переопределяет метод hashCode,
     * создавая низкую вероятность возникновения переменных с одинаковым адресом.
     * Возращает этот медод хеш код переменной.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}