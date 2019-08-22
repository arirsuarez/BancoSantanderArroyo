package com.company;

import java.util.Date;

public class Cheque {

    private Double monto;
    private String bancoEmisor;
    // private Date fechaPago;

    public Cheque(Double monto, String bancoEmisor) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        // this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }
}
