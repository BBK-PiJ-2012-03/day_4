import java.util.Scanner;


public class Calculator {
private int a;
private int b;

   private void setValues(int a, int b)   {
       this.a = a;
       this.b = b;
   }

   private int add (int a, int b) {
        return (a + b);
    }
   private int substract (int a, int b) {
        return (a - b);
    }
   
   private int multiply (int a, int b) {
        return (a * b);
    }
   private double divide (int a, int b) {
        return ( ((double)a) / ((double)b)  );
    }
   
   private int modulus (int a, int b){
       return (a % b);
   }
   
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("gimme 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        calculator.setValues(a,b);
        
        
        
        System.out.println(calculator.add(a, b));   
    }
}
