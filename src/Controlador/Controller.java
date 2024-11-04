package Controlador;

import Modelo.Hombre;
import Modelo.Mujer;
import Modelo.Deportivo;
import Modelo.Producto;

import java.awt.*;
import java.time.DayOfWeek;

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
    }
    public void IngresarMujer(double talle, String dia, double valorBase, int stock, double high, Color color){
        int codigo = Inventario.setCodigo();
        Producto producto = new Producto(codigo, valorBase, stock);
        Inventario.anadir(producto);
        Mujer muj = new Mujer(producto, dia, talle, color, high);
        System.out.println(muj.getDia_venta());
    }
    public void IngresarHombre(double talle, String dia, double valorBase, int stock, Color color){
        int codigo = Inventario.setCodigo();
        Producto producto = new Producto(codigo, valorBase, stock);
        Inventario.anadir(producto);
        Hombre homb = new Hombre(producto, dia, talle, color);
    }


    public static void CalzadosMujer(){

    }
    public static void mostrarValorVenta(){

    }
    public static void mostrarCalzadosTop(){}
    public static void mostrarTotalImpEsp(){}
    public static void totalDescuentos(){}
}

