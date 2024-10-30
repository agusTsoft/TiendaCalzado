package Modelo;

import java.time.DayOfWeek;
import java.awt.Color;
public abstract  class Formal extends Calzado{
    protected Color color;

    public Formal(Producto _producto, DayOfWeek _dia_venta, double _talle, Color _color) {
        super(_producto, _dia_venta, _talle);
        this.color = _color;
    }

    protected abstract double aplicarDescuento();
}
