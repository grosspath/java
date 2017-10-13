
package arraypractice;

import java.util.Arrays;

public class ArrayPractice {
    
    public static <E> void printArray(E[] array){
        for(E element : array) {
            System.out.print(element + " ");
        }
       System.out.println();
    }
     

    public static void main(String[] args) {
        // TODO code application logic here
        // [0, 5, 4, 6, 8]
        
        
        //declaring, allocating and initializng
       Integer[] intArray1;
       Integer[] intArray2 = new Integer[4];
       Integer[] intArray3 = {5, 2, 9, 1, 3};
       
       String[] shoppingList = {"bananas", "apples", "pears"};
   
       intArray2[0] = 10;
       intArray2[1] =  8;
       intArray2[2] = 5;
       intArray2[3] =  10;
       
       System.out.println(Arrays.toString(intArray2));
       System.out.println(Arrays.toString(intArray3));
       printArray(intArray2);
       printArray(intArray3);
       
       //retrieve objects
       System.out.println(intArray2[3]);
       
       //given functions
       Arrays.sort(intArray3);
       printArray(intArray3);
       Arrays.sort(shoppingList);
       printArray(shoppingList);
       
       //FOREACH loop
       for (String s : shoppingList){
           System.out.println(s);
       }
    }
    
}
