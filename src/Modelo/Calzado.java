package Modelo;

import java.time.DayOfWeek;
import Modelo.Producto;

public abstract class Calzado {
    protected DayOfWeek dia_venta;
    protected double talle;
    private Producto producto;

    public Calzado(Producto _producto,
                   DayOfWeek _dia_venta,
                   double _talle){
        this.producto = _producto;
        this.talle = _talle;
        this.dia_venta = _dia_venta;
    }


    public DayOfWeek getDia_venta() {
        return dia_venta;
    }

    public double valorVentaDoW(){
        DayOfWeek dia = this.getDia_venta();
        double valSell = 0;
        if (dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY)){
            valSell = (producto.valorBase)*(24.0/100);
        } else if (dia.compareTo(DayOfWeek.MONDAY) >= 0 && dia.compareTo(DayOfWeek.FRIDAY) <= 5){
            valSell = -(producto.valorBase)*(15.0/100);
        }

        return valSell;
    }


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
