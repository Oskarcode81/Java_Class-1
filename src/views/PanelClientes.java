package views;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import model.Client;
import java.awt.GridLayout;

public class PanelClientes extends JPanel {

    private Interfaz interfaz;
    private JList<Client> listarClientes;

    public PanelClientes(Interfaz Inter) {
        super();
        setLayout(new GridLayout());
        setBorder(new TitledBorder("Clientes"));
        interfaz = Inter;

        String[] nombres = {"Nombre 1", "Nombre 2", "Otro nombre"};

        listarClientes = new JList<Client>();
    }
    
}
