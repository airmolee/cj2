//Создать базовый класс – работник, и производные классы – служащий с почасовой оплатой, служащий в штате и служащий с процентной ставкой. Определить функцию начисления зарплаты.
package org.example;

abstract class Worker {
    String name;
    public Worker(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}

class HourlyWorker extends Worker {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyWorker(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class StaffWorker extends Worker {
    private double fixedSalary;

    public StaffWorker(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

class CommissionedWorker extends Worker {
    private double salesAmount;
    private double commissionRate;

    public CommissionedWorker(String name, double salesAmount, double commissionRate) {
        super(name);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return salesAmount * commissionRate;
    }

}
