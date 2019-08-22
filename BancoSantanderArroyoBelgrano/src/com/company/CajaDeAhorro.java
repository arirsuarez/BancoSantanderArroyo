package com.company;

public class CajaDeAhorro extends Cuenta {


    private Double tasaInteres;



    public CajaDeAhorro(Cliente titular, Double tasaInteres) {
        super(titular);
        this.tasaInteres = tasaInteres;
    }

    public void cobrarInteres(Double tasaInteres){
        // Hacer set saldo sin el set saldo, con el depositar para que quede todo privado y nadie pueda acceder al saldo.
        super.setSaldo(super.getSaldo() + tasaInteres);
    }

}
