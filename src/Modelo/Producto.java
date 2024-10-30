package Modelo;

import Modelo.*;

public class Producto {
    public int proCod;
    public double valorBase;
    public int Stock;
    public Calzado calzado;


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
        return (calzado.valorVentaDoW())*(19.0/100);
    };

    public double impEsp(){
        return ((this.valorBase)*(7.4/100));
    };


}
