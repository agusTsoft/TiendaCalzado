package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import Controlador.Controller;

public class Vista extends JFrame{
    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.Ventana();
    }
    public Vista(){
        new JFrame();
        setVisible(true);
        setSize(600, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);}

    private void Ventana(){

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel mainPanel = new JPanel(new CardLayout());
        JPanel panelIngreso = new JPanel(null);
        JPanel panelTop = new JPanel();
        JPanel panelDescuentos = new JPanel();
        JPanel panelImpuestos = new JPanel();
        JPanel panelCalMujer = new JPanel();
        JPanel panelDeportivo = new JPanel(null);
        JPanel panelHombre = new JPanel(null);
        JPanel panelMujer = new JPanel(null);

        mainPanel.add(panelIngreso, "panel Ingreso");
        mainPanel.add(panelDeportivo, "Panel Deportes");
        mainPanel.add(panelHombre, "Panel Hombre");
        mainPanel.add(panelMujer, "Panel Mujer");

        //#------------ Panel de ingresos -------------
        JButton Sportbtn = new JButton("Deportivo");
        Sportbtn.setBounds(125, 100, 100, 30);
        JButton Hombtn = new JButton("Hombre");
        Hombtn.setBounds(250, 100, 100, 30);
        JButton Mujbtn = new JButton("Mujer");
        Mujbtn.setBounds(375, 100, 100, 30);
        JButton atrasBtn = new JButton("Atras");
        atrasBtn.setBounds(1, 1, 75, 25);
        JButton atrasBtn2 = new JButton("Atras");
        atrasBtn2.setBounds(1, 1, 75, 25);
        JButton atrasBtn3 = new JButton("Atras");
        atrasBtn3.setBounds(1, 1, 75, 25);

        JLabel title = new JLabel("Seleccione el tipo de Calzado que desea ingresar" );
        Font fuente = new Font("Arial", Font.PLAIN,14);
        title.setFont(fuente);
        title.setBounds(150, 50, 325, 30);

        Sportbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "Panel Deportes");
            }
        });
        Mujbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "Panel Mujer");
            }
        });
        Hombtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "Panel Hombre");
            }
        });

        atrasBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "panel Ingreso");
            }
        });
        atrasBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "panel Ingreso");
            }
        });
        atrasBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) mainPanel.getLayout();
                card.show(mainPanel, "panel Ingreso");
            }
        });

        //---------- Panel Ingreso Deportivo ---------------------------------------------------------------------
        JLabel Ldow = new JLabel("Dia de la semana");
        Ldow.setBounds(75, 50, 100, 25);
        Ldow.setFont(fuente);
        panelDeportivo.add(Ldow);
        JComboBox<DayOfWeek> comboDoW = new JComboBox<>(DayOfWeek.values());
        comboDoW.setSelectedItem(DayOfWeek.MONDAY);
        comboDoW.setBounds(75, 80, 100, 25);
        panelDeportivo.add(comboDoW);

        JLabel LTipo = new JLabel("Tipo de depore");
        LTipo.setBounds(300, 50, 100, 25);
        panelDeportivo.add(LTipo);
        String[] tipoDeporte = {"Tenis", "Futbol", "Basquet", "Running"};
        JComboBox<String> comboTipo = new JComboBox<>(tipoDeporte);
        comboTipo.setBounds(300, 80, 100, 25);
        panelDeportivo.add(comboTipo);

        JLabel LMat = new JLabel("Material");
        LMat.setBounds(75, 110, 100, 25);
        LMat.setFont(fuente);
        panelDeportivo.add(LMat);
        JComboBox<String> comboMat = new JComboBox<>();
        comboMat.addItem("Cuero");
        comboMat.addItem("Lona");
        comboMat.setSelectedItem("Cuero");
        comboMat.setBounds(75, 140, 100, 25);
        panelDeportivo.add(comboMat);

        JLabel LSpin = new JLabel("Talle");
        LSpin.setFont(fuente);
        LSpin.setBounds(75, 170, 100, 25);
        panelDeportivo.add(LSpin);
        SpinnerNumberModel spin = new SpinnerNumberModel(0, 0, 50.0, 0.5);
        JSpinner Spinner = new JSpinner(spin);
        Spinner.setBounds(75, 200, 50, 25);
        panelDeportivo.add(Spinner);

        JButton IngresoBtn = new JButton("Ingresar");
        IngresoBtn.setBounds(300, 110, 100, 25);
        IngresoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se hace el get de lo ingresado en los campos para mandarlos al controlador
                double talle = getTalle(spin);
                DayOfWeek dia_venta = getDoW(comboDoW);
                String tipo_material = getMaterial(comboMat);
                String tipo_deporte = getTipoDeporte(comboTipo);

            }
        });
        panelDeportivo.add(IngresoBtn);

        //---------- Panel Ingreso Mujer ---------------------------------------------------------------------
        JLabel LdowM = new JLabel("Dia de la semana");
        LdowM.setBounds(75, 50, 100, 25);
        LdowM.setFont(fuente);
        panelMujer.add(LdowM);
        JComboBox<DayOfWeek> comboDoWM = new JComboBox<>(DayOfWeek.values());
        comboDoWM.setSelectedItem(DayOfWeek.MONDAY);
        comboDoWM.setBounds(75, 80, 100, 25);
        panelMujer.add(comboDoWM);

        JLabel LSpinTaco = new JLabel("Altura del taco (cm)");
        LSpinTaco.setFont(fuente);
        LSpinTaco.setBounds(75, 110, 100, 25);
        panelMujer.add(LSpinTaco);
        SpinnerNumberModel spinTaco = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner SpinnerTaco = new JSpinner(spinTaco);
        SpinnerTaco.setBounds(75, 140, 50, 25);
        panelMujer.add(SpinnerTaco);

        JLabel LSpinTalle = new JLabel("Talle");
        LSpinTalle.setFont(fuente);
        LSpinTalle.setBounds(75, 170, 100, 25);
        panelMujer.add(LSpinTalle);
        SpinnerNumberModel spinTalle = new SpinnerNumberModel(0, 0, 50.0, 0.5);
        JSpinner SpinnerTalle = new JSpinner(spinTalle);
        SpinnerTalle.setBounds(75, 200, 50, 25);
        panelMujer.add(SpinnerTalle);

        JLabel LColor = new JLabel("Color");
        LColor.setBounds(75, 230, 50, 25);
        panelMujer.add(LColor);
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BLACK};
        JComboBox<Color> comboColor = new JComboBox<>(colors);
        comboColor.setBounds(75, 260, 50, 20);
        panelMujer.add(comboColor);

        JButton IngresoBtnMuj = new JButton("Ingresar");
        IngresoBtnMuj.setBounds(300, 110, 100, 25);
        IngresoBtnMuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se hace el get de lo ingresado en los campos para mandarlos al controlador
                double talle = getTalle(spin);
                DayOfWeek dia_venta = getDoW(comboDoW);
                double high = getHigh(spinTaco);
                Color color = getColor(comboColor);
            }
        });
        panelMujer.add(IngresoBtnMuj);

        tabbedPane.addTab("Ingreso",mainPanel);
        tabbedPane.addTab("Calzados TOP", panelTop);
        tabbedPane.addTab("Descuentos de la tienda",panelDescuentos);
        tabbedPane.addTab("Impuestos",panelImpuestos);
        tabbedPane.addTab("Calzados Mujer",panelCalMujer);
        add(tabbedPane);
        panelIngreso.add(Sportbtn);
        panelIngreso.add(Hombtn);
        panelIngreso.add(Mujbtn);
        panelIngreso.add(title);
        panelDeportivo.add(atrasBtn);
        panelHombre.add(atrasBtn2);
        panelMujer.add(atrasBtn3);
        repaint();
    }

    private double getTalle(SpinnerNumberModel spin){
        return Double.parseDouble(spin.getNumber().toString());
    }

    private double getHigh(SpinnerNumberModel spin){
        return Double.parseDouble(spin.getNumber().toString());
    }

    private String getMaterial(JComboBox<String> comboMat){
        return comboMat.getSelectedItem().toString();
    }

    private DayOfWeek getDoW(JComboBox<DayOfWeek> comboDia){
        return (DayOfWeek) comboDia.getSelectedItem();
    }

    private Color getColor(JComboBox<Color> comboColor){
        return (Color) comboColor.getSelectedItem();
    }

    private String getTipoDeporte(JComboBox<String> comboTipo){
        return (String) comboTipo.getSelectedItem();
    }


}
