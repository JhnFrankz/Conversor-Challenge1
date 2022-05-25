package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario4 extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton button1;

    public Formulario4() {       //width: 300    height: 200
        this.setTitle("Resultado");
        setLayout(null);

        double resultado = 123;
        this.label1 = new JLabel("Tienes $" + resultado + " dolares.");
        this.label1.setBounds(10, 10, 2380, 30);
        add(this.label1);

        this.button1 = new JButton("OK");
        this.button1.setBounds(10, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);
    }

    //e contiene el objeto donde se origina el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {
            Formulario5 formulario5 = new Formulario5();
            formulario5.setBounds(0, 0, 400, 200);
            formulario5.setVisible(true);
            formulario5.setLocationRelativeTo(null);
            formulario5.setResizable(false);
            this.setVisible(false);
        }
    }
}
