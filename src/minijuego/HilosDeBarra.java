package minijuego;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author kevin2
 */
public class HilosDeBarra extends Thread {

    javax.swing.JProgressBar jProgressBar1;
    int retraso;
    JFrame jf;

    /**
     *
     * @param jProgressBar1
     * @param jf
     */
    public HilosDeBarra(JProgressBar jProgressBar1, JFrame jf) {
        this.jProgressBar1 = jProgressBar1;
        retraso = 50;
        this.jf = jf;
    }

    /**
     *
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {

                jProgressBar1.setValue(i);
                sleep(retraso);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jf.dispose();
        InterfazPacman iPacman = new InterfazPacman();
        iPacman.setVisible(true);
        stop();
    }
}
