package com.nbicocchi.exercises.functional.c;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class _BankAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;
    }

    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream()
                .filter(a -> a.duePayment.isAfter(LocalDateTime.now()))
                .peek(a -> a.amount *= a.interestRate)
                //  NOT .map(a -> a.amount *= a.interestRate) ---> this would turn the Stream<Account> into a Stream<Double>
                .sorted(Comparator.comparingDouble(a -> a.amount))
                .toList();
    }
}
