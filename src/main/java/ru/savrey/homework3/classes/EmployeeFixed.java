package ru.savrey.homework3.classes;

public class EmployeeFixed extends Employee{

    private int wageRate;

    public int getWageRate() {
        return wageRate;
    }

    public void setWageRate(int wageRate) {
        this.wageRate = wageRate;
    }

    public EmployeeFixed(String firstName, String lastName, int wageRate) {
        super(firstName, lastName);
        this.wageRate = wageRate;
    }

    @Override
    float calculateSalary() {
        return this.wageRate;
    }



}
