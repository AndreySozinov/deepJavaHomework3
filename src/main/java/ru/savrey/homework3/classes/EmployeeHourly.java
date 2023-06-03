package ru.savrey.homework3.classes;

public class EmployeeHourly extends Employee{

    private int wageRate;

    public int getWageRate() {
        return wageRate;
    }

    public void setWageRate(int wageRate) {
        this.wageRate = wageRate;
    }

    public EmployeeHourly(String firstName, String lastName, int wageRate) {
        super(firstName, lastName);
        this.wageRate = wageRate;
    }

    @Override
    float calculateSalary() {
        return (float) (20.8 * 8 * this.wageRate);
    }


}
