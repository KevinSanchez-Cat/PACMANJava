package minijuego;

import javax.swing.JProgressBar;

/**
 *
 * @author kevin2
 */
public class HiloFantasmas implements Runnable {

    int seg;
    JProgressBar pr;

    /**
     *
     * @param segT
     * @param pr
     */
    public HiloFantasmas(int segT, JProgressBar pr) {
        if (segT == 0) {
            this.seg = 15;
        } else {
            this.seg = segT;
        }
        this.pr = pr;
    }

    /**
     *
     */
    @Override
    public void run() {

        //this.pr.setForeground(new java.awt.Color(204,0,0));
        while (this.seg >= 0) {
            try {
                this.pr.setValue(this.seg * 100 / 15);
                Thread.sleep(1000);

                if (InterfazPacman.clip.isOpen()) {
                    InterfazPacman.clip.close();
                    InterfazPacman.sonidoFondo(InterfazPacman.fantasmas);
                }
            } catch (InterruptedException ex) {
                Mensaje.error(null, ex.toString());
            }
            if (this.seg == 0) {

                if (InterfazPacman.clip.isOpen()) {
                    InterfazPacman.clip.close();
                    InterfazPacman.sonidoFondo(InterfazPacman.comeCome);
                }
                Pacman.fantasma1.estado = true;
                Pacman.fantasma2.estado = true;
                Pacman.fantasma3.estado = true;
                Pacman.fantasma4.estado = true;
                Pacman.fantasma1.pintarEstado(false, Pacman.fantasma1.b);
                Pacman.fantasma2.pintarEstado(false, Pacman.fantasma2.b);
                Pacman.fantasma3.pintarEstado(false, Pacman.fantasma3.b);
                Pacman.fantasma4.pintarEstado(false, Pacman.fantasma4.b);
            }
            this.seg--;
        }
    }
}
