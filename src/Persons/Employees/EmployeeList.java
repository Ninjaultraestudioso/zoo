/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;

/**
 *
 * @author Joan
 */
public class EmployeeList implements List <Employee> {

    @Override
    public boolean add(Employee t) {
        return Employee.add(t);
    }

    @Override
    public boolean delete(Employee t) {
        return Employee.remove(t);
    }

    @Override
    public void sort() {
        // Ordenamiento burbuja por nombre
        Employee[] lista = Employee.getAll();
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j].getName().compareTo(lista[j + 1].getName()) > 0) {
                    Employee temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        // Copiamos la lista ordenada de nuevo al arreglo original
        for (int i = 0; i < lista.length; i++) {
            Employee.add(t)[i] = lista[i];
        }
    }

    @Override
    public Employee search(Object id) {
        for (Employee e : Employee.getAll()) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}  
   
