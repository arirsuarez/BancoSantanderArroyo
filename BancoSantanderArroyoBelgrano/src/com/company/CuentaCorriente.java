package com.company;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(Cliente titular) {
        super(titular);
    }

    public void depositarCheque(Cheque unCheque){
    setSaldo(getSaldo() + unCheque.getMonto());
        System.out.println("Tu saldo con cheque es: $" + getSaldo());

    }

    public void extraer(Double platita){
        setSaldo(getSaldo() - platita);
        if (platita<=getSaldo()){
            System.out.println("Tu saldo actual es: $" + getSaldo());
        } else {
            System.out.println("Le debes al banco: $" + getSaldo() * -1);
        }
    }


}
