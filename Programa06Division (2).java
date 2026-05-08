import javax.swing.*;
import java.awt.*;


public class Programa06Division extends JFrame {

    public Programa06Division() {
        // Configuración de la ventana
        setTitle("División");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Componentes
        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JLabel r = new JLabel("Resultado: ");
        JButton btn = new JButton("Dividir");

        // Agregar componentes a la cuadrícula
        add(new JLabel("Número 1:"));
        add(a);
        add(new JLabel("Número 2:"));
        add(b);
        add(btn);
        add(r);

        // Evento del botón
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(a.getText());
                    double n2 = Double.parseDouble(b.getText());
                    
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                    } else {
                        double resultado = n1 / n2;
                        r.setText("Resultado: " + resultado);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Datos inválidos");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Programa06Division();
            }
        });
    }
}