package minijuego;

import javax.swing.JLabel;

/**
 *
 * @author kevin2
 */
public class EsquivaJD extends Thread {

    JLabel eti;
    InterfazPacman jf;

    public EsquivaJD(JLabel eti, InterfazPacman jf) {
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
                            || Manipula.topeXY(jf.getLblFnatasmaNaranja(), jf.getLblPacman())
                            || Manipula.topeXY(jf.getLblFantasmaAzul(), jf.getLblPacman())
                            || Manipula.topeXY(jf.getLblFantasmaAmarillo(), jf.getLblPacman())) {
                        if (Manipula.topeXY(jf.getLblFantasmaRojo(), jf.getLblPacman())) {
                            Manipula.tocaFantasma1(this.jf, Pacman.hiloD);
                        } else if (Manipula.topeXY(jf.getLblFantasmaAzul(), jf.getLblPacman())) {
                            Manipula.tocaFantasma2(this.jf, Pacman.hiloD);
                        } else if (Manipula.topeXY(jf.getLblFnatasmaNaranja(), jf.getLblPacman())) {
                            Manipula.tocaFantasma3(this.jf, Pacman.hiloD);
                        } else {
                            Manipula.tocaFantasma4(this.jf, Pacman.hiloD);
                        }
                    } else if (this.eti.getX() >= 980) {
                        this.eti.setLocation(0, this.eti.getY());
                        this.jf.repaint();
                    } else if (Manipula.tope(this.jf, this.eti)) {
                        this.correDe();
                    } else {
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        Manipula.topePatilla(jf, eti);
                        this.jf.repaint();
                    }
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    public void correDe() {
        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
        this.jf.repaint();
        if (Manipula.tope(this.jf, this.eti)) {
            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
            this.jf.repaint();
            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
            this.jf.repaint();
            if (Manipula.tope(this.jf, this.eti)) {
                this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                this.jf.repaint();
                this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                this.jf.repaint();
                if (Manipula.tope(this.jf, this.eti)) {
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.jf.repaint();
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.jf.repaint();
                }
            }
        }
    }
}
