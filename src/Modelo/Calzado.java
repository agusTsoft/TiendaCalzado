package Modelo;

import java.time.DayOfWeek;
import Modelo.Producto;

public abstract class Calzado {
    protected String dia_venta;
    protected double talle;
    private Producto producto;

    public Calzado(Producto _producto,
                   String _dia_venta,
                   double _talle){
        this.producto = _producto;
        this.talle = _talle;
        this.dia_venta = _dia_venta;
    }


    public String getDia_venta() {
        return dia_venta;
    }

    public double valorVentaDoW(){
        String dia = getDia_venta();
        double valSell = 0;
        if (dia.equalsIgnoreCase("Semana")){
            valSell = producto.getValorBase() + (producto.getValorBase())*(24.0/100);
        } else if (dia.equalsIgnoreCase("Fin de semana") && dia.equalsIgnoreCase("Fin de semana")){
            valSell = producto.getValorBase() - (producto.getValorBase())*(15.0/100);
        }

        return valSell;
    }

    public double impuestoIva(){
        return (valorVentaDoW())*(19.0/100);
    };

    public double getTalle() {
        return talle;
    }

    public void setTalle(double talle) {
        this.talle = talle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
