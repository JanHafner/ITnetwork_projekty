/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

/**
 *
 * @author hafik
 */

/**
 * 
 * ___ _  _ ___ _   _ ___    _   _  _  ___ ___ 
 *|_ _| \| / __| | | | _ \  /_\ | \| |/ __| __|
 * | || .` \__ \ |_| |   / / _ \| .` | (__| _| 
 *|___|_|\_|___/\___/|_|_\/_/ \_\_|\_|\___|___|   v0.1
 *                                             
 * 
 * Třída umožňující spravovat atributy osoby. 
 *Atributy jsou:
 *Jméno (String firstName)
 *Příjmnení (String lastName)
 *Věk (int age)
 *Telefonní číslo (String contactNumber)
 */


public class ClientRecord {

    private String firstName;
    private String lastName;
    private int age;
    private String contactNumber;

    public ClientRecord(String firstName, String lastName, int age, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contactNumber = contactNumber;

    }

    // Vrátí hodnotu contactNumber - telefonního čísla
    public String getContactNumber() {
        return contactNumber;
    }

    // Nastavení hodnoty contactNumber - telefonního čísla
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber.trim();
    }

    // Vrátí hodnotu age  - věk
    public int getAge() {
        return age;
    }

    // Nastavení hodnoty age - věk mezi odnotami 0 až 150
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Věk musí být v intervalu 0 až 150");
        } else {
            this.age = age;
        }
    }

    // Vrátí String firstName - Jméno
    public String getFirstName() {
        return firstName;
    }

    // Nastavení hodnoty firstName - jméno
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Vrátí String lastName - Příjmení
    public String getLastName() {
        return lastName;
    }

    // Nastavení hodnoty lastName - Příjmení
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Převod do textu metodou toString
    @Override
    public String toString() {
        return "Výpis záznamu: " + "Jméno a Příjmení " + firstName + " " + lastName + ", telefonní číslo: " + contactNumber + ", věk: " + age + ".";
    }
}
