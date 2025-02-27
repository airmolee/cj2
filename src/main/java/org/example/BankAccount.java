//В проекте найдите класс BankAccount и унаследованные от него классы CardAccount и DepositAccount. Реализуйте методы классов, при необходимости переопределите методы в наследниках так, чтобы выполнялись условия пополнения и снятия: BankAccount — пополнение и списание происходит без комиссии. Если передать в метод пополнения отрицательное значение, сумма на счёте не должна измениться. При попытке снять большую сумму, чем есть на счёте, сумма не списывается со счёта, сумма на счёте не изменяется. CardAccount — карточный счёт, в дополнение к условиям BankAccount — при снятии денег должна взиматься комиссия 1% от суммы списания. Пример: при попытке снять со счёта 100 рублей должен списаться 101 рубль. DepositAccount — депозитный расчётный счёт, в дополнение к условиям BankAccount — нельзя снимать деньги в течение одного месяца после последнего пополнения. Переменную, в которой хранится дата последнего внесения, назовите lastIncome. Тип переменной используйте Calendar или LocalDate.

package org.example;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
class CardAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 0.01;

    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount * (1 + WITHDRAWAL_FEE);
        if (amount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            return true;
        }
        return false;
    }
}



