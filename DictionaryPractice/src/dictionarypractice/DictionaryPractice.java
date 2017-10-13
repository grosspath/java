
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {


    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Marters");
        englSpanDictionary.put("Wednesday","Miércoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        
        //Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.FALSE);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        //Key-Value pairs print out
        System.out.println(shoppingList.toString());
        //clear shopping list  use .clear
        //.remove, .replace
        
        //exploring the example from the tutorial
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("Hi", "Bye");
        System.out.println(myMap.values());
        
   }
}
    