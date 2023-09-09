package UserInterface;

import java.awt.*;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameTabla extends JFrame {
    private final String TITULO = "Tabla";
    private final int    ANCHO  = 800;
    private final int    ALTO   = 600;
    private JLabel lblTitulo;

    public FrameTabla() throws IOException {
        setCustomization();
        initComponents();
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

    private void initComponents() {
        lblTitulo = new JLabel("Lista de ...");
    }

    private void addComponents() throws IOException {
        add(new PanelTabla(), BorderLayout.CENTER);
        add(new JPanel().add(lblTitulo), BorderLayout.NORTH);
    }

}
