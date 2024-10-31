package Controlador;

import Modelo.Hombre;
import Modelo.Mujer;
import Modelo.Deportivo;
import Modelo.Producto;
import Vista.View;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    public Hombre hombre;
    public Mujer mujer;

    public Controller(){

    }

    public void IngresarDeportivo(double talle, DayOfWeek dia, String tipo, String mat, double valorBase){
        int codigo = Inventario.setCodigo();
        int stock = Inventario.getStock();
        Producto producto = new Producto(codigo, valorBase, stock);
        Deportivo deportivo1 = new Deportivo(tipo, mat, producto, dia, talle);
    }


    public static void CalzadosMujer(){

    }
    public static void mostrarValorVenta(){

    }
    public static void mostrarCalzadosTop(){}
    public static void mostrarTotalImpEsp(){}
    public static void totalDescuentos(){}
}

