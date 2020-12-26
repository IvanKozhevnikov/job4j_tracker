package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!(users.containsKey(user.getPassport()))) {
            users.put(user, new ArrayList<Account>());
            //вроде сделал как в описании задачи, но не пойму что сделал))?
        }
    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            users.put() {
// В описании задачи написано: После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
                //не понятно как добавлять аккаунт, потомучто в методе addUser мы же добавили, только что))?
            }
        }
    }

    public User findByPassport(String passport) {
        // с этим методом вроде понятно, правда незнаю на сколько я прав!
        for (User user : users.keySet()) {
            if (user.getPassport().contains(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        //с этим методом тоже вроде всё понятно, но незнаю на сколько я прав!
        for (Account account : users.get(passport)) {
            if (account.getRequisite().contains(requisite)) {
                return account;
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