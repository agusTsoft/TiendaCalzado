package Controlador;

import Modelo.Producto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventario {

    public static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<Integer> codigos = new ArrayList();

    private void anadir(Producto producto){


    }

    public static int setCodigo(){
        for (Producto i : productos){
            codigos.add(i.getProCod());
        }
        return codigos.size()+1;
    }

    public static int getStock(){
        return 0;
    }

}
