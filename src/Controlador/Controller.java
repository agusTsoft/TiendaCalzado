package Controlador;

import Modelo.*;

import java.awt.*;
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

    public static void CalzadosMujer(){

    }
    public static void mostrarValorVenta(){

    }
    public static void mostrarCalzadosTop(){}
    public static void mostrarTotalImpEsp(){}
    public static void totalDescuentos(){}
}

