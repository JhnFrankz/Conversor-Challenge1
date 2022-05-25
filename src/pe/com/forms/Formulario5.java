package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario5 extends JFrame implements ActionListener {

    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public Formulario5() {       //width: 300    height: 200
        this.setTitle("Seleccione una opción");
        setLayout(null);
        this.label1 = new JLabel("¿Deseas continuar?");
        this.label1.setBounds(10, 10, 380, 30);
        add(this.label1);

        this.button1 = new JButton("Aceptar");
        this.button1.setBounds(10, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);

        this.button2 = new JButton("Cerrar");
        this.button2.setBounds(120, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);

        this.button3 = new JButton("Cerrar");
        this.button2.setBounds(120, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);
    }

    //e contiene el objeto donde se origina el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {

        } else if (e.getSource() == this.button2 ||e.getSource() == this.button3) {
            System.exit(0);
        }
    }
}
