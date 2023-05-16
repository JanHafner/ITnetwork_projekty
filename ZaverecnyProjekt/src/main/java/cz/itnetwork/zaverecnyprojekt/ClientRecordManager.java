/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.HashSet;

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
 * Třída správy záznamů
 *
 * Zajišťuje přidání záznamu do množiny typu HashSet
 * 
 * Vyhledání záznamu
 * 
 * Výpis všech záznamů
 * 
 * 
 * 
 * 
 * 
 */


public class ClientRecordManager {

    private HashSet<ClientRecord> clientRecords;

    public ClientRecordManager() {
        clientRecords = new HashSet<>();
    }

    // Přidání záznamu
    public void addClientRecord(ClientRecord clientRecord) {

        clientRecords.add(clientRecord);
    }

    // Vyhledání záznamu podle jména a příjmení
    // Výsledky vyhledávání se uloží do Array Clientrecord. Hodnota pole se poté zavolá k vrácení
    public ArrayList<ClientRecord> searchClientRecord(String firstName, String lastName) {
        ArrayList<ClientRecord> matchingRecords = new ArrayList<>();

        //nastavení podmínky vyhledávání vyhledává se jméno a zároveň příjmení, velikost písmen se nebere v potaz (A je stejné jako a) - pokud podmínka platí uloží se výsledek do pole clientrRcord
        for (ClientRecord clientRecord : clientRecords) {
            if (clientRecord.getFirstName().equalsIgnoreCase(firstName) && clientRecord.getLastName().equalsIgnoreCase(lastName)) {
                matchingRecords.add(clientRecord);
            }
        }

        return matchingRecords;
    }

    // Získání všech záznamů
    public HashSet<ClientRecord> getClientRecords() {
        return clientRecords;
    }

    // Výpis všech záznamů
    public void printAllClientRecords() {
        for (ClientRecord clientRecord : clientRecords) {
            System.out.println(clientRecord);
        }
    }
}
