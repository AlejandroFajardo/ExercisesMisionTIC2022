package Ciclo;

import java.util.Scanner;

public class Principal {
    
    public void calculateRisk(double n, String[] values){
        double max = 0;
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            double auxDouble = 0;
            auxDouble = Double.parseDouble(values[i]);
            sum += auxDouble;
            if (max < auxDouble) {
                max = auxDouble;
            }           
        }
        double prom = sum / n;
        if (prom >= 0 && prom <= 5) {
            System.out.println("SIN-RIESGO");
            System.out.println("CONTINUAR-VIGILANCIA");
        }else if(prom > 5 && prom <= 14){
            System.out.println("BAJO");
            System.out.println("PERSONA-PRESTADORA");
        }else if(prom > 14 && prom <= 35){
            System.out.println("MEDIO");
            System.out.println("PERSONA-PRESTADORA");
        }else if(prom > 35 && prom <= 80){
            System.out.println("ALTO");
            System.out.println("ALCALDIA");
        }else if(prom > 80 && prom <= 100){
            System.out.println("INVIABLE-SANITARIAMENTE");
            System.out.println("GOBERNACION");
        }
        if (max >= 0 && max <= 5) {
            System.out.println("SIN-RIESGO");
        }else if(max > 5 && max <= 14){
            System.out.println("BAJO");
        }else if(max > 14 && max <= 35){
            System.out.println("MEDIO");
        }else if(max > 35 && max <= 80){
            System.out.println("ALTO");
        }else if(max > 80 && max <= 100){
            System.out.println("INVIABLE-SANITARIAMENTE");
        }       
    }
    
//    public static void main(String[] args) {
//        int aux = 0;
//        Principal p = new Principal();
//        Scanner sc = new Scanner(System.in);
//        aux = Integer.parseInt(sc.nextLine());
//        String[] values = new String[aux];
//        for (int i = 0; i < aux; i++) {
//            values[i] = sc.nextLine();
//        }
//        p.calculateRisk((double)aux, values);
//    }         
}
