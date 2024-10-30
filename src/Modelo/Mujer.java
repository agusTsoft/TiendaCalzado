package Modelo;

import java.awt.*;
import java.time.DayOfWeek;

public class Mujer extends Formal{

    private double high;

    public Mujer(Producto _producto, DayOfWeek _dia_venta, double _talle, Color _color) {
        super(_producto, _dia_venta, _talle, _color);
    }

    public double aplicarDescuento() {
        double descuento = 0;
        if (this.high > 10){
            descuento = valorVentaDoW()*(-20.0/100);
            return descuento;
        }else{
            return descuento;
        }
    }
}
