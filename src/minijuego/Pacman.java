/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuego;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author kevin2
 */
public final class Pacman {

    //Variables
    public static int vidas = 3;
    public static int puntaje = 0;
    public static int XP = 470;
    public static int YP = 470;
    public static int mxpuntaje = 0;
    //Hilos de Pacman
    public static EsquivaJI hiloI;
    public static EsquivaJD hiloD;
    public static EsquivaJA hiloA;
    public static EsquivaJB hiloB;
    //Variables de direccion del pacman
    public static char direcPacman;
    //Hilos de fantasmas
    public static EsquivaJ fantasma1;
    public static EsquivaJ fantasma2;
    public static EsquivaJ fantasma3;
    public static EsquivaJ fantasma4;
    //Iconos de los ojos de los fantasmas
    public static ImageIcon imagen1 = new ImageIcon(ClassLoader.getSystemResource("imagenes/pc_1.png"));
    public static ImageIcon imagen2 = new ImageIcon(ClassLoader.getSystemResource("imagenes/pc_2.png"));
    public static ImageIcon imagen3 = new ImageIcon(ClassLoader.getSystemResource("imagenes/pc_3.png"));
    public static ImageIcon imagen4 = new ImageIcon(ClassLoader.getSystemResource("imagenes/pc_4.png"));
    //Fantasmitas
    public static ImageIcon imagen15 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f1d.png"));
    public static ImageIcon imagen16 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f2d.png"));
    public static ImageIcon imagen17 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f3d.png"));
    public static ImageIcon imagen18 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f4d.png"));
    public static ImageIcon imagen25 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f1i.png"));
    public static ImageIcon imagen26 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f2i.png"));
    public static ImageIcon imagen27 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f3i.png"));
    public static ImageIcon imagen28 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f4i.png"));
    public static ImageIcon imagen35 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f1a.png"));
    public static ImageIcon imagen36 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f2a.png"));
    public static ImageIcon imagen37 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f3a.png"));
    public static ImageIcon imagen38 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f4a.png"));
    public static ImageIcon imagen45 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f1b.png"));
    public static ImageIcon imagen46 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f2b.png"));
    public static ImageIcon imagen47 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f3b.png"));
    public static ImageIcon imagen48 = new ImageIcon(ClassLoader.getSystemResource("imagenes/f4b.png"));
    public static ImageIcon imagen00 = new ImageIcon(ClassLoader.getSystemResource("imagenes/ffff.png"));
    //Etiquetas de objetos
    JLabel pacmancito = new JLabel();
    JLabel fantasmita1 = new JLabel();
    JLabel fantasmita2 = new JLabel();
    JLabel fantasmita3 = new JLabel();
    JLabel fantasmita4 = new JLabel();
    //Hilos del juego
    public static HiloTemporizador tareaTemporizador;
    public static Thread hT;

    public static HiloFantasmas tareaPastillas;
    public static Thread hF;
    //Vista
    public InterfazPacman jf;
    public static int noPastillas = 276;

    /**
     *
     * @param jf
     * @param pacmancito
     * @param fantasmita1
     * @param fantasmita2
     * @param fantasmita3
     * @param fantasmita4
     */
    public Pacman(InterfazPacman jf, JLabel pacmancito, JLabel fantasmita1, JLabel fantasmita2, JLabel fantasmita3, JLabel fantasmita4) {
        this.jf = jf;
        this.pacmancito = pacmancito;
        this.fantasmita1 = fantasmita1;
        this.fantasmita2 = fantasmita2;
        this.fantasmita3 = fantasmita3;
        this.fantasmita4 = fantasmita4;
        inicializaVentana();
    }

    /**
     *
     */
    public void inicializaVentana() {
        Manipula.posicionInicial(pacmancito, fantasmita1, fantasmita2, fantasmita3, fantasmita4);

        pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
        fantasmita1.setIcon(new ImageIcon(imagen15.getImage().getScaledInstance(fantasmita1.getWidth(), fantasmita1.getHeight(), 4)));
        fantasmita2.setIcon(new ImageIcon(imagen16.getImage().getScaledInstance(fantasmita2.getWidth(), fantasmita2.getHeight(), 4)));
        fantasmita3.setIcon(new ImageIcon(imagen17.getImage().getScaledInstance(fantasmita3.getWidth(), fantasmita3.getHeight(), 4)));
        fantasmita4.setIcon(new ImageIcon(imagen18.getImage().getScaledInstance(fantasmita4.getWidth(), fantasmita4.getHeight(), 4)));

        jf.getPnlLienzo().add(pacmancito);
        jf.getPnlLienzo().add(fantasmita1);
        jf.getPnlLienzo().add(fantasmita2);
        jf.getPnlLienzo().add(fantasmita3);
        jf.getPnlLienzo().add(fantasmita4);

        vidas = 3;
        puntaje = 0;
        direcPacman = 'D';

        Pacman.hiloI = new EsquivaJI(pacmancito, jf);
        Pacman.hiloD = new EsquivaJD(pacmancito, jf);
        Pacman.hiloA = new EsquivaJA(pacmancito, jf);
        Pacman.hiloB = new EsquivaJB(pacmancito, jf);

        Pacman.fantasma1 = new EsquivaJ(fantasmita1, jf, 5);
        Pacman.fantasma2 = new EsquivaJ(fantasmita2, jf, 6);
        Pacman.fantasma3 = new EsquivaJ(fantasmita3, jf, 7);
        Pacman.fantasma4 = new EsquivaJ(fantasmita4, jf, 8);

        jf.getLblPuntaje().setText("" + puntaje);
        jf.getLblVidas().setText(" " + vidas);

        jf.getBtnStop().setEnabled(false);
        jf.getBtnReinicio().setEnabled(false);
        jf.getBtnInicio().setEnabled(true);

    }

    /**
     *
     * @param btnInicio
     */
    public void accionBotonInicio(JButton btnInicio) {
        if (btnInicio.isEnabled()) {
            try {
                if (hiloI.getState() == Thread.State.TIMED_WAITING) {

                    hiloI.stop();
                    hiloB.join();
                } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {

                    hiloD.stop();
                    hiloB.join();
                } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {

                    hiloA.stop();
                    hiloB.join();
                } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {

                    hiloB.stop();
                    hiloB.join();
                }
            } catch (InterruptedException e) {
            }
            pacmancito.setBounds(pacmancito.getX(), pacmancito.getY(), 25, 25);

            jf.getLblVidas().setText(" " + vidas);
            jf.getLblPuntaje().setText("" + puntaje);

            tareaPastillas = new HiloFantasmas((jf.getBprogressPastilla().getValue() * 15 / 100), (JProgressBar) jf.getBprogressPastilla());
            tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);

            hF = new Thread(tareaPastillas);
            hT = new Thread(tareaTemporizador);

            switch (direcPacman) {
                case 'A':
                    pacmancito.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                    hiloA = new EsquivaJA(pacmancito, jf);
                    hiloA.start();
                    break;
                case 'B':
                    pacmancito.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                    hiloB = new EsquivaJB(pacmancito, jf);
                    hiloB.start();
                    break;
                case 'I':
                    pacmancito.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                    hiloI = new EsquivaJI(pacmancito, jf);
                    hiloI.start();
                    break;
                case 'D':
                    pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                    hiloD = new EsquivaJD(pacmancito, jf);
                    hiloD.start();
                    break;
                default:
                    pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                    hiloD = new EsquivaJD(pacmancito, jf);
                    hiloD.start();
                    break;
            }

            hT.start();

            if (jf.getBprogressPastilla().getValue() != 0) {
                hF.start();
                if (Pacman.fantasma1.estado == false) {
                    fantasma1 = new EsquivaJ(fantasmita1, jf, 5);
                    Pacman.fantasma1.estado = false;
                    Pacman.fantasma1.pintarEstado(false, Pacman.fantasma1.b);
                } else {
                    fantasma1 = new EsquivaJ(fantasmita1, jf, 5);
                }
                if (Pacman.fantasma2.estado == false) {
                    fantasma2 = new EsquivaJ(fantasmita2, jf, 6);
                    Pacman.fantasma2.estado = false;
                    Pacman.fantasma2.pintarEstado(false, Pacman.fantasma2.b);
                } else {
                    fantasma2 = new EsquivaJ(fantasmita2, jf, 6);
                }
                if (Pacman.fantasma3.estado == false) {
                    fantasma3 = new EsquivaJ(fantasmita3, jf, 7);
                    Pacman.fantasma3.estado = false;
                    Pacman.fantasma3.pintarEstado(false, Pacman.fantasma3.b);
                } else {
                    fantasma3 = new EsquivaJ(fantasmita3, jf, 7);
                }
                if (Pacman.fantasma4.estado == false) {
                    fantasma4 = new EsquivaJ(fantasmita4, jf, 8);
                    Pacman.fantasma4.estado = false;
                    Pacman.fantasma4.pintarEstado(false, Pacman.fantasma4.b);
                } else {
                    fantasma4 = new EsquivaJ(fantasmita4, jf, 8);
                }

            } else {
                fantasma1 = new EsquivaJ(fantasmita1, jf, 5);
                fantasma2 = new EsquivaJ(fantasmita2, jf, 6);
                fantasma3 = new EsquivaJ(fantasmita3, jf, 7);
                fantasma4 = new EsquivaJ(fantasmita4, jf, 8);

            }

            fantasma1.start();
            fantasma2.start();
            fantasma3.start();
            fantasma4.start();

            jf.getBarrera59().setVisible(false);
            jf.getBtnStop().setEnabled(true);
            jf.getBtnReinicio().setEnabled(true);
            jf.getBtnInicio().setEnabled(false);
        }
    }

    /**
     *
     */
    public void accionBotonStop() {

        if (jf.getBtnStop().isEnabled()) {
            pacmancito.setLocation(pacmancito.getLocation().x, pacmancito.getLocation().y);
            try {
                if (hiloI.getState() == Thread.State.TIMED_WAITING) {

                    hiloI.stop();
                    hiloB.join();
                } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {

                    hiloD.stop();
                    hiloB.join();
                } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {

                    hiloA.stop();
                    hiloB.join();
                } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {

                    hiloB.stop();
                    hiloB.join();
                }
            } catch (InterruptedException e) {
            }

            if (hT.getState() == Thread.State.TIMED_WAITING) {
                fantasma1.stop();
                fantasma2.stop();
                fantasma3.stop();
                fantasma4.stop();
                hT.stop();
            }
            if (hF.getState() == Thread.State.TIMED_WAITING) {
                hF.stop();
            }
            jf.getBtnInicio().setEnabled(true);
            jf.getBtnReinicio().setEnabled(true);
            jf.getBtnStop().setEnabled(false);
        }

    }

    /**
     *
     */
    public void accionBotonReinicio() {

        if (jf.getBtnReinicio().isEnabled()) {
            Manipula.posicionInicialPastillas(jf.getLblPastillaT1(), jf.getLblPastillaT2(), jf.getLblPastillaT3(), jf.getLblPastillaT4());

            try {
                if (hiloI.getState() == Thread.State.TIMED_WAITING) {

                    hiloI.stop();
                    hiloB.join();
                } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {

                    hiloD.stop();
                    hiloB.join();
                } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {

                    hiloA.stop();
                    hiloB.join();
                } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {

                    hiloB.stop();
                    hiloB.join();
                }
            } catch (InterruptedException e) {
            }

            if (hT.getState() == Thread.State.TIMED_WAITING) {
                fantasma1.stop();
                fantasma2.stop();
                fantasma3.stop();
                fantasma4.stop();
                hT.stop();

            }
            jf.getBprogress().setValue(0);

            if (hF.getState() == Thread.State.TIMED_WAITING) {
                hF.stop();
            }
            jf.getBprogressPastilla().setValue(0);

            Manipula.posicionInicial(pacmancito, fantasmita1, fantasmita2, fantasmita3, fantasmita4);
            pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
            fantasmita1.setIcon(new ImageIcon(imagen15.getImage().getScaledInstance(fantasmita1.getWidth(), fantasmita1.getHeight(), 4)));
            fantasmita2.setIcon(new ImageIcon(imagen16.getImage().getScaledInstance(fantasmita2.getWidth(), fantasmita2.getHeight(), 4)));
            fantasmita3.setIcon(new ImageIcon(imagen17.getImage().getScaledInstance(fantasmita3.getWidth(), fantasmita3.getHeight(), 4)));
            fantasmita4.setIcon(new ImageIcon(imagen18.getImage().getScaledInstance(fantasmita4.getWidth(), fantasmita4.getHeight(), 4)));

            vidas = 3;
            puntaje = 0;
            noPastillas = 276;
            direcPacman = 'D';

            jf.getLblVidas().setText("3");
            jf.getLblPuntaje().setText("0");
            Manipula.visualizaPatilla(jf);

            jf.getBarrera59().setVisible(true);
            jf.getBtnStop().setEnabled(false);
            jf.getBtnInicio().setEnabled(true);
            jf.getBtnReinicio().setEnabled(false);

        }

    }

    /**
     *
     */
    public void accionBotonDerecha() {

        if (!jf.getBtnInicio().isEnabled()) {
            direcPacman = 'D';
            if (hiloI.getState() == Thread.State.TIMED_WAITING) {
                hiloI.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloD = new EsquivaJD(pacmancito, jf)).start();
                hT.start();
            } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {
                hiloA.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloD = new EsquivaJD(pacmancito, jf)).start();
                hT.start();
            } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {
                hiloB.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloD = new EsquivaJD(pacmancito, jf)).start();
                hT.start();
            } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {
                hiloD.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloD = new EsquivaJD(pacmancito, jf)).start();
                hT.start();
            }
        }

    }

    /**
     *
     */
    public void accionBotonBajar() {
        if (!jf.getBtnInicio().isEnabled()) {
            direcPacman = 'B';
            if (hiloI.getState() == Thread.State.TIMED_WAITING) {
                hiloI.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloB = new EsquivaJB(pacmancito, jf)).start();
                hT.start();
            } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {
                hiloD.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloB = new EsquivaJB(pacmancito, jf)).start();
                hT.start();
            } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {
                hiloA.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloB = new EsquivaJB(pacmancito, jf)).start();
                hT.start();
            } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {
                hiloB.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloB = new EsquivaJB(pacmancito, jf)).start();
                hT.start();
            }
        }
    }

    /**
     *
     */
    public void accionBotonIzquierda() {
        if (!jf.getBtnInicio().isEnabled()) {
            direcPacman = 'I';
            if (hiloD.getState() == Thread.State.TIMED_WAITING) {
                hiloD.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloI = new EsquivaJI(pacmancito, jf)).start();
                hT.start();
            } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {
                hiloA.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloI = new EsquivaJI(pacmancito, jf)).start();
                hT.start();
            } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {
                hiloB.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloI = new EsquivaJI(pacmancito, jf)).start();
                hT.start();
            } else if (hiloI.getState() == Thread.State.TIMED_WAITING) {
                hiloI.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloI = new EsquivaJI(pacmancito, jf)).start();
                hT.start();
            }
        }
    }

    /**
     *
     */
    public void accionBotonSubir() {
        if (!jf.getBtnInicio().isEnabled()) {
            direcPacman = 'A';
            if (hiloI.getState() == Thread.State.TIMED_WAITING) {
                hiloI.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloA = new EsquivaJA(pacmancito, jf)).start();
                hT.start();
            } else if (hiloD.getState() == Thread.State.TIMED_WAITING) {
                hiloD.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloA = new EsquivaJA(pacmancito, jf)).start();
                hT.start();
            } else if (hiloB.getState() == Thread.State.TIMED_WAITING) {
                hiloB.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloA = new EsquivaJA(pacmancito, jf)).start();
                hT.start();
            } else if (hiloA.getState() == Thread.State.TIMED_WAITING) {
                hiloA.stop();
                hT.stop();

                tareaTemporizador = new HiloTemporizador(jf.getBprogress().getValue(), (JProgressBar) jf.getBprogress(), jf);
                hT = new Thread(tareaTemporizador);

                pacmancito.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(pacmancito.getWidth(), pacmancito.getHeight(), 4)));
                (hiloA = new EsquivaJA(pacmancito, jf)).start();
                hT.start();
            }
        }
    }

}
