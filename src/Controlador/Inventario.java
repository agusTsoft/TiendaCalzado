package Controlador;

import Modelo.Calzado;
import Modelo.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Inventario {

    public static ArrayList<Producto> productos = new ArrayList<>();
    public static HashMap<Integer, Calzado> calzados = new HashMap<>();

    public static void anadir(Producto producto){
        productos.add(producto);
    }
    public static void anadirCalzado(Producto producto, Calzado calzado){
        calzados.put(producto.getProCod(), calzado);
    }

    public static int setCodigo(){
        try{
            int codigo = productos.getLast().getProCod() + 1;
            return codigo;
        }catch (NoSuchElementException e){
            return 1;
        }
    }

}
