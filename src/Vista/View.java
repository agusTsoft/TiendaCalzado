package Vista;

import Controlador.Controller;
import java.util.Scanner;
import javax.naming.ldap.Control;
import java.util.HashMap;

public class View {
    public Controller controlador;
    public HashMap<String, Runnable> menu = new HashMap<>();


    public View(HashMap<String, Runnable> menu) {
        this.menu = menu;
        this.menu.put("1. Ingresar", Controller::Ingresar);
        this.menu.put("2. Calzados Mujer", Controller::CalzadosMujer);
        this.menu.put("3. Valor Venta", Controller::mostrarValorVenta);
        this.menu.put("4. Calzados Top", Controller::mostrarCalzadosTop);
        this.menu.put("5. Total Impuesto Especifico", Controller::mostrarTotalImpEsp);
        this.menu.put("6. Total de descuentos de la tienda", Controller::totalDescuentos);
    }


    public void Menu(){
        Scanner scan = new Scanner(System.in);
        String opcion;

        for (String key : menu.keySet()){
            System.out.println(key);
        }

        System.out.println("Ingrese la opcion del menu --> ");
        opcion = scan.nextLine();

        // Ejecutar la opción si existe en el menú
        Runnable accion = menu.get(opcion);
        if (accion != null) {
            accion.run();
        } else if (!opcion.equals("0")) {
            System.out.println("Opción no válida.");
        }
    }

    public void TipoIngreso(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Deportivo");
        System.out.println("2. Formal Hombre");
        System.out.println("3. Formal Mujer");
        String opcion = scan.nextLine();
    }

    private void Salir(){
        System.out.println("Saliendo del sistema....");
        System.exit(1);
    }
}