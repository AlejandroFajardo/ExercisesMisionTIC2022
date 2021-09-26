package Ciclo;

import java.util.Scanner;

public class Ciclo {

    public double calculateFactorial(int number) {
        double n = (double)number;
        return n == 1 ? 1.0 : (n * calculateFactorial((int)n - 1)); 
            
    }
//    public static void main(String[] args) {
//        Ciclo ciclo = new Ciclo();
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        System.out.println((int)ciclo.calculateFactorial(number));
//    }
}
