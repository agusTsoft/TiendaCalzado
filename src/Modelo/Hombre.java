package Modelo;

import java.time.DayOfWeek;
import java.awt.Color;

public class Hombre extends Formal{
    public Hombre(Producto _producto, String _dia_venta, double _talle, Color _color) {
        super(_producto, _dia_venta, _talle, _color);
    }

    public double aplicarDescuento(){
        return color.equals(Color.RED) || color.equals(Color.GREEN) ? (valorVentaDoW())/(25.0/100): 0;
    }
}
