/*
 * Copyright 2017 jerolg
 */

package picklottonumbers;

// @author jerolgraves

import java.util.Random;

 
public class PickLottoNumbers {
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int powerBall;
    
    public int LottoNumber() {
       
        Random rand = new Random();
        num1 = Math.abs(rand.nextInt()) % 70;
        num2 = Math.abs(rand.nextInt()) % 70;
        num3 = Math.abs(rand.nextInt()) % 70;
        num4 = Math.abs(rand.nextInt()) % 70;
        num5 = Math.abs(rand.nextInt()) % 70;
       
        System.out.println("Pick number 1: "+num1); 
        System.out.println("Pick number 2: "+num2); 
        System.out.println("Pick number 3: "+num3); 
        System.out.println("Pick number 4: "+num4); 
        System.out.println("Pick number 5: "+num5); 
        
        return num1;
    }
    
    public int PowerBall(){
        Random rand = new Random();
        powerBall = Math.abs(rand.nextInt()) % 27;
        System.out.println("Your Powerball number is: "+powerBall);
        return powerBall;
    }

    // @param args the command line arguments

    public static void main(String[] args) {
        // WRITE CODE HERE
        PickLottoNumbers lotto = new PickLottoNumbers();
        lotto.LottoNumber();
        lotto.PowerBall();
    }

}
