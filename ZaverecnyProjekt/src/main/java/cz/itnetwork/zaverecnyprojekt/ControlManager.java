/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.Scanner;

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
 * Třída metody volané z menu pro obsluhu programu
 *
 * Volba č. 1 - přidání zázamu
 *
 * Volba č. 2 - vypsání všech záznamů
 *
 * Volba č.3 - vyhledání zázamu
 *
 * Volba č.9 - ukončení programu
 * 
 * 
 * definuje vlastnosti vstupů:
 * -----------------------------------------------------------------------------
 * Jméno - String - délka jména je v rozmezí 2 až 29 znaků - 
 * pokud je hodnota mimo rozmezí je potřeba vstup potvrdit, případně znovu zadat 
 * -----------------------------------------------------------------------------
 * Příjmení - String - délka příjmení je v rozmezí 2 až 29 znaků -
 * pokud je hodnota mimo rozmezí je potřeba vstup potvrdit, případně znovu zadat
 * -----------------------------------------------------------------------------
 * Telefonní číslo - String - bez omezení 
 * -----------------------------------------------------------------------------
 * Věk - Integer v rozsahu 0 až 150 -
 * pokud je hodnota mimo rozsah anebo se nejedná o číslo, dojde k odmítnutí
 * vstupu a je potřeba vstup zadat znovu
 * 
 * 
 */


public class ControlManager {

    Scanner sc = new Scanner(System.in, "utf-8");
    ClientRecord clientRecord = new ClientRecord("", "", 0, "");
    ClientRecordManager crm = new ClientRecordManager();

    

// Case 1 Add client record - přidání záznamu
    public void addNewClientRecord() {

        System.out.println("Vaše volba je č.1 - přidání nového pojištěného\n ----------------------------------------------");

        
        
        
        
 //---------------------------------------------------------------------------
 //Přidání Jména - firstName
 
        String firstNameInput;
        String firstName;
        boolean saveFirstName;
        

        // definování do while cyklu pro odfiltrování potenciálně chybného zadání - délka jména by měla být mezi 2 až 29 znaků. Pokud je mimo rozsah, je potřeba vstup potrdit případně zadat znovu
        do {
            System.out.println("Zadejte jméno pojištěného: ");
            firstNameInput = sc.nextLine().trim();
            
            
             //Podmínka délky vstupu (mezi 2 až 29) - pokud je mimo rozsah je potřeba vstup potvrdit, případně odmítnout a zadat znovu
            if (firstNameInput.length() < 2 || firstNameInput.length() > 29) {
                System.out.println("Zadané jméno je poněkud " + (firstNameInput.length() < 2 ? "krátké" : "dlouhé") + ". Přejete si opravdu uložit " + firstNameInput + "? (pokud ano, zadejte \"A\" , jinak pokračujte stiskem libovolné klávesy)");
                String firstNameConfirmation = sc.nextLine();
                saveFirstName = firstNameConfirmation.equalsIgnoreCase("A");

            } else {
                saveFirstName = true;
            }

            if (!saveFirstName) {
                System.out.println("Jméno nebylo uloženo. Zadejte prosím jméno znovu.");
            }
        } while (!saveFirstName);

        firstName = firstNameInput;
        
        
//-----------------------------------------------------------------------------
// Přidání Příjmení  lastName

        String lastNameInput;
        String lastName;
        boolean saveLastName;

        
        // definování do while cyklu pro odfiltrování potenciálně chybného zadání - délka příjmení by měla být mezi 2 až 29 znaků. Pokud je mimo rozsah, je potřeba vstup potrdit případně zadat znovu
        do {
            System.out.println("Zadejte příjmení pojištěného: ");
            lastNameInput = sc.nextLine().trim();

            
             //Podmínka délky vstupu (mezi 2 až 29) - pokud je mimo rozsah je potřeba vstup potvrdit, případně odmítnout a zadat znovu
            if (lastNameInput.length() < 2 || lastNameInput.length() > 29) {
                System.out.println("Zadané příjmení je poněkud " + (lastNameInput.length() < 2 ? "krátké" : "dlouhé") + ". Přejete si opravdu uložit " + lastNameInput + "? (pokud ano, zadejte \"A\" , jinak pokračujte stiskem libovolné klávesy)");
                String lastNameConfirmation = sc.nextLine();
                saveLastName = lastNameConfirmation.equalsIgnoreCase("A");
            } else {
                saveLastName = true;
            }

            if (!saveLastName) {
                System.out.println("Příjmení nebylo uloženo. Zadejte prosím příjmení znovu.");
            }
        } while (!saveLastName);

        lastName = lastNameInput;

        
        
//-----------------------------------------------------------------------------
// Přidání Telefonního čísla contactNumber

        String contactNumberInput;
        String contactNumber;
        boolean saveContactNumber;


        // definování do while cyklu pro odfiltrování potenciálně chybného zadání - délka příjmení by měla být mezi 2 až 29 znaků. Pokud je mimo rozsah, je potřeba vstup potrdit případně zadat znovu
        do {
        System.out.print("Zadejte telefonní číslo: ");
        contactNumberInput = sc.nextLine().trim();

        //Podmínka délky vstupu (mezi 2 až 16) - pokud je mimo rozsah je potřeba vstup potvrdit, případně odmítnout a zadat znovu
        if (contactNumberInput.length() < 2 || contactNumberInput.length() > 16) {
                System.out.println("Zadané telefonní číslo je poněkud " + (contactNumberInput.length() < 2 ? "krátké" : "dlouhé") + ". Přejete si opravdu uložit " + contactNumberInput + "? (pokud ano, zadejte \"A\" , jinak pokračujte stiskem libovolné klávesy)");
                String contactNumberConfirmation = sc.nextLine();
                saveContactNumber = contactNumberConfirmation.equalsIgnoreCase("A");
            } else {
                saveContactNumber = true;
            }

            if (!saveContactNumber) {
                System.out.println("Telefonní číslo nebylo uloženo. Zadejte prosím telefonní číslo znovu.");
            }
        } while (!saveContactNumber);

        contactNumber = contactNumberInput;

        

        
//-----------------------------------------------------------------------------
// Přidání Věku  age        
        int age = 0;
        String ageInput;
        boolean saveAge;

        // definování do while cyklu pro odfiltrování potenciálně chybného zadání - věk by měl být v celočíselném intervalu 0 až 150. Pokud je mimo rozsah, je potřeba vstup zadat znovu
        do {
            System.out.println("Zadejte věk:");
            ageInput = sc.nextLine().trim();

             //Podmínka rozsahu vstupu mezi 0 až 150 - nejprve se kontroluje zda se jedná o číslo a pokud ano zda jeho hodnota leží v intrvalu 0 až 150 - pokud nepatí obě podmínky současné je potřeba vstup zadat znovu
            if (ageInput.matches("[0-9]+") && Integer.parseInt(ageInput) >= 0 && Integer.parseInt(ageInput) <= 150) {
                age = Integer.parseInt(ageInput);
                saveAge = true;
            } else {
                System.out.println("Neplatný vstup. Věk musí být v rozsahu 0 až 150 a musí obsahovat pouze číslice");
                saveAge = false;
            }
        } while (!saveAge);

        
        
//-----------------------------------------------------------------------------
// Zapsání výše zadaných hodnot do třídy ClientRecord             
        
        clientRecord = new ClientRecord(firstName, lastName, age, contactNumber);
        // Zavolání metody addClientRecord - přidání pojištěného
        crm.addClientRecord(clientRecord);
        System.out.println(clientRecord.toString());

    }
    
    
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------           
    // Case 2 printAllRecords - zobrazí všechny záznamy

    public void allClientRecord() {
        System.out.println("Vaše volba je č.2 - vypsání všech pojištěných\n ----------------------------------------------");
        crm.printAllClientRecords();
    }
    
    
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------           
    // Case 3 searchRecords - vyhledá podle jména a příjmení záznam
    public void searchClientRecord() {
        System.out.println("Vaše volba je č.3 - vyhledání pojištěného podle jména a příjmení\n ----------------------------------------------");

        System.out.print("Zadejte Jméno: ");
        String searchFirstName = sc.nextLine().trim();

        System.out.print("Zadejte Příjmení: ");
        String searchLastName = sc.nextLine().trim();

        
        //Vytvoření ArrayList k uchování nalezených výsledků. Protože se vyhledává podle jména a příjmení, které nemusí být unikátní, může být výsledk vyhledávání více.
        ArrayList<ClientRecord> matchingRecords = crm.searchClientRecord(searchFirstName, searchLastName);
        if (!matchingRecords.isEmpty()) {
            System.out.println("Nalezené pojištěné osoby:");

            for (ClientRecord record : matchingRecords) {
                System.out.println(record);
            }
        } else {
            System.out.println("Pojištěný nebyl nalezen\n");
        }
    }
    
    
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------           
    // Case 9 ukončení programu
    public void endSession() {
        System.out.println("\nDěkujeme za použití programu\n buďte opatrní \n");
        System.exit(0);
    }
}


