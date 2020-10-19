package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sergey
 */
public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    public User findByPassport(String passport) {

        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }


        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        User findUser = findByPassport(passport);
        Account rsl = null;
        if (findUser != null) {
            for (Account account : users.get(findByPassport(passport))) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }

        }
        return rsl;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport,srcRequisite);

        Account destAccount = findByRequisite(destPassport,destRequisite);

        if(srcAccount !=null && destAccount != null && (srcAccount.getBalance() -amount>=0)){
            srcAccount.setBalance(srcAccount.getBalance()- amount);
            destAccount.setBalance(destAccount.getBalance()+ amount);
            rsl=true;
        }
        return rsl;
    }

}
