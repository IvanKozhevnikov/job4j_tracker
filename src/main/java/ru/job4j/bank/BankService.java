package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User a = findByPassport(passport); //получили пользователя по паспорту, записали в переменную
        if (a != null) { // проверили что переменная не null
            List<Account> b = users.get(a); // по переменной получили список аккаунтов из карты , записали полученный список в переменную
            if (!b.contains(account)) { //проверили список есть ли там добавляемый аккаунт с помощью contains
                users.put(passport, new ArrayList<Account>(account.setRequisite())); // не пойму что нужно сделать?
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().contains(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User a = findByPassport(passport);
        if (a != null) {
            List<Account> b = users.get(a);
            for (Account account : b) {
                if (account.getRequisite().contains(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        //это пока не трогал
        boolean rsl = false;
        return rsl;
    }
}