/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclo;

/**
 *
 * @author didie
 */
public class Test {
    public static void main(String[] args) {
        CuentaAhorro c = new CuentaAhorro("123", "pedro", 1000000);
        System.out.println(c.getIEA());
        c.pagarInteres(30);
    }
}
