package Vista;

import javax.swing.*;
import java.awt.*;
import Controlador.Controller;

public class View {

    public void ventana(){
        JFrame frame = new JFrame();
        frame.setTitle("Tienda de Calzado");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panelIngreso = new JPanel();
        JPanel panelTop = new JPanel();
        JPanel panelImpuestos = new JPanel();
        JPanel panelDescuentos = new JPanel();
        JPanel panelCalMujer = new JPanel();

        tabbedPane.addTab("Ingreso", panelIngreso);
        tabbedPane.addTab("TOP", panelTop);
        tabbedPane.addTab("Impuestos", panelImpuestos);
        tabbedPane.addTab("Descuentos", panelDescuentos);
        tabbedPane.addTab("Calzado Mujeres", panelCalMujer);

        JTextField T = new JTextField();
        JTextField Tapellido = new JTextField();
        JTextField Tdir = new JTextField();
        JTextField T = new JTextField();
        JTextField T = new JTextField();
        JTextField Tnombre = new JTextField();

        frame.add(tabbedPane);
    }

}
