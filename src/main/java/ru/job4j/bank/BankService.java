package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает модель банковской системы,
 * в системе можно производить следующие действия
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя
 * системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 *
 * @author IVAN KOZHEVNIKOV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход номер паспорта, имя пользователя
     * и добавляет эти данные в систему.
     *
     * @param user пользователь который добавляется в систему.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счёт к пользователю.
     * Метод принимает на вход номер паспорта и новые реквизиты
     * и количество средств на баланс (т.е. данные нового счёта).
     * Вначале метод по номеру паспорта находит пользователя в системе
     * и после этого добавляет новый счёт, если такого счёта не существует.
     *
     * @param passport данные по которым осуществляется поиск пользователя.
     * @param account  данные нового счёта пользователя.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> findUser = findByPassport(passport);
        if (findUser.isPresent()) {
            List<Account> listAccount = users.get(findUser.get());
            if (!listAccount.contains(account)) {
                listAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * Метод принимает на вход номер паспорта и
     * возвращает данные о пользователе если он есть в системе.
     *
     * @param passport номер паспорта по которому осуществляется
     *                 поиск пользователя.
     * @return возвращает данные о пользователе если он есть в
     * системе или null если нет.
     */

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();

    }


    /**
     * Метод ищет пользователя по реквизитам.
     * Метод принимает на вход номер паспорта и реквизиты
     * вначале осуществляется поиск наличия пользователя в системе,
     * затем по реквизитам осуществляется поиск счёта.
     *
     * @param passport  номер паспорта по которому осуществляется
     *                  поиск пользователя.
     * @param requisite реквизиты по которым осуществляется поиск счёта.
     * @return метод возвращает счёт если он найден или null если нет.
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> findUser = findByPassport(passport);
        return findUser.flatMap(user -> users.get(user)
                .stream()
                .filter(a -> a.getRequisite()
                        .equals(requisite))
                .findFirst());
    }

    /**
     * Метод осуществляет перевод денег с одного счёта на другой.
     * Метод принимает на вход номер паспорта, реквизиты счёта
     * с которого будет осуществляться перевод денежных средств,
     * ещё метод принимает номер паспорта, реквизиты счёта
     * на который необходимо эти денежные средства перевести и
     * принимает размер суммы денежных средств используемых при переводе.
     * Если оба счёта существуют и на первом счёте достаточно денежных средств,
     * то метод осуществляет перевод денежных средств и
     *
     * @param srcPassport   номер паспорта пользователя от которого переводятся денежные средства.
     * @param srcRequisite  реквизиты счёта пользователя от которого переводятся денежные средства.
     * @param destPassport  номер паспорта пользователя которому переводятся денежные средства.
     * @param destRequisite реквизиты счёта пользователя которому переводятся денежные средства.
     * @param amount        сумма перевода.
     * @return возвращает true, в противном случае false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount.get().getBalance() >= amount)) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

}