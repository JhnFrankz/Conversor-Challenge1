package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario2 extends JFrame implements ActionListener {
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private String valorIngresado;

    public Formulario2() {       //width: 300    height: 200
        this.setTitle("Input");
        setLayout(null);
        this.label1 = new JLabel("Seleccione una opción de conversión: ");
        this.label1.setBounds(10, 10, 280, 30);
        add(this.label1);

        this.textField1 = new JTextField();
        this.textField1.setBounds(10, 50, 260, 30);
        add(this.textField1);

        this.button1 = new JButton("Aceptar");
        this.button1.setBounds(10, 100, 90, 30);
        add(this.button1);
        this.button1.addActionListener(this);   //Indicamos que el evento es en este boton

        this.button2 = new JButton("Cancelar");
        this.button2.setBounds(120, 100, 90, 30);
        add(this.button2);
        this.button2.addActionListener(this);
    }

    //e contiene el objeto donde se origina el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button1) {
            this.valorIngresado = this.textField1.getText();
            System.out.println(this.valorIngresado);
            //Dar validación, mostrar showInput encaso no sea numero
        } else if (e.getSource() == this.button2) {
            System.exit(0);
        }
    }
}
