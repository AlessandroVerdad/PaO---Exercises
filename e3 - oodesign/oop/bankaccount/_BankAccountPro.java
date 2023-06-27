package com.nbicocchi.exercises.oop.bankaccount;

public class _BankAccountPro extends AbstractBankAccount {
    /**
     * Construct a new BankAccount
     *
     * @param IBAN    the IBAN of the account
     * @param balance the initial balance of the account
     *                param 'operationFee' the fee to be applied to deposit and withdraw operations
     *                param 'interestRate' the interest rate to be applied
     */
    public _BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.2);
    }

    @Override
    public double withdraw(double amount) {
        applyFee();
        return super.withdraw(amount);  //  don't need to check ---> Pro accounts can have negative 'balance'
    }

    public void deposit(double amount) {
        applyFee();
        super.deposit(amount);
    }


}
