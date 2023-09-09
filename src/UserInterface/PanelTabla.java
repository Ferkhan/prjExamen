package UserInterface;

import java.awt.*;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BusinessLogic.GestionArchivos;

public class PanelTabla extends JPanel {
    
    private JTable tabla;
    private DefaultTableModel tableModel;
    private String[] header;
    private Object[][] data;

    PanelTabla() throws IOException {
        setCustomization();
        initComponents();
        addComponents();
    }

    private void setCustomization() {
        setBackground(Color.MAGENTA); 
        setLayout(new GridBagLayout());
    }

    private void initComponents() throws IOException {
        header = new String[]{"Id", "Titulo", "Distribuidor", "Plataforma", "Anio", "Ventas", "7", "8", "9", "10", "11", "12", "13"};
        data = new GestionArchivos().obtenerDatos();
    }

    private void addComponents() {

        tableModel = new DefaultTableModel(data, header);

        tabla = new JTable(tableModel);
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.LIGHT_GRAY);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(false);
        tabla.setPreferredScrollableViewportSize(new Dimension(1000, 400));
        tabla.setFillsViewportHeight(true);
        
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }
    
}
