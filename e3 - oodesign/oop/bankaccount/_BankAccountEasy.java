package com.nbicocchi.exercises.oop.bankaccount;

/**
 * Simple bank account. Supports national transfers, pays no interest, do not apply any fee.
 */

public class _BankAccountEasy extends AbstractBankAccount {
    /**
     * Construct a new BankAccount
     *
     * @param IBAN    the IBAN of the account
     * @param balance the initial balance of the account
     *                param 'operationFee' ---> DO NOT EXSITS in the easy version
     *                param 'interestRate' ---> DO NOT EXSISTS in the easy version
     */
    public _BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
    }

    @Override
    public double withdraw(double amount) {
        double allowedAmount = Math.min(amount, balance);
        return super.withdraw(allowedAmount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        //  Check for international payment
        String countryCodeSrc = IBAN.substring(0, 2);
        String countryCodeDst = other.getIBAN().substring(0, 2);

        if (!countryCodeDst.equals(countryCodeSrc))
            throw new IllegalArgumentException("International transfers invalid");

        double allowedAmount = withdraw(amount);    //  -- subtract -- the money + return the allowed amount
        other.deposit(allowedAmount);   //  -- add the money --
        return allowedAmount;   //  respect the declaration
    }
}
