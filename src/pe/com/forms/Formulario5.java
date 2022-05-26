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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.label1 = new JLabel("¿Deseas continuar?");
        this.label1.setBounds(10, 10, 380, 30);
        add(this.label1);

        this.button1 = new JButton("Yes");
        this.button1.setBounds(50, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);

        this.button2 = new JButton("No");
        this.button2.setBounds(150, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);

        this.button3 = new JButton("Cancel");
        this.button3.setBounds(250, 100, 90, 30);
        add(this.button3);
        this.button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {
            Formulario1 formulario1 = new Formulario1();
            formulario1.setBounds(0, 0, 400, 200);
            formulario1.setVisible(true);
            formulario1.setLocationRelativeTo(null);
            formulario1.setResizable(false);
            this.setVisible(false);
        } else if (e.getSource() == this.button2 ||e.getSource() == this.button3) {
            JOptionPane.showMessageDialog(null,
                    "Programa Finalizado.");
            System.exit(0);
        }
    }
}
