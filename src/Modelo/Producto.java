package Modelo;

import Modelo.*;

public class Producto {
    private int proCod;
    private double valorBase;
    private int Stock;

    public Producto(int proCod, double valorBase, int stock) {
        this.proCod = proCod;
        this.valorBase = valorBase;
        Stock = stock;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public double getValorBase() {
        return valorBase;
    }


    public int getProCod() {
        return proCod;
    }


}
