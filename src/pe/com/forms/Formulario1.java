package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario1 extends JFrame implements ActionListener, ItemListener {
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JButton button1;
    private JButton button2;
    private int conversorSeleccionado = 0;

    public Formulario1() {       //width: 300    height: 200
        this.setTitle("Menu");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.label1 = new JLabel("Seleccione una opción de conversión: ");
        this.label1.setBounds(10, 10, 380, 30);
        add(this.label1);

        this.comboBox1 = new JComboBox<>();
        this.comboBox1.setBounds(10, 50, 360, 30);
        add(this.comboBox1);
        this.comboBox1.addItem("Conversor de monedas");
        this.comboBox1.addItem("Conversor de temperaturas");
        this.comboBox1.addItemListener(this);

        this.button1 = new JButton("Aceptar");
        this.button1.setBounds(95, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);   //Indicamos que el evento es en este boton

        this.button2 = new JButton("Cerrar");
        this.button2.setBounds(195, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);
    }

    //e contiene el objeto donde se origina el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {
            if (this.conversorSeleccionado == 0) {
                Formulario2 formulario2 = new Formulario2();
                formulario2.setBounds(0, 0, 400, 200);
                formulario2.setVisible(true);
                formulario2.setLocationRelativeTo(null);
                formulario2.setResizable(false);
                this.setVisible(false);
            } else if (this.conversorSeleccionado == 1) {
                JOptionPane.showMessageDialog(null,
                        "En proceso de implementar..",
                        "Inf", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == this.button2) {
            System.exit(0);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.comboBox1) {
            this.conversorSeleccionado = this.comboBox1.getSelectedIndex();
        }
    }
}
