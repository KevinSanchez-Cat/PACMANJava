package minijuego;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Mensaje {

    public static void error(JFrame jf, String s) {
        JOptionPane.showMessageDialog(jf, s, "Mensaje de Error", 0);

    }

    public static void exito(JFrame jf, String s) {
        JOptionPane.showMessageDialog(jf, s, "Mensaje de \u00e9xito", 1);

    }
}
