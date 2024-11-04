package Modelo;

import java.time.DayOfWeek;
import java.awt.Color;
public abstract  class Formal extends Calzado{
    protected Color color;

    public Formal(Producto _producto, String _dia_venta, double _talle, Color _color) {
        super(_producto, _dia_venta, _talle);
        this.color = _color;
    }

    protected abstract double aplicarDescuento();

    public double valorCancelacion(){
        double venta = valorVentaDoW();
        double iva = impuestoIva();
        double ImpEsp = impEsp();
        double desc = aplicarDescuento();
        if (getProducto().getStock()>0){
            return venta - desc + ImpEsp + iva;
        }else{
            return -1;
        }
    }
    public double impEsp(){

        return ((getProducto().getValorBase())*(7.4/100));
    };
}
