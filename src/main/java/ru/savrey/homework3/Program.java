package ru.savrey.homework3;

import ru.savrey.homework3.classes.Employee;
import ru.savrey.homework3.classes.EmployeeFixed;
import ru.savrey.homework3.classes.EmployeeHourly;
import ru.savrey.homework3.classes.EmployeesArray;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = {
                new EmployeeHourly("Вася", "Петров", 100),
                new EmployeeHourly("Петя", "Иваное", 720),
                new EmployeeHourly("Сеня", "Сидоров", 280),
                new EmployeeHourly("Ваня", "Кузнецов", 500),
                new EmployeeFixed("Женя", "Семенова", 16300),
                new EmployeeFixed("Вика", "Васильева", 18200),
                new EmployeeFixed("Камилла", "Уткина", 28300),
                new EmployeeFixed("Виолетта", "Белкина", 25100),
        };

        Arrays.sort(employees);

        for (Employee employee : employees){
            System.out.println(employee);
        }

        EmployeesArray myWorkers = new EmployeesArray(employees);

        for (Employee employee : myWorkers.getEmplo()){
            System.out.println(employee);
        }
    }
}
