package Ciclo;
public class CuentaBanco {

    //Inserte acá los atributos
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;
    
    //Inserte acá el método constructor
    public CuentaBanco(String numeroCuenta, String nombrePropietario, double saldo){    
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public double getSaldo() {    
        return saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        if((cantidad + (0.05 * cantidad)) <= saldo){
            this.saldo -= cantidad + (0.05 * cantidad);
        }
    }
}