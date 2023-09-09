package UserInterface;

import java.awt.*;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PanelLogin extends JPanel {
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JPasswordField pswUsuario;
    private JPasswordField pswClave;

    PanelLogin() {
        setCustomization();
        initComponents();
        addComponents();
    }

    private void setCustomization() {
        setBackground(Color.GREEN); 
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
    }

    private void initComponents() {
        lblUsuario = new JLabel("Usuario");
        lblClave   = new JLabel("Contraseña");
        pswUsuario = new JPasswordField();
        pswClave   = new JPasswordField();

        




    }

    private void addComponents() {
        add(lblUsuario);
        add(lblClave);
        add(pswUsuario);
        add(pswClave);
    }
}
