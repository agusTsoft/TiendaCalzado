package Vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

import Controlador.Controller;
import Controlador.Inventario;
import Modelo.Calzado;
import Modelo.Mujer;

public class Vista extends JFrame{
    Controller controlador = new Controller();

    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.Ventana();
    }

    public Vista(){
        new JFrame();
        setVisible(true);
        setSize(600, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private void Ventana(){
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel mainPanel = new JPanel(new CardLayout());
        JPanel panelIngreso = new JPanel(null);
        JPanel panelTop = new JPanel(null);
        JPanel panelDescuentos = new JPanel(null);
        JPanel panelImpuestos = new JPanel(null);
        JPanel panelCalMujer = new JPanel(null);
        JPanel panelValorVenta = new JPanel(null);
        JPanel panelDeportivo = new JPanel(null);
        JPanel panelHombre = new JPanel(null);
        JPanel panelMujer = new JPanel(null);

        mainPanel.add(panelIngreso, "panel Ingreso");
        mainPanel.add(panelDeportivo, "Panel Deportes");
        mainPanel.add(panelHombre, "Panel Hombre");
        mainPanel.add(panelMujer, "Panel Mujer");


        tabbedPane.addTab("Ingreso",mainPanel);
        tabbedPane.addTab("Calzados TOP", panelTop);
        tabbedPane.addTab("Descuentos de la tienda",panelDescuentos);
        tabbedPane.addTab("Impuestos",panelImpuestos);
        tabbedPane.addTab("Calzados Mujer",panelCalMujer);
        tabbedPane.addTab("Valor Venta", panelValorVenta);

        //#------------ Panel de ingresos ------------- LISTO
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

        //---------- Panel Ingreso Deportivo --------------------------------------------------------------------- LISTO
        JLabel Ldow = new JLabel("Dia de la semana");
        Ldow.setBounds(75, 50, 100, 25);
        Ldow.setFont(fuente);
        panelDeportivo.add(Ldow);                                       // Dia de la semana (Day Of Week)
        JComboBox<String> comboDoW = new JComboBox<>();
        comboDoW.addItem("Semana");
        comboDoW.addItem("Fin de semana");
        comboDoW.setSelectedItem("Semana");
        comboDoW.setBounds(75, 80, 100, 25);
        panelDeportivo.add(comboDoW);

        JLabel LTipo = new JLabel("Tipo de deporte");
        LTipo.setFont(fuente);
        LTipo.setBounds(300, 50, 100, 25);
        panelDeportivo.add(LTipo);                                      //Tipo de deporte
        String[] tipoDeporte = {"Tenis", "Futbol", "Basquet", "Running"};
        JComboBox<String> comboTipo = new JComboBox<>(tipoDeporte);
        comboTipo.setBounds(300, 80, 100, 25);
        panelDeportivo.add(comboTipo);

        JLabel LMat = new JLabel("Material");
        LMat.setBounds(75, 110, 100, 25);
        LMat.setFont(fuente);
        panelDeportivo.add(LMat);
        JComboBox<String> comboMat = new JComboBox<>();                 //Tipo de material
        comboMat.addItem("Cuero");
        comboMat.addItem("Lona");
        comboMat.setSelectedItem("Cuero");
        comboMat.setBounds(75, 140, 100, 25);
        panelDeportivo.add(comboMat);

        JLabel LSpin = new JLabel("Talle");
        LSpin.setFont(fuente);
        LSpin.setBounds(75, 170, 100, 25);
        panelDeportivo.add(LSpin);                                          //Talle
        SpinnerNumberModel spin = new SpinnerNumberModel(0, 0, 50.0, 0.5);
        JSpinner Spinner = new JSpinner(spin);
        Spinner.setBounds(75, 200, 50, 25);
        panelDeportivo.add(Spinner);

        JLabel LvalorBaseDep = new JLabel("Valor base del producto");
        LvalorBaseDep.setBounds(300, 120, 150, 25);
        LvalorBaseDep.setFont(fuente);
        panelDeportivo.add(LvalorBaseDep);                                     //Valor Base
        JTextField TvalorBaseDep = new JTextField();
        TvalorBaseDep.setBounds(300, 150, 100, 25);
        TvalorBaseDep.setText("0");
        panelDeportivo.add(TvalorBaseDep);

        JLabel LStock = new JLabel("Stock");
        LStock.setBounds(300, 170, 150, 25);
        LStock.setFont(fuente);
        panelDeportivo.add(LStock);                                     //Valor Base
        JTextField TStock = new JTextField();
        TStock.setBounds(300, 200, 100, 25);
        TStock.setText("0");
        panelDeportivo.add(TStock);

        JButton IngresoBtn = new JButton("Ingresar");
        IngresoBtn.setBounds(300, 260, 100, 25);
        IngresoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se hace el get de lo ingresado en los campos para mandarlos al controlador
                double talle = getTalle(spin);
                String dia_venta = getDoW(comboDoW);                     //Ingreso de los datos (Registrar calzado)
                String tipo_material = getMaterial(comboMat);
                String tipo_deporte = getTipoDeporte(comboTipo);
                double valorBase = getValorBase(TvalorBaseDep);
                int stock = getStock(TStock);
                if (stock!=0 && talle!=0 && valorBase != 0){
                    controlador.IngresarDeportivo(talle, dia_venta, tipo_deporte, tipo_material, valorBase, stock);
                }
            }
        });
        panelDeportivo.add(IngresoBtn);

        //---------- Panel Ingreso Mujer --------------------------------------------------------------------- LISTO
        JLabel LdowM = new JLabel("Dia de la semana");
        LdowM.setBounds(75, 50, 120, 25);
        LdowM.setFont(fuente);
        panelMujer.add(LdowM);                                              //Dia de la semana
        JComboBox<String> comboDoWM = new JComboBox<>();
        comboDoWM.addItem("Semana");
        comboDoWM.addItem("Fin de semana");
        comboDoWM.setSelectedItem("Semana");
        comboDoWM.setBounds(75, 80, 100, 25);
        panelMujer.add(comboDoWM);

        JLabel LSpinTaco = new JLabel("Altura del taco (cm)");
        LSpinTaco.setFont(fuente);
        LSpinTaco.setBounds(75, 110, 120, 25);
        panelMujer.add(LSpinTaco);                                          //Altura del taco
        SpinnerNumberModel spinTaco = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner SpinnerTaco = new JSpinner(spinTaco);
        SpinnerTaco.setBounds(75, 140, 50, 25);
        panelMujer.add(SpinnerTaco);

        JLabel LSpinTalle = new JLabel("Talle");
        LSpinTalle.setFont(fuente);
        LSpinTalle.setBounds(75, 170, 100, 25);
        panelMujer.add(LSpinTalle);                                         //Talle del calzado
        SpinnerNumberModel spinTalle = new SpinnerNumberModel(0, 0, 50.0, 0.5);
        JSpinner SpinnerTalle = new JSpinner(spinTalle);
        SpinnerTalle.setBounds(75, 200, 50, 25);
        panelMujer.add(SpinnerTalle);

        JLabel LColor = new JLabel("Color");
        LColor.setBounds(75, 230, 100, 25);
        LColor.setFont(fuente);
        panelMujer.add(LColor);                                             //Color del calzado formal
        String[] colorNames = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Negro"};
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BLACK};
        JComboBox<String> comboColor = new JComboBox<>(colorNames);
        comboColor.setBounds(75, 260, 150, 20);
        panelMujer.add(comboColor);

        JLabel LvalorBaseMuj = new JLabel("Valor base del producto");
        LvalorBaseMuj.setBounds(300, 120, 150, 25);
        LvalorBaseMuj.setFont(fuente);
        panelMujer.add(LvalorBaseMuj);                                      //Valor Base
        JTextField TvalorBaseMuj = new JTextField();
        TvalorBaseMuj.setBounds(300, 150, 100, 25);
        TvalorBaseMuj.setText("0");
        panelMujer.add(TvalorBaseMuj);

        JLabel LStockM = new JLabel("Stock");
        LStockM.setBounds(300, 170, 150, 25);
        LStockM.setFont(fuente);
        panelMujer.add(LStockM);                                     //Stock
        JTextField TStockM = new JTextField();
        TStockM.setBounds(300, 200, 100, 25);
        panelMujer.add(TStockM);

        JButton IngresoBtnMuj = new JButton("Ingresar");
        IngresoBtnMuj.setBounds(300, 260, 100, 25);
        IngresoBtnMuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se hace el get de lo ingresado en los campos para mandarlos al controlador
                double talle = getTalle(spinTalle);
                String dia_venta = getDoW(comboDoWM);                     //Ingreso de los datos (Registrar calzado)
                double high = getHigh(spinTaco);
                Color color = colors[comboColor.getSelectedIndex()];
                double valorBase = getValorBase(TvalorBaseMuj);
                int stock = getStock(TStockM);
                if (stock != 0 && talle != 0 && valorBase != 0 && high != 0){
                    controlador.IngresarMujer(talle, dia_venta, valorBase, stock, high, color);
                }
            }
        });
        panelMujer.add(IngresoBtnMuj);

        //---------- Panel Ingreso Hombre --------------------------------------------------------------------- LISTO
        JLabel LdowH = new JLabel("Dia de la semana");
        LdowH.setBounds(75, 50, 120, 25);
        LdowH.setFont(fuente);
        panelHombre.add(LdowH);                                             //Dia de la semana (Day of Week)
        JComboBox<String> comboDoWH = new JComboBox<>();
        comboDoWH.addItem("Semana");
        comboDoWH.addItem("Fin de semana");
        comboDoWH.setSelectedItem("Semana");
        comboDoWH.setBounds(75, 80, 100, 25);
        panelHombre.add(comboDoWH);

        JLabel LSpinTalleHom = new JLabel("Talle");
        LSpinTalleHom.setFont(fuente);
        LSpinTalleHom.setBounds(75, 120, 100, 25);
        panelHombre.add(LSpinTalleHom);                                     //Talle del calzado
        SpinnerNumberModel spinTalleHom = new SpinnerNumberModel(0, 0, 50.0, 0.5);
        JSpinner SpinnerTalleHom = new JSpinner(spinTalleHom);
        SpinnerTalleHom.setBounds(75, 150, 50, 25);
        panelHombre.add(SpinnerTalleHom);

        JLabel LColorHom = new JLabel("Color");
        LColorHom.setBounds(75, 200, 100, 25);
        LColorHom.setFont(fuente);
        panelHombre.add(LColorHom);                                         //Color del calzado
        String[] colorNamesHom = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Negro"};
        Color[] colorsHom = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BLACK};
        JComboBox<String> comboColorHom = new JComboBox<>(colorNamesHom);
        comboColorHom.setBounds(75, 230, 150, 20);
        panelHombre.add(comboColorHom);

        JLabel LvalorBase = new JLabel("Valor base del producto");
        LvalorBase.setBounds(300, 50, 150, 25);
        LvalorBase.setFont(fuente);
        panelHombre.add(LvalorBase);                                        //Valor Base
        JTextField TvalorBase = new JTextField();
        TvalorBase.setBounds(300, 80, 100, 25);
        TvalorBase.setText("0");
        panelHombre.add(TvalorBase);

        JLabel LStockH = new JLabel("Stock");
        LStockH.setBounds(300, 120, 150, 25);
        LStockH.setFont(fuente);
        panelHombre.add(LStockH);                                     //Stock
        JTextField TStockH = new JTextField();
        TStockH.setBounds(300, 150, 100, 25);
        TStockH.setText("0");
        panelHombre.add(TStockH);

        JButton IngresoBtnHom = new JButton("Ingresar");
        IngresoBtnHom.setBounds(300, 230, 100, 25);
        IngresoBtnHom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se hace el get de lo ingresado en los campos para mandarlos al controlador
                double talle = getTalle(spinTalleHom);                          //Ingreso de los datos (Registrar calzado))
                String dia_venta = getDoW(comboDoWH);
                Color color = colorsHom[comboColor.getSelectedIndex()];
                double valorBase = getValorBase(TvalorBase);
                int stock = getStock(TStockH);
                if(valorBase!=0 && talle != 0 && stock != 0){
                    controlador.IngresarHombre(talle, dia_venta, valorBase, stock, color);
                }
            }
        });
        panelHombre.add(IngresoBtnHom);


        //--------------------------- Calzados Mujer ------------------------- LISTO
        //Debe mostrar Día de venta, altura de taco y descuento.
        JLabel calzado = new JLabel("Calzado:");
        calzado.setBounds(100, 50, 75, 25);
        panelCalMujer.add(calzado);
        JComboBox<Integer> comboCalMuj = new JComboBox<>();
        comboCalMuj.setBounds(100, 80, 50, 25);
        panelCalMujer.add(comboCalMuj);
        JLabel Ldia = new JLabel("Dia de venta: ");
        Ldia.setFont(fuente);
        Ldia.setBounds(300, 80, 200, 25);
        JLabel Lvv = new JLabel("Valor venta: ");
        Lvv.setFont(fuente);
        Lvv.setBounds(300, 110, 200, 25);
        JLabel Lhigh = new JLabel("Altura de taco: ");
        Lhigh.setFont(fuente);
        Lhigh.setBounds(300, 140, 150, 25);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (tabbedPane.getSelectedIndex() == 4){
                    ArrayList<Mujer> array = controlador.getCalMuj();
                    for (Mujer i : array){
                        if (!contieneValor(comboCalMuj, i.getProducto().getProCod())){
                            comboCalMuj.addItem(i.getProducto().getProCod());
                        }
                    }
                }
            }
        });

        comboCalMuj.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                controlador.calMujData(comboCalMuj, Ldia, Lvv, Lhigh);
            }
        });

        panelCalMujer.add(Ldia);
        panelCalMujer.add(Lvv);
        panelCalMujer.add(Lhigh);

        //---------------- ## ------------- Valor Venta ------------- ## ---------------       LISTO
        ArrayList<Calzado> AVV = new ArrayList<>();
        JLabel LVenta = new JLabel("Valor de venta del ultimo Calzado ingresado: ");
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (tabbedPane.getSelectedIndex() == 5){
                    if (!Inventario.calzados.values().isEmpty()){
                        AVV.addAll(Inventario.calzados.values());
                        LVenta.setText("Valor de venta del ultimo Calzado ingresado: \n" + AVV.getLast().valorVentaDoW());
                    }
                    else{
                        LVenta.setText("Valor de venta del ultimo Calzado ingresado: \n" + "No se ingresaron calzados");
                    }
                }
            }
        });

        Font fuenteVenta = new Font("Arial", Font.BOLD, 17);
        LVenta.setFont(fuenteVenta);
        LVenta.setBounds(50, 75, 450, 300);
        panelValorVenta.add(LVenta);



        //---------------- ## ------------- Total de impuesto Especifico ------------- ## --------------- LISTO

        JLabel LImpEsp = new JLabel("Total del impuesto Específico esperado: ");
        LImpEsp.setFont(fuente);
        LImpEsp.setBounds(175, 80, 300, 100);
        panelImpuestos.add(LImpEsp);

        JLabel valorIE = new JLabel();
        valorIE.setFont(fuente);
        valorIE.setBounds(200, 190, 300, 25);
        panelImpuestos.add(valorIE);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (tabbedPane.getSelectedIndex() == 3){
                    valorIE.setText(controlador.getTotalIE());
                }
            }
        });

        //---------------- ## ------------- Total de Descuento ------------- ## --------------- LISTO

        JLabel LDesc = new JLabel("Total de Descuento esperado: ");
        LDesc.setFont(fuente);
        LDesc.setBounds(175, 80, 300, 100);
        panelDescuentos.add(LDesc);

        JLabel valorDesc = new JLabel();
        valorDesc.setFont(fuente);
        valorDesc.setBounds(200, 190, 300, 25);
        panelDescuentos.add(valorDesc);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(tabbedPane.getSelectedIndex() == 2){
                    valorDesc.setText(controlador.getTotalDesc());
                }
            }
        });

        //---------------- ## ------------- Calzados TOP ------------- ## ---------------
        JLabel LTop = new JLabel("Cantidad de clazados top en la tienda: ");
        LTop.setFont(fuente);
        LTop.setBounds(175, 80, 300, 100);
        panelTop.add(LTop);

        JLabel cantTop = new JLabel();
        Font fuente2 = new Font("Arial", Font.BOLD,34);
        cantTop.setFont(fuente2);
        cantTop.setBounds(200, 190, 300, 75);
        panelTop.add(cantTop);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(tabbedPane.getSelectedIndex() == 1){
                    cantTop.setText(controlador.getCantTop());
                }
            }
        });

        //---------------- Add -------------------------------
        add(tabbedPane);
        panelIngreso.add(Sportbtn);
        panelIngreso.add(Hombtn);
        panelIngreso.add(Mujbtn);
        panelIngreso.add(title);
        panelDeportivo.add(atrasBtn);
        panelHombre.add(atrasBtn2);
        panelMujer.add(atrasBtn3);
        revalidate();
    }

    private double getTalle(SpinnerNumberModel spin){
         double valor = Double.parseDouble(spin.getNumber().toString());
         if (valor == 0.0){
             JOptionPane.showMessageDialog(null, "Ingrese talle distinto de 0 ", "Advertencia", JOptionPane.WARNING_MESSAGE);
             return valor;
         }else{
             return valor;
         }
    }

    private double getHigh(SpinnerNumberModel spin){
        double valor = Double.parseDouble(spin.getNumber().toString());
        if (valor != 0){
            return valor;
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese altura de taco mayor a 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return valor;
        }
    }

    private String getMaterial(JComboBox<String> comboMat){
        return (String) comboMat.getSelectedItem();
    }

    private String getDoW(JComboBox<String> comboDia){
        return (String) comboDia.getSelectedItem();
    }
    private String getTipoDeporte(JComboBox<String> comboTipo){
        return (String) comboTipo.getSelectedItem();
    }
    private double getValorBase(JTextField TextoValor){
        double valor;
        try{
            valor = Double.parseDouble(TextoValor.getText());
            if (valor != 0){
                return valor;
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese valor base distinto de 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Valor base incorrecto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }
    private int getStock(JTextField Tstock){
        int valor;
        try{
            valor  = Integer.parseInt(Tstock.getText());
            if (valor != 0){
                return valor;
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese stock de 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Stock incorrecto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    public static boolean contieneValor(JComboBox<Integer> comboBox, Integer valor) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(valor)) {
                return true;
            }
        }
        return false;
    }
}
