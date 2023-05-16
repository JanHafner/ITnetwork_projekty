/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.itnetwork.zaverecnyprojekt;

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
 *|___|_|\_|___/\___/|_|_\/_/ \_\_|\_|\___|___|   v0.1 © Jan Hafner C0d3M@key  ༼つ ▀_▀ ༽つ
 *                                             
 * 
 * Evidece pojištění v0.1
 *------------------------------------------------------------------------------
 *------------------------------------------------------------------------------
 * Umožňuje zadat údaje o osobě: 
 * -----------------------------------------------------------------------------
 * Jméno - String - délka jména je v rozmezí 2 až 29 znaků - 
 * pokud je hodnota mimo rozmezí je potřeba vstup potvrdit, případně znovu zadat 
 * -----------------------------------------------------------------------------
 * Příjmení - String - délka příjmení je v rozmezí 2 až 29 znaků -
 * pokud je hodnota mimo rozmezí je potřeba vstup potvrdit, případně znovu zadat
 * -----------------------------------------------------------------------------
 * Telefonní číslo - String - délka telefonního čísla je v rozmezí 2 až 16 znaků -
 * pokud je hodnota mimo rozmezí je potřeba vstup potvrdit, případně znovu zadat
 * -----------------------------------------------------------------------------
 * Věk - Integer v rozsahu 0 až 150 -
 * pokud je hodnota mimo rozsah anebo se nejedná o číslo, dojde k odmítnutí
 * vstupu a je potřeba vstup zadat znovu
 *------------------------------------------------------------------------------
 *-----------------------------------------------------------------------------
 * 
 * Zobrazit všechny záznamy
 *
 *------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * 
 * Vyhledat záznam podle Jména a Příjmení
 * 
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * 
 * 
 */

public class ZaverecnyProjekt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "windows-1250");
        ClientRecordManager crm = new ClientRecordManager();
        ClientRecord clientRecord = new ClientRecord("", "", 0, "");
        ControlManager controlManager = new ControlManager();
        
        System.out.println("  ___ _  _ ___ _   _ ___    _   _  _  ___ ___ \n"
                + " |_ _| \\| / __| | | | _ \\  /_\\ | \\| |/ __| __|\n"
                + "  | || .` \\__ \\ |_| |   / / _ \\| .` | (__| _| \n"
                + " |___|_|\\_|___/\\___/|_|_\\/_/ \\_\\_|\\_|\\___|___|\n"
                + "                                              ");

        // císlo volby z menu
        int option = -1;

        // While loop menu - volby jsou 1 - vložení záznamu, 2 - vypsání všech záznamů, 3 - vyhledání záznamu 9 - ukončení programu.
        while (option != 9) {
            menu();
            String selectedOption = sc.nextLine().trim();

            //Podmínka pro zadání pouze platných hodnot 1,2,3,9 - mimo tyto hodnoty je potřeba zadání zopakovat
            if (selectedOption.matches("[1-3]|9")) {
                option = Integer.parseInt(selectedOption);

                // Switch podle option z menu
                switch (option) {

                    // Case Add client record - přidání záznamu
                    case 1:
                        controlManager.addNewClientRecord();
                        break;

                    // Case 2 printAllRecords - zobrazí všechny záznamy
                    case 2:
                        controlManager.allClientRecord();
                        break;

                    // Case 3 searchRecords - vyhledá podle jména a příjmení záznam
                    case 3:
                        controlManager.searchClientRecord();
                        break;

                    // Case 9 ukončení programu
                    case 9:
                        controlManager.endSession();
                        break;
                }
            } else {

                // Chybová hláška k volbě option z menu
                System.out.println("\nNeplatná hodnota\nZadejte prosím znovu\n");

            }
        }
    }

    // Menu pro výběr funkcí 
    public static void menu() {

        System.out.println("--------------------\n EVIDENCE POJIŠTĚNÝCH\n--------------------");

        System.out.println("MENU");
        System.out.println("1: Přidat nového pojištěného");
        System.out.println("2: Vypsat všechny pojištěné");
        System.out.println("3: Vyhledat pojištěného");
        System.out.println("9: Konec");
        System.out.print("Vaše volba: ");
    }
}
