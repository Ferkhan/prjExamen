package UserInterface;

import javax.swing.JFrame;

import java.awt.*;

public class FrameLogin extends JFrame {
    private final String TITULO = "Login";
    private final int    ANCHO  = 800;
    private final int    ALTO   = 600;

    public FrameLogin() {
        setCustomization();
        addComponents();

    }

    private void setCustomization() {
        setTitle(TITULO);
        setSize(ANCHO, ALTO);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(true);             // cambiar esta propiedad
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void addComponents() {
        add(new PanelLogin());
        
    }

    

}
