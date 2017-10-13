
package recursiongoodluck;

public class RecursionGoodLuck {
    // f(f(f(a))) --- a = 20
    //f(a) = 5 + a
    
    //f(20) = 5 + 20 = 25
    //f(f(f(20))) --- f(f(25))
    //f(25) = 5 + 25 = 30
    //f(f(f(20))) --- f(f(25)) --- f(30)
    //f(30) = 5 + 30 = 35
    //f(f(f(20))) --- f(f(25)) --- f(30) --- 35
    
    public static int Summation(int n){
        //Base case
        if (n <= 0){
            return 0;
        } 
        //Recursive case
        else {
            return n + Summation(n-1);
        }
        
    }
    
    public static int Factorial(int n){
        //Base case:
        if (n <= 1){
            return 1;
        }
        //Recursive case:
        else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponentiation(int n, int p) {
        //Base case:
        if (p <= 0){
            return 1;
        } 
        //Recursive:
        else {
            return n * Exponentiation(n, p-1);
        }
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Exponentiation(5, 3));
    }
    
}
