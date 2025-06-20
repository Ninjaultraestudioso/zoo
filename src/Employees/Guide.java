/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Animals.Animal;
import java.time.LocalDate;

/**
 *
 * @author jprod
 */
public class Guide extends Employee {
    private String languages[];
    private String tours[];

    public String[] getLanguages() {
        return languages;
    }

    public Guide(String id, String name, LocalDate birthDate, String phone, Double salary) {
        super(id, name, birthDate, phone, salary);
        languages=new String[15];
        tours=new String[30];
    }
    
    public void addLanguage(String language){
        for (int i = 0; i < 15; i++) {
            if(languages[i]==null){
                languages[i]=language;
                break;
            }
        }
    }
    
    public void doATour(String visitors[]){
        recordTour(visitors);
    }
    
    public String giveInformation(Animal animal){
        return "Este es: "+ animal;
    }
    
    private void recordTour(String visitors[]){
        for (int i = 0; i < 30; i++) {
            if(tours[i]==null){
                tours[i]="Se realizo un tour el dia "+LocalDate.now()+" con "+
                        visitors.length + " personas";
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Guide{" + super.toString()+ ", languages=" + languages.length + ", tours=" + tours.length + '}';
    }
    
    
}
