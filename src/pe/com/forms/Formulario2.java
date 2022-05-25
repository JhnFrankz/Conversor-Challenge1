package pe.com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario2 extends JFrame implements ActionListener {
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private double valorIngresado;

    public Formulario2() {       //width: 300    height: 200
        this.setTitle("Input");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.label1 = new JLabel("Ingresa la cantidad de dinero que" +
                " deseas convertir: ");
        this.label1.setBounds(10, 10, 380, 30);
        add(this.label1);

        this.textField1 = new JTextField();
        this.textField1.setBounds(10, 50, 340, 30);
        add(this.textField1);

        this.button1 = new JButton("Aceptar");
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
            String valor;
            valor = this.textField1.getText();
            if (valor.isBlank()) {
                //El input nunca será null, si está vacio manda ""
                JOptionPane.showMessageDialog(null,
                        "El campo no puede estar vacio.");
                this.textField1.setText("");
            } else {
                //Si el input no está en blanco, se valida si es un numero
                boolean esNumero = false;

                try {
                    this.valorIngresado = Double.parseDouble(valor);
                    esNumero = true;
                    System.out.println(this.valorIngresado);
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(null,
                            "Solo puede ingresar un número.");
                }

                if (esNumero) {
                    Formulario3 formulario3 = new Formulario3();
                    formulario3.setBounds(0, 0, 400, 200);
                    formulario3.setVisible(true);
                    formulario3.setLocationRelativeTo(null);
                    formulario3.setResizable(false);
                    this.setVisible(false);
                }
            }
            //Dar validación, mostrar showInput encaso no sea numero
        } else if (e.getSource() == this.button2) {
            System.exit(0);
        }
    }
}
