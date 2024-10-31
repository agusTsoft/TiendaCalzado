package Controlador;

import Modelo.Hombre;
import Modelo.Mujer;
import Modelo.Deportivo;
import Vista.View;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    public View vista;
    public Hombre hombre;
    public Mujer mujer;

    public Controller(){

    }

    public static void IngresarDeportivo(double talle, DayOfWeek dia, String tipo, String mat){
        Deportivo deportivo1 = new Deportivo(tipo, mat, , dia, talle);
    }


    public static void CalzadosMujer(){

    }
    public static void mostrarValorVenta(){

    }
    public static void mostrarCalzadosTop(){}
    public static void mostrarTotalImpEsp(){}
    public static void totalDescuentos(){}
}

