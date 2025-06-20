/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jprod
 */
public abstract class Employee {
    private String id;
    private String name;
    private LocalDate birthDate;
    private String phone;
    private Double salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setPhone(String phone) {
        if (validatePhone(phone))
            this.phone = phone;
    }
    
    private static boolean validatePhone(String phone){
        return phone.matches("^[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}$");
    }

    public void setSalary(Double salary) {
        if (validateSalary(salary))
            this.salary = salary;
    }
    
    private static boolean validateSalary(double salary){
        return salary>=3000;
    }

    public Employee(String id, String name, LocalDate birthDate, String phone, Double salary) {
        this.id = id;
        this.name = name;
        if(isLegalAge(birthDate))
            this.birthDate = birthDate;
        if(validatePhone(phone))
            this.phone = phone;
        if(validateSalary(salary))
            this.salary = salary;
    }
    
    private static boolean isLegalAge(LocalDate date){
        return Period.between(date, LocalDate.now()).getYears()>=18;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + ", salary=" + salary;
    }
    
    
    
}
