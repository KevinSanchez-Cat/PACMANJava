package minijuego;

import javax.swing.JProgressBar;

/**
 *
 * @author kevin2
 */
public class HiloTemporizador implements Runnable {

    InterfazPacman juego;
    int seg;
    int segT;
    int aux;
    JProgressBar pr;

    /**
     *
     * @param segT
     * @param pr
     * @param pc
     */
    public HiloTemporizador(int segT, JProgressBar pr, InterfazPacman pc) {
        if (segT == 0) {
            this.segT = 100;
            this.aux = 0;
        } else {
            this.segT = segT;
            this.aux = segT;
        }
        this.pr = pr;
        this.juego = pc;
    }

    /**
     *
     */
    @Override
    public void run() {
        if (Pacman.vidas == 0 || Pacman.vidas == 1 || Pacman.vidas == 2 || Pacman.vidas == 3) {
          //  this.pr.setForeground(Color.blue);
            this.seg = this.segT;
            while (this.seg >= 0) {
                try {
                    this.pr.setValue(this.seg);
                    if (this.aux == 0) {
                        if (this.seg % 20 == 0 && this.seg != 100) {
                            Pacman.puntaje += 50;
                            juego.getLblPuntaje().setText("" + Pacman.puntaje);
                        }
                        Thread.sleep(1000);
                    } else {
                        this.aux = 0;
                        Thread.sleep(250);
                    }
                } catch (InterruptedException ex) {
                    Mensaje.error(null, ex.toString());
                }

                if (this.seg == 0) {
                    Pacman.tareaTemporizador = new HiloTemporizador(100, this.pr, this.juego);
                    (Pacman.hT = new Thread(Pacman.tareaTemporizador)).start();
                    break;
                }
                this.seg--;
            }
        }
    }
}
