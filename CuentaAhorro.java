package Ciclo;
public class CuentaAhorro extends CuentaBanco {

    //Inserte acá el método constructor
    public CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo) {
        super(numeroCuenta, nombrePropietario, saldo);
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public double getIEA(){
        if (getSaldo() < 1000000) {
            return 0.01;
        }else if(getSaldo() < 2000000){
            return 0.0175;
        }else{
            return 0.023;
        }
    }
    
    public void pagarInteres(int dias){
        double saldo = getSaldo() * ((1 + (getIEA()/365) * dias));
        depositar(saldo);
        System.out.println(saldo);
        System.out.println(" " + ((1 + (getIEA()/365) * dias)));
    }
}