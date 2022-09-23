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
        for (int i = 1; i < 3; i++) {
            System.out.println("i es " + i);
        }
    
    }
}
