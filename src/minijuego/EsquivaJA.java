package minijuego;

import javax.swing.JLabel;

/**
 *
 * @author kevin2
 */
public class EsquivaJA extends Thread {

    JLabel eti;
    InterfazPacman jf;
    

    public EsquivaJA(JLabel eti, InterfazPacman jf) {
        this.eti = eti;
        this.jf = jf;
    }

    @Override
    public void run() {
        while (true) {
            if (Pacman.vidas < 0) {
                break;
            }
            if (Pacman.noPastillas == 0) {
                //termina juego con exito
               
                Manipula.nigunaVida(jf);
                break;
                
            } else {
                try {
                    if (Manipula.topeXY(this.jf.getLblPastillaT1(), this.eti)
                            || Manipula.topeXY(this.jf.getLblPastillaT2(), this.eti)
                            || Manipula.topeXY(this.jf.getLblPastillaT3(), this.eti)
                            || Manipula.topeXY(this.jf.getLblPastillaT4(), this.eti)) {
                        Manipula.activarPastillas(this.jf, this.eti);
                    }
                    if (Manipula.topeXY(jf.getLblFantasmaRojo(), jf.getLblPacman())
                            || Manipula.topeXY(jf.getLblFantasmaAzul(), jf.getLblPacman())
                            || Manipula.topeXY(jf.getLblFantasmaAmarillo(), jf.getLblPacman())
                            || Manipula.topeXY(jf.getLblFnatasmaNaranja(), jf.getLblPacman())) {

                        if (Manipula.topeXY(jf.getLblFantasmaRojo(), jf.getLblPacman())) {

                            Manipula.tocaFantasma1(this.jf, Pacman.hiloA);

                        } else if (Manipula.topeXY(jf.getLblFantasmaAzul(), jf.getLblPacman())) {

                            Manipula.tocaFantasma2(this.jf, Pacman.hiloA);

                        } else if (Manipula.topeXY(jf.getLblFnatasmaNaranja(), jf.getLblPacman())) {

                            Manipula.tocaFantasma3(this.jf, Pacman.hiloA);
                        } else {
                            Manipula.tocaFantasma4(this.jf, Pacman.hiloA);
                        }
                    } else if (this.eti.getY() < 0) {
                        this.eti.setLocation(470, 470);
                        this.jf.repaint();
                    } else if (Manipula.tope(this.jf, this.eti)) {
                        this.correAr();
                    } else {
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        Manipula.topePatilla(jf, eti);
                        this.jf.repaint();
                    }
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                }
            }

        }
    }

    public void correAr() {
        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
        this.jf.repaint();
        if (Manipula.tope(this.jf, this.eti)) {
            this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
            this.jf.repaint();
            this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
            this.jf.repaint();
            if (Manipula.tope(this.jf, this.eti)) {
                this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                this.jf.repaint();
                this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                this.jf.repaint();
                if (Manipula.tope(this.jf, this.eti)) {
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.jf.repaint();
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.jf.repaint();
                }
            }
        }
    }
}
