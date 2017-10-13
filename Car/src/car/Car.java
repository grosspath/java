
package car;

/**
 *
 * @author jerolgraves
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car(){
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;      
    }
    
    // Getters and Setters
    
    public int setMaxSpeed(int newMaxSpeed){
        return this.maxSpeed = newMaxSpeed;
    }
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public int getMinSpeed(){
        return this.minSpeed;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public boolean getIsTheCarOn(){
        return this.isTheCarOn;
    }
    
    public char getTheCondition(){
        return this.condition;
    }
    
    public String getNameOfCar(){
        return this.nameOfCar;
    }
    
    public double getMaxFuel(){
        return this.maxFuel;
    }
    
    public double getCurrentFuel(){
        return this.currentFuel;
    }
    
    public double getMpg(){
        return this.mpg;
    }
    
    public int getNumberOfPeopleInCar(){
        return this.numberOfPeopleInCar;
    }
    
    
    
    public void printVariables(){
        System.out.println("The max speed is: " + maxSpeed);
        System.out.println("The min speed is: " + minSpeed);
        System.out.println("The weight is: " + weight);
        System.out.println("Is the car on? " + isTheCarOn);
        System.out.println("This is the condition of the car: " + condition);
        System.out.println("The name of the car is: " + nameOfCar);
        System.out.println("The number of people in the car is: " + numberOfPeopleInCar);
    }
    
    public void upgradeMaxSpeed() {
       setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn(){
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
        numberOfPeopleInCar++;
        System.out.println("Someone got in");
        } else {
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }
    
    public void getOut(){
        if (this.numberOfPeopleInCar > 0){
        numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }
    
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on " + isTheCarOn);
        }
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
        tommyCar.printVariables();
        
        
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    } 
}
