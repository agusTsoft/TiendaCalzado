package Modelo;

import java.awt.*;
import java.time.DayOfWeek;

public class Mujer extends Formal{

    private double high;

    public Mujer(Producto _producto, String _dia_venta, double _talle, Color _color, double _high) {
        super(_producto, _dia_venta, _talle, _color);
        this.high = _high;
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
