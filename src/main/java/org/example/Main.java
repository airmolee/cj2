
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Worker hourlyWorker = new HourlyWorker("Иван",40, 10);
        Worker staffWorker = new StaffWorker("Николай", 10000);
        Worker commissionedWorker = new CommissionedWorker("Кирилл", 10000, 10);
        System.out.println("Employee with hourly pay:  " + hourlyWorker.calculateSalary());
        System.out.println("Employee in the state: " + staffWorker.calculateSalary());
        System.out.println("Employee with an interest rate: " + commissionedWorker.calculateSalary());
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        System.out.println("Deposit: " + bankAccount.getBalance());
        bankAccount.deposit(500);
        System.out.println("The second deposit: " + bankAccount.getBalance());
        bankAccount.withdraw(700);
        System.out.println("Withdraw: " + bankAccount.getBalance());
        CardAccount cardAccount = new CardAccount();
        cardAccount.deposit(2000);
        System.out.println("Topping up the card: " + cardAccount.getBalance());
        cardAccount.withdraw(1000);
        System.out.println("Withdrawal from the card: " + cardAccount.getBalance());
     }
}