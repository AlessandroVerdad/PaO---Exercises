package com.nbicocchi.exercises.collections.lists;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class _SortAccount {

    public static void sortByAmount(List<Account> accounts) {
        Comparator<Account> amountComp = (a1, a2) -> Double.compare(a1.getAmount(), a2.getAmount());    //  comparator
        accounts.sort(amountComp);
    }

    public static void sortByInterestRate(List<Account> accounts) {
        Comparator<Account> interestComp = (a1, a2) -> Double.compare(a1.getInterestRate(), a2.getInterestRate());    //  comparator
        accounts.sort(interestComp);
    }

    public static void sortByDuePayment(List<Account> accounts) {
        Comparator<Account> paymentComp = (a1, a2) -> a1.getDuePayment().compareTo(a2.getDuePayment());    //  comparator
        accounts.sort(paymentComp);
    }

    /*  Support class: 'Account'    */
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        //  constructor
        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        //  setters, getters
        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }
    }

}
