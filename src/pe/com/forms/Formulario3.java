package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario3 extends JFrame implements ActionListener, ItemListener {
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JButton button1;
    private JButton button2;
    private int conversorSeleccionado = 0;

    public Formulario3() {       //width: 300    height: 200
        this.setTitle("Menu");
        setLayout(null);
        this.label1 = new JLabel("Elije la moneda a la que deseas" +
                "convertir tu dinero:: ");
        this.label1.setBounds(10, 10, 280, 30);
        add(this.label1);

        this.comboBox1 = new JComboBox<>();
        this.comboBox1.setBounds(10, 50, 260, 30);
        add(this.comboBox1);
        this.comboBox1.addItem("De Soles a Dólar");
        this.comboBox1.addItem("De Soles a Euro");
        this.comboBox1.addItem("De Soles a Libras");
        this.comboBox1.addItem("De Soles a Yen");
        this.comboBox1.addItem("De Soles a Won Coreano");
        this.comboBox1.addItem("De Dólar a Soles");
        this.comboBox1.addItem("De Euro a Soles");
        this.comboBox1.addItem("De Libras a Soles");
        this.comboBox1.addItem("De Yen a Soles");
        this.comboBox1.addItem("De Won Coreano a Soles");
        this.comboBox1.addItemListener(this);

        this.button1 = new JButton("Convertir");
        this.button1.setBounds(10, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);   //Indicamos que el evento es en este boton

        this.button2 = new JButton("Cerrar");
        this.button2.setBounds(120, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);
    }

    //e contiene el objeto donde se origina el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {
            System.out.println("Ir a las monedas convertidas");
            /*if (this.conversorSeleccionado == 0) {
                Formulario2 formulario2 = new Formulario2();
                formulario2.setBounds(0, 0, 300, 200);
                formulario2.setVisible(true);
                formulario2.setLocationRelativeTo(null);
                formulario2.setResizable(false);
                this.setVisible(false);
            } else if (this.conversorSeleccionado == 1) {
                System.out.println("Ir al conversor de temperaturas");
            }*/
        } else if (e.getSource() == this.button2) {
            System.exit(0);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.comboBox1) {
            this.conversorSeleccionado = this.comboBox1.getSelectedIndex();
            System.out.println(conversorSeleccionado);
        }
    }
}