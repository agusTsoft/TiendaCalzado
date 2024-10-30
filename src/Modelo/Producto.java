package Modelo;

import Modelo.Calzado;

public class Producto {
    public int proCod;
    public double valorBase;
    public int Stock;


    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getProCod() {
        return proCod;
    }

    public void setProCod(int proCod) {
        this.proCod = proCod;
    }

    public double impuestoIva(){

    };

    public double impEsp(){return 0;};

    public double valorAPagar(){return 0;};
}
