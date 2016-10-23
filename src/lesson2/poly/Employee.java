package lesson2.poly;

import java.util.Date;

public abstract class Employee {
    private long ID;
    private int balance;
    private String name;
    private Date date;
    private int salary;
    private double kpi;
    private int rang;

    public Employee() {
    }

    public Employee(int rang, Date date, int balance, int salary, double kpi, String name) {
        this.rang = rang;
        this.date = date;
        this.salary = salary;
        this.balance = balance;
        this.kpi = kpi;
        this.name = name;
    }

    void withdraw(int summ) {
        double commission = summ * 0.05;
        if(commission + summ <= balance) {
            balance -= commission + summ;
            System.out.println("Good :" + commission + summ);
        }
    }

    abstract void paySalary();


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getKpi() {
        return kpi;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }
}
