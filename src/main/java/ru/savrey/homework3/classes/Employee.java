package ru.savrey.homework3.classes;

public abstract class Employee implements Comparable<Employee>{

    protected String firstName;

    protected String lastName;

    abstract float calculateSalary();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " - " + calculateSalary() + " руб.";
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.calculateSalary() - o.calculateSalary());
    }
}
