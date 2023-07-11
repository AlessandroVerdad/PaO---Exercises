package com.nbicocchi.exercises.collections.lists.c;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class _SortAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

    }

    public static void sortByAmount(List<Account> accounts) {
        accounts.sort(Comparator.comparingDouble(w -> w.amount));
        accounts.sort((a1, a2) -> (int) (a1.amount - a2.amount));

    }
    public static void sortByInterestRate(List<Account> accounts) {
        accounts.sort(Comparator.comparingDouble(w -> w.interestRate));

    }
    public static void sortByDuePayment(List<Account> accounts) {
        accounts.sort(Comparator.comparing(w -> w.duePayment));
        //accounts.sort((a1, a2) -> (a1.duePayment.compareTo(a2.duePayment)));
    }
}


