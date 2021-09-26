package Ciclo;

class E2{
//    public static int sumaPares(int [] vector){
//        int s = 0;
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);
//            if (((vector[i]%2) == 0) && (vector[i] > 0)) {
//                s += vector[i];
//            }
//        }
//        return s;
//    }
//    
//    public static double mean(int [] vector){
//        double promedio = 0;
//        for (int i = 0; i < vector.length; i++) {
//                promedio += vector[i];
//        }
//        promedio /= vector.length;
//        return promedio;
//    }
    
//    public static int [] ordenamientoPersonalizado(int [] vector){
//        int mitad = vector.length / 2;
//        System.out.println(mitad);
//        int[] vectorOrdenado = new int[vector.length];
//        int aux = 0;
//        for (int i = 0; i < mitad; i++) {
//            for (int j = i + 1; j < mitad; j++) {
//                if(vector[i] > vector[j]) {    
//                   aux = vector[i];    
//                   vector[i] = vector[j];    
//                   vector[j] = aux;  
//                }
//            }
//        }
//        for (int i = mitad; i < vector.length; i++) {
//            for (int j = i + 1; j < vector.length; j++) {
//                if(vector[i] < vector[j]) {  
//                   aux = vector[i];    
//                   vector[i] = vector[j];    
//                   vector[j] = aux;    
//                }     
//            }
//        }
//        vectorOrdenado = vector;
//        for (int i = 0; i < vectorOrdenado.length; i++) {
//            System.out.println(vectorOrdenado[i]);
//        }
//        return vectorOrdenado;
//    }
    
//    public static int [] sumaVectorial(int [] v1, int [] v2){
//        int[] s = new int[v1.length];
//        for (int i = 0; i < v1.length; i++) {
//            s[i] = v1[i] + v2[i];
//        }
//        return s;
//    }
    
//    public static String join(char [] vector){
//        String vectorConcatenado = "";
//        for (char c : vector) {
//            vectorConcatenado += c;
//        }
//        return vectorConcatenado;
//    }
//    public static void main(String[] args) {
//        E2 e2 = new E2();
//        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
//        e2.sumaVectorial(v1, v2);
//        System.err.println(e2.join(vector));
//    }
}