package Modelo;

import java.time.DayOfWeek;

public class Deportivo extends Calzado{
    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(String depo, String mate, Producto producto, DayOfWeek dia, double talle){
        super(producto, dia,  talle);
        this.tipoDeporte = depo;
        this.tipoMaterial = mate;
    }


    private double impuestoMaterial(){
        double impuesto = 0;
        if (this.tipoMaterial == "Cuero"){impuesto = (getProducto().getValorBase())*(15.0/100);
        }else{impuesto = (getProducto().getValorBase())*(6.0/100);
        }
        return impuesto;
    }

    public double valorCancelacion(){
        double venta = valorVentaDoW();
        double iva = getProducto().impuestoIva();
        double material = impuestoMaterial();
        if (getProducto().getStock()>0){
            return venta + material + iva;
        }else{
            return -1;
        }
    }
}
