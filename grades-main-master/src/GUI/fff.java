package GUI;


import javax.swing.*;
import java.awt.*;

public class fff extends JFrame {
        Panel panelBotones = new Panel();

        Label titulo=new Label();
        Label nombre=new Label();
        Label direccion=new Label();
        Label pago=new Label();
        Label telefono=new Label();
        Label ciudad=new Label();
        Label provincia=new Label();

        TextField textNombre=new TextField();
        TextField textDireccion=new TextField();
        TextField textCiudad=new TextField();
        TextField textProvincia=new TextField();

        Choice chPago=new Choice();

        Button btnPago=new Button();
        Button btnCancelar=new Button();

        GridBagLayout gbl=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        FlowLayout flowLayout1=new FlowLayout();

        public void init() {
            setBackground(Color.lightGray);
            //propiedades de los controles
            titulo.setText("Compre algo ahora");
            titulo.setFont(new Font("Times-Roman", Font.BOLD + Font.ITALIC, 16));
            nombre.setText("Nombre:");
            direccion.setText("Dirección:");
            pago.setText("Método de pago:");
            telefono.setText("Teléfono:");
            ciudad.setText("Ciudad:");
            provincia.setText("Provincia:");

            textNombre.setColumns(25);
            textDireccion.setColumns(25);
            textCiudad.setColumns(15);
            textProvincia.setColumns(2);

            btnPago.setLabel("Comprar");
            btnCancelar.setLabel("Cancelar");

            chPago.add("Visa");
            chPago.add("MasterCard");
            chPago.add("Caja Ahorros");

//gestor gridBaglayout
            setLayout(gbl);

//primera fila - título
            gbc.anchor=GridBagConstraints.NORTH;
            gbc.insets=new Insets(0,0,10,0);
            gbc.gridwidth=GridBagConstraints.REMAINDER;
            add(titulo, gbc);
//segunda fila - nombre
            gbc.fill=GridBagConstraints.HORIZONTAL;
            gbc.anchor=GridBagConstraints.WEST;
            gbc.gridwidth=1;
            gbc.insets=new Insets(0,0,0,0);
            add(nombre, gbc);
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            add(textNombre, gbc);
//tercera fila - dirección
            gbc.gridwidth = 1;
            add(direccion, gbc);
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            add(textDireccion, gbc);
//cuarta fila - ciudad   - provincia
            gbc.gridwidth = 1;
            add(ciudad, gbc);
            add(textCiudad, gbc);
            add(provincia, gbc);
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            add(textProvincia, gbc);
//quinta fila - pago
            gbc.gridwidth = 1;
            add(pago, gbc);
            gbc.insets=new Insets(5,0,5,0);
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.fill=GridBagConstraints.NONE;
            add(chPago, gbc);
//panel de los botones
            panelBotones.setLayout(flowLayout1);
            panelBotones.add(btnPago);
            panelBotones.add(btnCancelar);

            gbc.anchor=GridBagConstraints.SOUTH;
            gbc.insets=new Insets(15,0,0,0);
            add(panelBotones, gbc);
        }
    }

