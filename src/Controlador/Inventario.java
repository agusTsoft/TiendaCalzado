package Controlador;

import Modelo.Producto;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Inventario {

    public static ArrayList<Producto> productos = new ArrayList<>();

    public static void anadir(Producto producto){
        productos.add(producto);
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
