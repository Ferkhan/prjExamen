package UserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelLogin extends JPanel implements ActionListener {
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JTextField pswUsuario;
    private JPasswordField pswClave;
    private GridBagConstraints constraints;
    private JButton btnIngresar;

    PanelLogin() {
        setCustomization();
        initComponents();
        addComponents();
    }

    private void setCustomization() {
        setBackground(Color.GREEN); 
        setLayout(new GridBagLayout());
    }

    private void initComponents() {
        lblUsuario  = new JLabel("Usuario");
        lblClave    = new JLabel("Contraseña");
        pswUsuario  = new JTextField(15);
        pswClave    = new JPasswordField(15);
        btnIngresar = new JButton("Ingresar");

        constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Espacio alrededor de los componentes
        // constraints.fill = GridBagConstraints.VERTICAL; // Rellenar horizontalmente
        
        btnIngresar.addActionListener(this);
        
        
        
    }

    private void addComponents() {
        constraints.gridx = 0; 
        constraints.gridy = 0;
        add(lblUsuario, constraints);

        constraints.gridy = 1;
        add(pswUsuario, constraints);
        
        constraints.gridy = 2;
        add(lblClave,constraints);
        
        constraints.gridy = 3;
        add(pswClave, constraints);

        constraints.gridy = 4;
        add(btnIngresar, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            setVisible(false);
            try {
                new PanelTabla().setVisible(true);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }
}
