package Controlador;

import Modelo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.NoninvertibleTransformException;
import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.util.ArrayList;

public class Controller {
    public Hombre hombre;
    public Mujer mujer;

    public Controller(){

    }

    public void IngresarDeportivo(double talle, String dia, String tipo, String mat, double valorBase, int stock){
        int codigo = Inventario.setCodigo();
        Producto producto = new Producto(codigo, valorBase, stock);
        Inventario.anadir(producto);
        Deportivo deportivo1 = new Deportivo(tipo, mat, producto, dia, talle);
        Inventario.anadirCalzado(producto, deportivo1);
    }
    public void IngresarMujer(double talle, String dia, double valorBase, int stock, double high, Color color){
        int codigo = Inventario.setCodigo();
        Producto producto = new Producto(codigo, valorBase, stock);
        Inventario.anadir(producto);
        Mujer muj = new Mujer(producto, dia, talle, color, high);
        Inventario.anadirCalzado(producto, muj);
    }
    public void IngresarHombre(double talle, String dia, double valorBase, int stock, Color color){
        int codigo = Inventario.setCodigo();
        Producto producto = new Producto(codigo, valorBase, stock);
        Inventario.anadir(producto);
        Hombre homb = new Hombre(producto, dia, talle, color);
        Inventario.anadirCalzado(producto, homb);
    }

    public ArrayList<Mujer> getCalMuj(){
        ArrayList<Mujer> array = new ArrayList<>();
        if (!Inventario.calzados.isEmpty()){
            for (Calzado cal : Inventario.calzados.values()){
                if (cal instanceof Mujer) {
                    array.add((Mujer) cal);
                }
            }
            return array;
        }
        return array;
    }

    public void calMujData(JComboBox<Integer> combo, JLabel dia, JLabel vv, JLabel high){
        for (Integer i : Inventario.calzados.keySet()){
            if (combo.getSelectedItem() == i){
                dia.setText("Dia de venta: " + Inventario.calzados.get(i).getDia_venta());
                vv.setText("Valor de venta: " + Inventario.calzados.get(i).valorVentaDoW());
                high.setText("Altura de taco: " + ((Mujer) Inventario.calzados.get(i)).getHigh());
            }
        }
    }

    public String getTotalIE(){
        double acum = 0;
        if (!Inventario.calzados.isEmpty()){
            for (Calzado i : Inventario.calzados.values()){
                if (i instanceof Mujer){
                    acum += ((Mujer) i).impEsp();
                }else if (i instanceof Hombre){
                    acum += ((Hombre) i).impEsp();
                }
            }
            return "$" + String.valueOf(acum);
        }
        return " - No hay calzados registrados - ";
    }

    public String getTotalDesc(){
        double acum = 0;
        if (!Inventario.calzados.isEmpty()){
            for (Calzado i : Inventario.calzados.values()){
                if (i instanceof Mujer){
                    acum += ((Mujer) i).aplicarDescuento();
                }else if (i instanceof Hombre){
                    acum += ((Hombre) i).aplicarDescuento();
                }
            }
            return "$" + String.valueOf(acum);
        }
        return " - No hay calzados registrados - ";
    }

    public String getCantTop(){
        Integer total = 0;
        if(!Inventario.calzados.isEmpty()){
            for (Calzado i : Inventario.calzados.values()){
                if(i.getProducto().getValorBase()>80000){
                    total+=1;
                }
            }
            return String.valueOf(total);
        }
        return String.valueOf(total);
    }

    public static void mostrarValorVenta(){

    }
    public static void mostrarCalzadosTop(){}
}

