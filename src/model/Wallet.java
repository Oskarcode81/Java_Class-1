package model;

import java.util.ArrayList;

public class Wallet {

    public static final int CAPACIDAD_MAXIMA = 1000000;

    private int saldo;
    private boolean tieneLimite;
    private int meta;

    /**
     * Listas
     */

    private ArrayList <Transaction> movimientos;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
        movimientos = new ArrayList<>();
    }

    public int getSaldo() { 
        return saldo; 
    }

    public boolean getTieneLimite() {
        return tieneLimite;
    }

    public boolean establecerMeta(int value) {
        if (value == 0) {
            meta = value;
            return true;
        }
        if(value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)) {
            return false;
        }
        meta = value;
        return true;
    }
    
    
    public boolean verificarMeta() {
        if (meta== 0 || meta < meta) {
            return false;

        }
            return true;
    }
    public void setTieneLimite(boolean newTieneLimite) {
        this.tieneLimite = newTieneLimite;
    }


    public String saveMoney(int value) {
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
            return "No se puede superar el limite" + CAPACIDAD_MAXIMA;
        } 
        saldo += value; //saldo = saldo + value
        Transaction ingreso = new Transaction(value, "hoy", 1, "Ingreso de dinero");
        movimientos.add(ingreso);
        if (verificarMeta()) {System.out.println("Has cumplido la meta");}
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value) {
        if (saldo >= value) {
            saldo -= value;
            Transaction retiro = new Transaction(value, "hoy", 2, "Ingreso de dinero" );
            movimientos.add(retiro);
            return "Transacción exitosa, nuevo saldo " + saldo;
        }
        return "Saldo insuficiente";
    }

    public String breakLimit() {
        if (saldo >=10000) {
            saldo -= 10000;
            setTieneLimite (false); // tieneLimite = false;
            Transaction limite = new Transaction(value, "hoy", 2);
            
            return "Has roto el limite";
        }
        return "No tiene saldo suficiente";
    }


public String compararCuenta(Wallet otraWallet) {
    if (saldo == otraWallet.getSaldo()) {
        return "La primera cuenta es mayor";
    }
    if (saldo > otraWallet.getSaldo()) {
        return "La primera cuenta es mayor";
    }
    return "La segunda cuenta es mayor";
    }

    public void displayMovimientos() {
        for (Transaction movimiento : movimientos) {
            System.out.println (movimiento);
        }
    }
}


