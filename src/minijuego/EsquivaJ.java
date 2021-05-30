package minijuego;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kevin2
 */
public class EsquivaJ extends Thread {

    JLabel eti;
    boolean estado;
    InterfazPacman pc;
    JFrame js;
    int b;
    int i;
    int noQuien;

    public EsquivaJ(JLabel eti, InterfazPacman carrera, int n) {
        this.eti = eti;
        this.pc = carrera;
        this.js = (JFrame) carrera;
        this.noQuien = n;
        this.estado = true;
    }

    @Override
    public void run() {
        this.b = (int) (Math.random() * 3.0) + 1;

        while (true) {
            while (true) {
                try {
                    while (true) {
                        if (this.estado) {
                            this.b = this.posicion(this.b);
                        } else {
                            this.b = this.posicion(this.b, true);
                        }
                        if (this.eti.getX() >= 980) {
                            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                            this.pc.repaint();
                            this.i = this.b;
                            while (this.i == this.b) {
                                this.i = (int) (Math.random() * 3.0) + 1;
                            }
                            this.b = this.i;
                        }
                        if (this.eti.getX() <= 0) {
                            this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                            this.pc.repaint();
                            this.i = this.b;
                            while (this.i == this.b) {
                                this.i = (int) (Math.random() * 3.0) + 1;
                            }
                            this.b = this.i;
                        }
                        if (this.eti.getY() >= 650) {
                            this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                            this.pc.repaint();
                            this.i = this.b;
                            while (this.i == this.b) {
                                this.i = (int) (Math.random() * 3.0) + 1;
                            }
                            this.b = this.i;
                        }
                        if (this.eti.getY() <= 0) {
                            this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                            this.pc.repaint();
                            this.i = this.b;
                            while (this.i == this.b) {
                                this.i = (int) (Math.random() * 3.0) + 1;
                            }
                            this.b = this.i;
                        }
                        Thread.sleep(5);
                    }
                } catch (InterruptedException ex) {

                }

            }
        }
    }

    public int posicion(int i) {
        int h = i;
        switch (i) {
            case 1: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 1) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    this.queFantasma(i);
                    break;
                }
                i = this.correDe();
                if (h != i) {
                    this.queFantasma(i);
                    break;
                }
                break;
            }
            case 2: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 2) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    this.queFantasma(i);
                    break;
                }
                i = this.correIz();
                if (h != i) {
                    this.queFantasma(i);
                    break;
                }
                break;
            }
            case 3: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 3) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    this.queFantasma(i);
                    break;
                }
                i = this.correAr();
                if (h != i) {
                    this.queFantasma(i);
                    break;
                }
                break;
            }
            case 4: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 4) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.queFantasma(i);
                    this.buscaTope();
                    break;
                }
                i = this.correAb();
                if (h != i) {
                    this.queFantasma(i);
                    break;
                }
                break;
            }
        }
        return i;
    }

    public int posicion(int i, boolean b) {
        switch (i) {
            case 1: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 1) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    break;
                }
                i = this.correDe();
                break;
            }
            case 2: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 2) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    break;
                }
                i = this.correIz();
                break;
            }
            case 3: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 3) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    break;
                }
                i = this.correAr();
                break;
            }
            case 4: {
                if (Manipula.tope(this.pc, this.eti)) {
                    while (i == 4) {
                        i = (int) (Math.random() * 3.0) + 1;
                    }
                    this.buscaTope();
                    break;
                }
                i = this.correAb();
                break;
            }
        }
        return i;
    }

    public void buscaTope() {
        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
        this.pc.repaint();
        if (Manipula.tope(this.pc, this.eti)) {
            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
            this.pc.repaint();
            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
            this.pc.repaint();
            if (Manipula.tope(this.pc, this.eti)) {
                this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                this.pc.repaint();
                this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                this.pc.repaint();
                if (Manipula.tope(this.pc, this.eti)) {
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                }
            }
        }
    }

    public int correDe() {
        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
        this.pc.repaint();
        if (Manipula.tope(this.pc, this.eti)) {
            this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
            this.pc.repaint();
            final int correrA = (int) (Math.random() * 2.0) + 1;
            switch (correrA) {
                case 1:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 4;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 2;
                case 2:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 3;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                        this.pc.repaint();
                        return 4;
                    }
                    return 2;
                case 3:
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 2;
                    }
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 4;
                default:
                    break;
            }
        }
        return 1;
    }

    public int correIz() {
        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
        this.pc.repaint();
        if (Manipula.tope(this.pc, this.eti)) {
            this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
            this.pc.repaint();
            final int correrA = (int) (Math.random() * 2.0) + 1;
            switch (correrA) {
                case 1:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 4;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 1;
                case 2:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 3;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        this.pc.repaint();
                        return 1;
                    }
                    return 4;
                case 3:
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 1;
                    }
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 4;
                default:
                    break;
            }
        }
        return 2;
    }

    public int correAr() {
        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
        this.pc.repaint();
        if (Manipula.tope(this.pc, this.eti)) {
            this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
            this.pc.repaint();
            final int correrA = (int) (Math.random() * 2.0) + 1;
            switch (correrA) {
                case 1:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 4;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        return 2;
                    }
                    return 1;
                case 2:
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 1;
                    }
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                        this.pc.repaint();
                        return 4;
                    }
                    return 2;
                case 3:
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 2;
                    }
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                        this.pc.repaint();
                        return 4;
                    }
                    return 1;
                default:
                    break;
            }
        }
        return 3;
    }

    public int correAb() {
        this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
        this.pc.repaint();
        if (Manipula.tope(this.pc, this.eti)) {
            this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
            this.pc.repaint();
            int correrA = (int) (Math.random() * 2.0) + 1;
            switch (correrA) {
                case 1:
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 1;
                    }
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 2;
                case 2:
                    this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 2;
                    }
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                        this.pc.repaint();
                        return 3;
                    }
                    return 1;
                case 3:
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() - 1);
                    this.pc.repaint();
                    if (!Manipula.tope(this.pc, this.eti)) {
                        return 3;
                    }
                    this.eti.setLocation(this.eti.getX(), this.eti.getY() + 1);
                    this.pc.repaint();
                    this.eti.setLocation(this.eti.getX() + 1, this.eti.getY());
                    this.pc.repaint();
                    if (Manipula.tope(this.pc, this.eti)) {
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        this.eti.setLocation(this.eti.getX() - 1, this.eti.getY());
                        this.pc.repaint();
                        return 2;
                    }
                    return 1;
                default:
                    break;
            }
        }
        return 4;
    }

    public void queFantasma(int pos) {
        if (this.noQuien == 5) {
            this.pintarOjosF1(pos);
        }
        if (this.noQuien == 6) {
            this.pintarOjosF2(pos);
        }
        if (this.noQuien == 7) {
            this.pintarOjosF3(pos);
        }
        if (this.noQuien == 8) {
            this.pintarOjosF4(pos);
        }
    }

    public void pintarEstado(boolean estado, int pos) {
        if (estado) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen00.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        } else {
            this.queFantasma(pos);
        }
    }

    public void pintarOjosF1(int pos) {
        if (pos == 1) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen25.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 2) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen15.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 3) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen45.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 4) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen35.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
    }

    public void pintarOjosF2(int pos) {
        if (pos == 1) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen26.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 2) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen16.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 3) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen46.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 4) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen36.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
    }

    public void pintarOjosF3(int pos) {
        if (pos == 1) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen27.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 2) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen17.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 3) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen47.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 4) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen37.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
    }

    public void pintarOjosF4(int pos) {
        if (pos == 1) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen28.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 2) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen18.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 3) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen48.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
        if (pos == 4) {
            this.eti.setIcon(new ImageIcon(Pacman.imagen38.getImage().getScaledInstance(this.eti.getWidth(), this.eti.getHeight(), 4)));
        }
    }
}
