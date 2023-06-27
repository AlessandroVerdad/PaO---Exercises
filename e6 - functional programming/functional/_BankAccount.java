package com.nbicocchi.exercises.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class _BankAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public static List<Account> applyInterest(List<Account> accounts) {

            return accounts.stream()
                    .filter(a -> a.duePayment.isBefore(LocalDateTime.now()))    //  a
                    .peek(Account::applyInterest)                               //  b
                    //.sorted((a,b) -> Double.compare(a.amount, b.amount))      //  c
                    .sorted((a1, a2) -> (int) a1.amount - (int) a2.amount)      //  c
                    .collect(Collectors.toList());                              //  d
        }

        public void applyInterest() {
            amount += amount * interestRate;
        }

    }

}
