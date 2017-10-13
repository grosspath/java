
package person;

import static person.HairColor.*;


public class Person {

   HairColor hairColor = BLONDE;
   
   public Person() {
       
   }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        peterParker.hairColor = PINK;
        spiderMan.hairColor = BLUE;
        peterParker.hairColor = GREEN;
        
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Peter Parker: " + spiderMan.hairColor);
        // TODO code application logic here
    }
    
}
