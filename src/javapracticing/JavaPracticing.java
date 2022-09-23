package javapracticing;

public class JavaPracticing {

    public static void main(String[] args) {
        /* variables*/
        int numOne = 1;
        int numTwo = 2;
        
        /* alternative conditional */
        if (numOne > numTwo) {
            System.out.println(numOne + " es mayor a " + numTwo);
        } else {
            System.out.println(numTwo + " es mayor a " + numOne);
        }
        
        /* while */
        while(numOne < numTwo) {
        System.out.println(numOne + " es menor a " + numTwo);
        numOne++;
        }
        
        /* for */
        for (int i = 1; i < 6; i++) {
            System.out.println("i es igual a " + i);
        }
        
        /* references */
        cat();
        System.out.println("2 + 3 = " + plus(2,3));
        System.out.println("2 - 3 = " + minus(2, 3));
    
    }
    
    /* method or function */
    public static void cat(){
       String garfield = "Garfield";
       String chiara = "Chiara";
       String felix = "Felix";
       String speak = " say: ";
       String cat = "Miau";
       String dog = "Guau Guau";
       
       System.out.println(garfield + speak + cat);
       System.out.println(chiara + speak + cat);
       System.out.println(felix + speak + dog);
         
    }
    
    public static int plus(int numOne, int numTwo){
        return numOne + numTwo;
    }
    
    public static int minus(int numOne, int numTwo){
        return numOne - numTwo;
    }
    
}
