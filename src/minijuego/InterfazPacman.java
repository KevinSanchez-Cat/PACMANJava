/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuego;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author kevin2
 */
public final class InterfazPacman extends javax.swing.JFrame {

    Pacman pc;
    public static Clip clipFondo;
    public static Clip clip;
    public boolean vSonido = true;
    public static String sonidoInicial = "pacmanSounds/pacman_beginning.wav";
    public static String comeCome = "pacmanSounds/pacman_chomp.wav";
    public static String muerte = "pacmanSounds/pacman_death.wav";
    public static String fantasmas = "pacmanSounds/pacman_eatghost.wav";
    public static String gana = "pacmanSounds/pacman_intermission.wav";

    /**
     * Creates new form InterfazPacman
     */
    public InterfazPacman() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        this.setIconImage(icono);
        initComponents();
        this.setLocationRelativeTo(null);
        pnlLienzo.setLayout(null);
        pc = new Pacman(this, getLblPacman(), getLblFantasmaRojo(), getLblFantasmaAzul(), getLblFnatasmaNaranja(), getLblFantasmaAmarillo());
        //Botones 
        getBtnInicio().setEnabled(true);
        getBtnReinicio().setEnabled(false);
        getBtnStop().setEnabled(false);
        reproduceInicial();
        //Se le agrega este metodo para que funcione correctamente los eventos
        getContentPane().setFocusable(true);
        //Agregar eventos para que funcione :3
        getContentPane().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            /*    if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.println("Holi");
                }else if(ke.getKeyCode()==KeyEvent.VK_SPACE){
                    System.out.println("Espacio");
                }
                */
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    }

    public void reproduceInicial() {
        try {
            sonidoFondo(sonidoInicial);
        } catch (Exception e) {
            Mensaje.error(this, "Ups ha ocurrido un error \n" + e.toString());
        }
    }

    public JPanel getBarrera1() {
        return barrera1;
    }

    public void setBarrera1(JPanel barrera1) {
        this.barrera1 = barrera1;
    }

    public JPanel getBarrera62() {
        return barrera62;
    }

    public void setBarrera62(JPanel barrera62) {
        this.barrera62 = barrera62;
    }

    public JPanel getBarrera63() {
        return barrera63;
    }

    public void setBarrera63(JPanel barrera63) {
        this.barrera63 = barrera63;
    }

    public JPanel getBarrera12() {
        return barrera12;
    }

    public void setBarrera12(JPanel barrera12) {
        this.barrera12 = barrera12;
    }

    public JPanel getBarrera13() {
        return barrera13;
    }

    public void setBarrera13(JPanel barrera13) {
        this.barrera13 = barrera13;
    }

    public JPanel getBarrera14() {
        return barrera14;
    }

    public void setBarrera14(JPanel barrera14) {
        this.barrera14 = barrera14;
    }

    public JPanel getBarrera15() {
        return barrera15;
    }

    public void setBarrera15(JPanel barrera15) {
        this.barrera15 = barrera15;
    }

    public JPanel getBarrera16() {
        return barrera16;
    }

    public void setBarrera16(JPanel barrera16) {
        this.barrera16 = barrera16;
    }

    public JPanel getBarrera17() {
        return barrera17;
    }

    public void setBarrera17(JPanel barrera17) {
        this.barrera17 = barrera17;
    }

    public JPanel getBarrera18() {
        return barrera18;
    }

    public void setBarrera18(JPanel barrera18) {
        this.barrera18 = barrera18;
    }

    public JPanel getBarrera19() {
        return barrera19;
    }

    public void setBarrera19(JPanel barrera19) {
        this.barrera19 = barrera19;
    }

    public JPanel getBarrera2() {
        return barrera2;
    }

    public void setBarrera2(JPanel barrera2) {
        this.barrera2 = barrera2;
    }

    public JPanel getBarrera20() {
        return barrera20;
    }

    public void setBarrera20(JPanel barrera20) {
        this.barrera20 = barrera20;
    }

    public JPanel getBarrera21() {
        return barrera21;
    }

    public void setBarrera21(JPanel barrera21) {
        this.barrera21 = barrera21;
    }

    public JPanel getBarrera22() {
        return barrera22;
    }

    public void setBarrera22(JPanel barrera22) {
        this.barrera22 = barrera22;
    }

    public JPanel getBarrera23() {
        return barrera23;
    }

    public void setBarrera23(JPanel barrera23) {
        this.barrera23 = barrera23;
    }

    public JPanel getBarrera24() {
        return barrera24;
    }

    public void setBarrera24(JPanel barrera24) {
        this.barrera24 = barrera24;
    }

    public JPanel getBarrera25() {
        return barrera25;
    }

    public void setBarrera25(JPanel barrera25) {
        this.barrera25 = barrera25;
    }

    public JPanel getBarrera26() {
        return barrera26;
    }

    public void setBarrera26(JPanel barrera26) {
        this.barrera26 = barrera26;
    }

    public JPanel getBarrera27() {
        return barrera27;
    }

    public void setBarrera27(JPanel barrera27) {
        this.barrera27 = barrera27;
    }

    public JPanel getBarrera28() {
        return barrera28;
    }

    public void setBarrera28(JPanel barrera28) {
        this.barrera28 = barrera28;
    }

    public JPanel getBarrera29() {
        return barrera29;
    }

    public void setBarrera29(JPanel barrera29) {
        this.barrera29 = barrera29;
    }

    public JPanel getBarrera30() {
        return barrera30;
    }

    public void setBarrera30(JPanel barrera30) {
        this.barrera30 = barrera30;
    }

    public JPanel getBarrera31() {
        return barrera31;
    }

    public void setBarrera31(JPanel barrera31) {
        this.barrera31 = barrera31;
    }

    public JPanel getBarrera32() {
        return barrera32;
    }

    public void setBarrera32(JPanel barrera32) {
        this.barrera32 = barrera32;
    }

    public JPanel getBarrera33() {
        return barrera33;
    }

    public void setBarrera33(JPanel barrera33) {
        this.barrera33 = barrera33;
    }

    public JPanel getBarrera34() {
        return barrera34;
    }

    public void setBarrera34(JPanel barrera34) {
        this.barrera34 = barrera34;
    }

    public JPanel getBarrera35() {
        return barrera35;
    }

    public void setBarrera35(JPanel barrera35) {
        this.barrera35 = barrera35;
    }

    public JPanel getBarrera36() {
        return barrera36;
    }

    public void setBarrera36(JPanel barrera36) {
        this.barrera36 = barrera36;
    }

    public JPanel getBarrera37() {
        return barrera37;
    }

    public void setBarrera37(JPanel barrera37) {
        this.barrera37 = barrera37;
    }

    public JPanel getBarrera38() {
        return barrera38;
    }

    public void setBarrera38(JPanel barrera38) {
        this.barrera38 = barrera38;
    }

    public JPanel getBarrera39() {
        return barrera39;
    }

    public void setBarrera39(JPanel barrera39) {
        this.barrera39 = barrera39;
    }

    public JPanel getBarrera4() {
        return barrera4;
    }

    public void setBarrera4(JPanel barrera4) {
        this.barrera4 = barrera4;
    }

    public JPanel getBarrera40() {
        return barrera40;
    }

    public void setBarrera40(JPanel barrera40) {
        this.barrera40 = barrera40;
    }

    public JPanel getBarrera41() {
        return barrera41;
    }

    public void setBarrera41(JPanel barrera41) {
        this.barrera41 = barrera41;
    }

    public JLabel getLblPastilla248() {
        return lblPastilla248;
    }

    public void setLblPastilla248(JLabel lblPastilla248) {
        this.lblPastilla248 = lblPastilla248;
    }

    public JPanel getBarrera43() {
        return barrera43;
    }

    public void setBarrera43(JPanel barrera43) {
        this.barrera43 = barrera43;
    }

    public JPanel getBarrera44() {
        return barrera44;
    }

    public void setBarrera44(JPanel barrera44) {
        this.barrera44 = barrera44;
    }

    public JPanel getBarrera45() {
        return barrera45;
    }

    public void setBarrera45(JPanel barrera45) {
        this.barrera45 = barrera45;
    }

    public JPanel getBarrera46() {
        return barrera46;
    }

    public void setBarrera46(JPanel barrera46) {
        this.barrera46 = barrera46;
    }

    public JPanel getBarrera47() {
        return barrera47;
    }

    public void setBarrera47(JPanel barrera47) {
        this.barrera47 = barrera47;
    }

    public JPanel getBarrera48() {
        return barrera48;
    }

    public void setBarrera48(JPanel barrera48) {
        this.barrera48 = barrera48;
    }

    public JPanel getBarrera49() {
        return barrera49;
    }

    public void setBarrera49(JPanel barrera49) {
        this.barrera49 = barrera49;
    }

    public JPanel getBarrera5() {
        return barrera5;
    }

    public void setBarrera5(JPanel barrera5) {
        this.barrera5 = barrera5;
    }

    public JPanel getBarrera50() {
        return barrera50;
    }

    public void setBarrera50(JPanel barrera50) {
        this.barrera50 = barrera50;
    }

    public JPanel getBarrera51() {
        return barrera51;
    }

    public void setBarrera51(JPanel barrera51) {
        this.barrera51 = barrera51;
    }

    public JPanel getBarrera52() {
        return barrera52;
    }

    public void setBarrera52(JPanel barrera52) {
        this.barrera52 = barrera52;
    }

    public JPanel getBarrera53() {
        return barrera53;
    }

    public void setBarrera53(JPanel barrera53) {
        this.barrera53 = barrera53;
    }

    public JPanel getBarrera54() {
        return barrera54;
    }

    public void setBarrera54(JPanel barrera54) {
        this.barrera54 = barrera54;
    }

    public JPanel getBarrera55() {
        return barrera55;
    }

    public void setBarrera55(JPanel barrera55) {
        this.barrera55 = barrera55;
    }

    public JPanel getBarrera56() {
        return barrera56;
    }

    public void setBarrera56(JPanel barrera56) {
        this.barrera56 = barrera56;
    }

    public JPanel getBarrera57() {
        return barrera57;
    }

    public void setBarrera57(JPanel barrera57) {
        this.barrera57 = barrera57;
    }

    public JPanel getBarrera58() {
        return barrera58;
    }

    public void setBarrera58(JPanel barrera58) {
        this.barrera58 = barrera58;
    }

    public JPanel getBarrera59() {
        return barrera59;
    }

    public void setBarrera59(JPanel barrera59) {
        this.barrera59 = barrera59;
    }

    public JPanel getBarrera6() {
        return barrera6;
    }

    public void setBarrera6(JPanel barrera6) {
        this.barrera6 = barrera6;
    }

    public JPanel getBarrera7() {
        return barrera7;
    }

    public void setBarrera7(JPanel barrera7) {
        this.barrera7 = barrera7;
    }

    public JPanel getBarrera8() {
        return barrera8;
    }

    public void setBarrera8(JPanel barrera8) {
        this.barrera8 = barrera8;
    }

    public JPanel getBarrera9() {
        return barrera9;
    }

    public void setBarrera9(JPanel barrera9) {
        this.barrera9 = barrera9;
    }

    public JLabel getLblPuntaje() {
        return lblPuntaje;
    }

    public void setLblPuntaje(JLabel lblPuntaje) {
        this.lblPuntaje = lblPuntaje;
    }

    public JLabel getLblVidas() {
        return lblVidas;
    }

    public void setLblVidas(JLabel lblVidas) {
        this.lblVidas = lblVidas;
    }

    public JProgressBar getBprogress() {
        return bprogress;
    }

    public void setBprogress(JProgressBar bprogress) {
        this.bprogress = bprogress;
    }

    public JProgressBar getBprogressPastilla() {
        return bprogressPastilla;
    }

    public JLabel getLblFantasmaAmarillo() {
        return lblFantasmaAmarillo;
    }

    public void setLblFantasmaAmarillo(JLabel lblFantasmaAmarillo) {
        this.lblFantasmaAmarillo = lblFantasmaAmarillo;
    }

    public JLabel getLblFantasmaAzul() {
        return lblFantasmaAzul;
    }

    public void setLblFantasmaAzul(JLabel lblFantasmaAzul) {
        this.lblFantasmaAzul = lblFantasmaAzul;
    }

    public JLabel getLblFantasmaRojo() {
        return lblFantasmaRojo;
    }

    public void setLblFantasmaRojo(JLabel lblFantasmaRojo) {
        this.lblFantasmaRojo = lblFantasmaRojo;
    }

    public JLabel getLblFnatasmaNaranja() {
        return lblFnatasmaNaranja;
    }

    public void setLblFnatasmaNaranja(JLabel lblFnatasmaNaranja) {
        this.lblFnatasmaNaranja = lblFnatasmaNaranja;
    }

    public JLabel getLblPacman() {
        return lblPacman;
    }

    public void setLblPacman(JLabel lblPacman) {
        this.lblPacman = lblPacman;
    }

    public JPanel getBarrera60() {
        return barrera60;
    }

    public void setBarrera60(JPanel barrera60) {
        this.barrera60 = barrera60;
    }

    public JButton getBtnInicio() {
        return btnInicio;
    }

    public void setBtnInicio(JButton btnInicio) {
        this.btnInicio = btnInicio;
    }

    public JButton getBtnReinicio() {
        return btnReinicio;
    }

    public void setBtnReinicio(JButton btnReinicio) {
        this.btnReinicio = btnReinicio;
    }

    public JButton getBtnStop() {
        return btnStop;
    }

    public void setBtnStop(JButton btnStop) {
        this.btnStop = btnStop;
    }

    public JPanel getBarrera61() {
        return barrera61;
    }

    public void setBarrera61(JPanel barrera61) {
        this.barrera61 = barrera61;
    }

    public JLabel getLblPastilla126() {
        return lblPastilla126;
    }

    public void setLblPastilla126(JLabel lblPastilla126) {
        this.lblPastilla126 = lblPastilla126;
    }

    public JLabel getLblPastilla127() {
        return lblPastilla127;
    }

    public void setLblPastilla127(JLabel lblPastilla127) {
        this.lblPastilla127 = lblPastilla127;
    }

    public JLabel getLblPastilla135() {
        return lblPastilla135;
    }

    public void setLblPastilla135(JLabel lblPastilla135) {
        this.lblPastilla135 = lblPastilla135;
    }

    public JLabel getLblPastilla63() {
        return lblPastilla63;
    }

    public void setLblPastilla63(JLabel lblPastilla63) {
        this.lblPastilla63 = lblPastilla63;
    }

    public JLabel getLblPastilla64() {
        return lblPastilla64;
    }

    public void setLblPastilla64(JLabel lblPastilla64) {
        this.lblPastilla64 = lblPastilla64;
    }

    public JLabel getLblPastilla100() {
        return lblPastilla100;
    }

    public void setLblPastilla100(JLabel lblPastilla100) {
        this.lblPastilla100 = lblPastilla100;
    }

    public JLabel getLblPastilla101() {
        return lblPastilla101;
    }

    public void setLblPastilla101(JLabel lblPastilla101) {
        this.lblPastilla101 = lblPastilla101;
    }

    public JLabel getLblPastilla102() {
        return lblPastilla102;
    }

    public void setLblPastilla102(JLabel lblPastilla102) {
        this.lblPastilla102 = lblPastilla102;
    }

    public JLabel getLblPastilla103() {
        return lblPastilla103;
    }

    public void setLblPastilla103(JLabel lblPastilla103) {
        this.lblPastilla103 = lblPastilla103;
    }

    public JLabel getLblPastilla104() {
        return lblPastilla104;
    }

    public void setLblPastilla104(JLabel lblPastilla104) {
        this.lblPastilla104 = lblPastilla104;
    }

    public JLabel getLblPastilla105() {
        return lblPastilla105;
    }

    public void setLblPastilla105(JLabel lblPastilla105) {
        this.lblPastilla105 = lblPastilla105;
    }

    public JLabel getLblPastilla106() {
        return lblPastilla106;
    }

    public void setLblPastilla106(JLabel lblPastilla106) {
        this.lblPastilla106 = lblPastilla106;
    }

    public JLabel getLblPastilla107() {
        return lblPastilla107;
    }

    public void setLblPastilla107(JLabel lblPastilla107) {
        this.lblPastilla107 = lblPastilla107;
    }

    public JLabel getLblPastilla108() {
        return lblPastilla108;
    }

    public void setLblPastilla108(JLabel lblPastilla108) {
        this.lblPastilla108 = lblPastilla108;
    }

    public JLabel getLblPastilla109() {
        return lblPastilla109;
    }

    public void setLblPastilla109(JLabel lblPastilla109) {
        this.lblPastilla109 = lblPastilla109;
    }

    public JLabel getLblPastilla110() {
        return lblPastilla110;
    }

    public void setLblPastilla110(JLabel lblPastilla110) {
        this.lblPastilla110 = lblPastilla110;
    }

    public JLabel getLblPastilla111() {
        return lblPastilla111;
    }

    public void setLblPastilla111(JLabel lblPastilla111) {
        this.lblPastilla111 = lblPastilla111;
    }

    public JLabel getLblPastilla112() {
        return lblPastilla112;
    }

    public void setLblPastilla112(JLabel lblPastilla112) {
        this.lblPastilla112 = lblPastilla112;
    }

    public JLabel getLblPastilla113() {
        return lblPastilla113;
    }

    public void setLblPastilla113(JLabel lblPastilla113) {
        this.lblPastilla113 = lblPastilla113;
    }

    public JLabel getLblPastilla114() {
        return lblPastilla114;
    }

    public void setLblPastilla114(JLabel lblPastilla114) {
        this.lblPastilla114 = lblPastilla114;
    }

    public JLabel getLblPastilla115() {
        return lblPastilla115;
    }

    public void setLblPastilla115(JLabel lblPastilla115) {
        this.lblPastilla115 = lblPastilla115;
    }

    public JLabel getLblPastilla116() {
        return lblPastilla116;
    }

    public void setLblPastilla116(JLabel lblPastilla116) {
        this.lblPastilla116 = lblPastilla116;
    }

    public JLabel getLblPastilla117() {
        return lblPastilla117;
    }

    public void setLblPastilla117(JLabel lblPastilla117) {
        this.lblPastilla117 = lblPastilla117;
    }

    public JLabel getLblPastilla118() {
        return lblPastilla118;
    }

    public void setLblPastilla118(JLabel lblPastilla118) {
        this.lblPastilla118 = lblPastilla118;
    }

    public JLabel getLblPastilla119() {
        return lblPastilla119;
    }

    public void setLblPastilla119(JLabel lblPastilla119) {
        this.lblPastilla119 = lblPastilla119;
    }

    public JLabel getLblPastilla120() {
        return lblPastilla120;
    }

    public void setLblPastilla120(JLabel lblPastilla120) {
        this.lblPastilla120 = lblPastilla120;
    }

    public JLabel getLblPastilla121() {
        return lblPastilla121;
    }

    public void setLblPastilla121(JLabel lblPastilla121) {
        this.lblPastilla121 = lblPastilla121;
    }

    public JLabel getLblPastilla122() {
        return lblPastilla122;
    }

    public void setLblPastilla122(JLabel lblPastilla122) {
        this.lblPastilla122 = lblPastilla122;
    }

    public JLabel getLblPastilla123() {
        return lblPastilla123;
    }

    public void setLblPastilla123(JLabel lblPastilla123) {
        this.lblPastilla123 = lblPastilla123;
    }

    public JLabel getLblPastilla124() {
        return lblPastilla124;
    }

    public void setLblPastilla124(JLabel lblPastilla124) {
        this.lblPastilla124 = lblPastilla124;
    }

    public JLabel getLblPastilla125() {
        return lblPastilla125;
    }

    public void setLblPastilla125(JLabel lblPastilla125) {
        this.lblPastilla125 = lblPastilla125;
    }

    public JLabel getLblPastilla128() {
        return lblPastilla128;
    }

    public void setLblPastilla128(JLabel lblPastilla128) {
        this.lblPastilla128 = lblPastilla128;
    }

    public JLabel getLblPastilla129() {
        return lblPastilla129;
    }

    public void setLblPastilla129(JLabel lblPastilla129) {
        this.lblPastilla129 = lblPastilla129;
    }

    public JLabel getLblPastilla130() {
        return lblPastilla130;
    }

    public void setLblPastilla130(JLabel lblPastilla130) {
        this.lblPastilla130 = lblPastilla130;
    }

    public JLabel getLblPastilla131() {
        return lblPastilla131;
    }

    public void setLblPastilla131(JLabel lblPastilla131) {
        this.lblPastilla131 = lblPastilla131;
    }

    public JLabel getLblPastilla132() {
        return lblPastilla132;
    }

    public void setLblPastilla132(JLabel lblPastilla132) {
        this.lblPastilla132 = lblPastilla132;
    }

    public JLabel getLblPastilla133() {
        return lblPastilla133;
    }

    public void setLblPastilla133(JLabel lblPastilla133) {
        this.lblPastilla133 = lblPastilla133;
    }

    public JLabel getLblPastilla134() {
        return lblPastilla134;
    }

    public void setLblPastilla134(JLabel lblPastilla134) {
        this.lblPastilla134 = lblPastilla134;
    }

    public JLabel getLblPastilla136() {
        return lblPastilla136;
    }

    public void setLblPastilla136(JLabel lblPastilla136) {
        this.lblPastilla136 = lblPastilla136;
    }

    public JLabel getLblPastilla137() {
        return lblPastilla137;
    }

    public void setLblPastilla137(JLabel lblPastilla137) {
        this.lblPastilla137 = lblPastilla137;
    }

    public JLabel getLblPastilla138() {
        return lblPastilla138;
    }

    public void setLblPastilla138(JLabel lblPastilla138) {
        this.lblPastilla138 = lblPastilla138;
    }

    public JLabel getLblPastilla139() {
        return lblPastilla139;
    }

    public void setLblPastilla139(JLabel lblPastilla139) {
        this.lblPastilla139 = lblPastilla139;
    }

    public JLabel getLblPastilla14() {
        return lblPastilla14;
    }

    public void setLblPastilla14(JLabel lblPastilla14) {
        this.lblPastilla14 = lblPastilla14;
    }

    public JLabel getLblPastilla140() {
        return lblPastilla140;
    }

    public void setLblPastilla140(JLabel lblPastilla140) {
        this.lblPastilla140 = lblPastilla140;
    }

    public JLabel getLblPastilla141() {
        return lblPastilla141;
    }

    public void setLblPastilla141(JLabel lblPastilla141) {
        this.lblPastilla141 = lblPastilla141;
    }

    public JLabel getLblPastilla142() {
        return lblPastilla142;
    }

    public void setLblPastilla142(JLabel lblPastilla142) {
        this.lblPastilla142 = lblPastilla142;
    }

    public JLabel getLblPastilla143() {
        return lblPastilla143;
    }

    public void setLblPastilla143(JLabel lblPastilla143) {
        this.lblPastilla143 = lblPastilla143;
    }

    public JLabel getLblPastilla144() {
        return lblPastilla144;
    }

    public void setLblPastilla144(JLabel lblPastilla144) {
        this.lblPastilla144 = lblPastilla144;
    }

    public JLabel getLblPastilla145() {
        return lblPastilla145;
    }

    public void setLblPastilla145(JLabel lblPastilla145) {
        this.lblPastilla145 = lblPastilla145;
    }

    public JLabel getLblPastilla146() {
        return lblPastilla146;
    }

    public void setLblPastilla146(JLabel lblPastilla146) {
        this.lblPastilla146 = lblPastilla146;
    }

    public JLabel getLblPastilla147() {
        return lblPastilla147;
    }

    public void setLblPastilla147(JLabel lblPastilla147) {
        this.lblPastilla147 = lblPastilla147;
    }

    public JLabel getLblPastilla148() {
        return lblPastilla148;
    }

    public void setLblPastilla148(JLabel lblPastilla148) {
        this.lblPastilla148 = lblPastilla148;
    }

    public JLabel getLblPastilla149() {
        return lblPastilla149;
    }

    public void setLblPastilla149(JLabel lblPastilla149) {
        this.lblPastilla149 = lblPastilla149;
    }

    public JLabel getLblPastilla15() {
        return lblPastilla15;
    }

    public void setLblPastilla15(JLabel lblPastilla15) {
        this.lblPastilla15 = lblPastilla15;
    }

    public JLabel getLblPastilla150() {
        return lblPastilla150;
    }

    public void setLblPastilla150(JLabel lblPastilla150) {
        this.lblPastilla150 = lblPastilla150;
    }

    public JLabel getLblPastilla151() {
        return lblPastilla151;
    }

    public void setLblPastilla151(JLabel lblPastilla151) {
        this.lblPastilla151 = lblPastilla151;
    }

    public JLabel getLblPastilla152() {
        return lblPastilla152;
    }

    public void setLblPastilla152(JLabel lblPastilla152) {
        this.lblPastilla152 = lblPastilla152;
    }

    public JLabel getLblPastilla153() {
        return lblPastilla153;
    }

    public void setLblPastilla153(JLabel lblPastilla153) {
        this.lblPastilla153 = lblPastilla153;
    }

    public JLabel getLblPastilla154() {
        return lblPastilla154;
    }

    public void setLblPastilla154(JLabel lblPastilla154) {
        this.lblPastilla154 = lblPastilla154;
    }

    public JLabel getLblPastilla155() {
        return lblPastilla155;
    }

    public void setLblPastilla155(JLabel lblPastilla155) {
        this.lblPastilla155 = lblPastilla155;
    }

    public JLabel getLblPastilla156() {
        return lblPastilla156;
    }

    public void setLblPastilla156(JLabel lblPastilla156) {
        this.lblPastilla156 = lblPastilla156;
    }

    public JLabel getLblPastilla157() {
        return lblPastilla157;
    }

    public void setLblPastilla157(JLabel lblPastilla157) {
        this.lblPastilla157 = lblPastilla157;
    }

    public JLabel getLblPastilla158() {
        return lblPastilla158;
    }

    public void setLblPastilla158(JLabel lblPastilla158) {
        this.lblPastilla158 = lblPastilla158;
    }

    public JLabel getLblPastilla159() {
        return lblPastilla159;
    }

    public void setLblPastilla159(JLabel lblPastilla159) {
        this.lblPastilla159 = lblPastilla159;
    }

    public JLabel getLblPastilla16() {
        return lblPastilla16;
    }

    public void setLblPastilla16(JLabel lblPastilla16) {
        this.lblPastilla16 = lblPastilla16;
    }

    public JLabel getLblPastilla160() {
        return lblPastilla160;
    }

    public void setLblPastilla160(JLabel lblPastilla160) {
        this.lblPastilla160 = lblPastilla160;
    }

    public JLabel getLblPastilla161() {
        return lblPastilla161;
    }

    public void setLblPastilla161(JLabel lblPastilla161) {
        this.lblPastilla161 = lblPastilla161;
    }

    public JLabel getLblPastilla162() {
        return lblPastilla162;
    }

    public void setLblPastilla162(JLabel lblPastilla162) {
        this.lblPastilla162 = lblPastilla162;
    }

    public JLabel getLblPastilla163() {
        return lblPastilla163;
    }

    public void setLblPastilla163(JLabel lblPastilla163) {
        this.lblPastilla163 = lblPastilla163;
    }

    public JLabel getLblPastilla164() {
        return lblPastilla164;
    }

    public void setLblPastilla164(JLabel lblPastilla164) {
        this.lblPastilla164 = lblPastilla164;
    }

    public JLabel getLblPastilla165() {
        return lblPastilla165;
    }

    public void setLblPastilla165(JLabel lblPastilla165) {
        this.lblPastilla165 = lblPastilla165;
    }

    public JLabel getLblPastilla166() {
        return lblPastilla166;
    }

    public void setLblPastilla166(JLabel lblPastilla166) {
        this.lblPastilla166 = lblPastilla166;
    }

    public JLabel getLblPastilla167() {
        return lblPastilla167;
    }

    public void setLblPastilla167(JLabel lblPastilla167) {
        this.lblPastilla167 = lblPastilla167;
    }

    public JLabel getLblPastilla168() {
        return lblPastilla168;
    }

    public void setLblPastilla168(JLabel lblPastilla168) {
        this.lblPastilla168 = lblPastilla168;
    }

    public JLabel getLblPastilla169() {
        return lblPastilla169;
    }

    public void setLblPastilla169(JLabel lblPastilla169) {
        this.lblPastilla169 = lblPastilla169;
    }

    public JLabel getLblPastilla17() {
        return lblPastilla17;
    }

    public void setLblPastilla17(JLabel lblPastilla17) {
        this.lblPastilla17 = lblPastilla17;
    }

    public JLabel getLblPastilla170() {
        return lblPastilla170;
    }

    public void setLblPastilla170(JLabel lblPastilla170) {
        this.lblPastilla170 = lblPastilla170;
    }

    public JLabel getLblPastilla171() {
        return lblPastilla171;
    }

    public void setLblPastilla171(JLabel lblPastilla171) {
        this.lblPastilla171 = lblPastilla171;
    }

    public JLabel getLblPastilla172() {
        return lblPastilla172;
    }

    public void setLblPastilla172(JLabel lblPastilla172) {
        this.lblPastilla172 = lblPastilla172;
    }

    public JLabel getLblPastilla173() {
        return lblPastilla173;
    }

    public void setLblPastilla173(JLabel lblPastilla173) {
        this.lblPastilla173 = lblPastilla173;
    }

    public JLabel getLblPastilla174() {
        return lblPastilla174;
    }

    public void setLblPastilla174(JLabel lblPastilla174) {
        this.lblPastilla174 = lblPastilla174;
    }

    public JLabel getLblPastilla175() {
        return lblPastilla175;
    }

    public void setLblPastilla175(JLabel lblPastilla175) {
        this.lblPastilla175 = lblPastilla175;
    }

    public JLabel getLblPastilla176() {
        return lblPastilla176;
    }

    public void setLblPastilla176(JLabel lblPastilla176) {
        this.lblPastilla176 = lblPastilla176;
    }

    public JLabel getLblPastilla177() {
        return lblPastilla177;
    }

    public void setLblPastilla177(JLabel lblPastilla177) {
        this.lblPastilla177 = lblPastilla177;
    }

    public JLabel getLblPastilla178() {
        return lblPastilla178;
    }

    public void setLblPastilla178(JLabel lblPastilla178) {
        this.lblPastilla178 = lblPastilla178;
    }

    public JLabel getLblPastilla179() {
        return lblPastilla179;
    }

    public void setLblPastilla179(JLabel lblPastilla179) {
        this.lblPastilla179 = lblPastilla179;
    }

    public JLabel getLblPastilla18() {
        return lblPastilla18;
    }

    public void setLblPastilla18(JLabel lblPastilla18) {
        this.lblPastilla18 = lblPastilla18;
    }

    public JLabel getLblPastilla180() {
        return lblPastilla180;
    }

    public void setLblPastilla180(JLabel lblPastilla180) {
        this.lblPastilla180 = lblPastilla180;
    }

    public JLabel getLblPastilla181() {
        return lblPastilla181;
    }

    public void setLblPastilla181(JLabel lblPastilla181) {
        this.lblPastilla181 = lblPastilla181;
    }

    public JLabel getLblPastilla182() {
        return lblPastilla182;
    }

    public void setLblPastilla182(JLabel lblPastilla182) {
        this.lblPastilla182 = lblPastilla182;
    }

    public JLabel getLblPastilla183() {
        return lblPastilla183;
    }

    public void setLblPastilla183(JLabel lblPastilla183) {
        this.lblPastilla183 = lblPastilla183;
    }

    public JLabel getLblPastilla184() {
        return lblPastilla184;
    }

    public void setLblPastilla184(JLabel lblPastilla184) {
        this.lblPastilla184 = lblPastilla184;
    }

    public JLabel getLblPastilla185() {
        return lblPastilla185;
    }

    public void setLblPastilla185(JLabel lblPastilla185) {
        this.lblPastilla185 = lblPastilla185;
    }

    public JLabel getLblPastilla186() {
        return lblPastilla186;
    }

    public void setLblPastilla186(JLabel lblPastilla186) {
        this.lblPastilla186 = lblPastilla186;
    }

    public JLabel getLblPastilla187() {
        return lblPastilla187;
    }

    public void setLblPastilla187(JLabel lblPastilla187) {
        this.lblPastilla187 = lblPastilla187;
    }

    public JLabel getLblPastilla188() {
        return lblPastilla188;
    }

    public void setLblPastilla188(JLabel lblPastilla188) {
        this.lblPastilla188 = lblPastilla188;
    }

    public JLabel getLblPastilla189() {
        return lblPastilla189;
    }

    public void setLblPastilla189(JLabel lblPastilla189) {
        this.lblPastilla189 = lblPastilla189;
    }

    public JLabel getLblPastilla19() {
        return lblPastilla19;
    }

    public void setLblPastilla19(JLabel lblPastilla19) {
        this.lblPastilla19 = lblPastilla19;
    }

    public JLabel getLblPastilla190() {
        return lblPastilla190;
    }

    public void setLblPastilla190(JLabel lblPastilla190) {
        this.lblPastilla190 = lblPastilla190;
    }

    public JLabel getLblPastilla191() {
        return lblPastilla191;
    }

    public void setLblPastilla191(JLabel lblPastilla191) {
        this.lblPastilla191 = lblPastilla191;
    }

    public JLabel getLblPastilla192() {
        return lblPastilla192;
    }

    public void setLblPastilla192(JLabel lblPastilla192) {
        this.lblPastilla192 = lblPastilla192;
    }

    public JLabel getLblPastilla193() {
        return lblPastilla193;
    }

    public void setLblPastilla193(JLabel lblPastilla193) {
        this.lblPastilla193 = lblPastilla193;
    }

    public JLabel getLblPastilla194() {
        return lblPastilla194;
    }

    public void setLblPastilla194(JLabel lblPastilla194) {
        this.lblPastilla194 = lblPastilla194;
    }

    public JLabel getLblPastilla195() {
        return lblPastilla195;
    }

    public void setLblPastilla195(JLabel lblPastilla195) {
        this.lblPastilla195 = lblPastilla195;
    }

    public JLabel getLblPastilla196() {
        return lblPastilla196;
    }

    public void setLblPastilla196(JLabel lblPastilla196) {
        this.lblPastilla196 = lblPastilla196;
    }

    public JLabel getLblPastilla197() {
        return lblPastilla197;
    }

    public void setLblPastilla197(JLabel lblPastilla197) {
        this.lblPastilla197 = lblPastilla197;
    }

    public JLabel getLblPastilla198() {
        return lblPastilla198;
    }

    public void setLblPastilla198(JLabel lblPastilla198) {
        this.lblPastilla198 = lblPastilla198;
    }

    public JLabel getLblPastilla199() {
        return lblPastilla199;
    }

    public void setLblPastilla199(JLabel lblPastilla199) {
        this.lblPastilla199 = lblPastilla199;
    }

    public JLabel getLblPastilla2() {
        return lblPastilla2;
    }

    public void setLblPastilla2(JLabel lblPastilla2) {
        this.lblPastilla2 = lblPastilla2;
    }

    public JLabel getLblPastilla20() {
        return lblPastilla20;
    }

    public void setLblPastilla20(JLabel lblPastilla20) {
        this.lblPastilla20 = lblPastilla20;
    }

    public JLabel getLblPastilla200() {
        return lblPastilla200;
    }

    public void setLblPastilla200(JLabel lblPastilla200) {
        this.lblPastilla200 = lblPastilla200;
    }

    public JLabel getLblPastilla201() {
        return lblPastilla201;
    }

    public void setLblPastilla201(JLabel lblPastilla201) {
        this.lblPastilla201 = lblPastilla201;
    }

    public JLabel getLblPastilla202() {
        return lblPastilla202;
    }

    public void setLblPastilla202(JLabel lblPastilla202) {
        this.lblPastilla202 = lblPastilla202;
    }

    public JLabel getLblPastilla203() {
        return lblPastilla203;
    }

    public void setLblPastilla203(JLabel lblPastilla203) {
        this.lblPastilla203 = lblPastilla203;
    }

    public JLabel getLblPastilla204() {
        return lblPastilla204;
    }

    public void setLblPastilla204(JLabel lblPastilla204) {
        this.lblPastilla204 = lblPastilla204;
    }

    public JLabel getLblPastilla205() {
        return lblPastilla205;
    }

    public void setLblPastilla205(JLabel lblPastilla205) {
        this.lblPastilla205 = lblPastilla205;
    }

    public JLabel getLblPastilla206() {
        return lblPastilla206;
    }

    public void setLblPastilla206(JLabel lblPastilla206) {
        this.lblPastilla206 = lblPastilla206;
    }

    public JLabel getLblPastilla207() {
        return lblPastilla207;
    }

    public void setLblPastilla207(JLabel lblPastilla207) {
        this.lblPastilla207 = lblPastilla207;
    }

    public JLabel getLblPastilla208() {
        return lblPastilla208;
    }

    public void setLblPastilla208(JLabel lblPastilla208) {
        this.lblPastilla208 = lblPastilla208;
    }

    public JLabel getLblPastilla209() {
        return lblPastilla209;
    }

    public void setLblPastilla209(JLabel lblPastilla209) {
        this.lblPastilla209 = lblPastilla209;
    }

    public JLabel getLblPastilla21() {
        return lblPastilla21;
    }

    public void setLblPastilla21(JLabel lblPastilla21) {
        this.lblPastilla21 = lblPastilla21;
    }

    public JLabel getLblPastilla210() {
        return lblPastilla210;
    }

    public void setLblPastilla210(JLabel lblPastilla210) {
        this.lblPastilla210 = lblPastilla210;
    }

    public JLabel getLblPastilla211() {
        return lblPastilla211;
    }

    public void setLblPastilla211(JLabel lblPastilla211) {
        this.lblPastilla211 = lblPastilla211;
    }

    public JLabel getLblPastilla212() {
        return lblPastilla212;
    }

    public void setLblPastilla212(JLabel lblPastilla212) {
        this.lblPastilla212 = lblPastilla212;
    }

    public JLabel getLblPastilla213() {
        return lblPastilla213;
    }

    public void setLblPastilla213(JLabel lblPastilla213) {
        this.lblPastilla213 = lblPastilla213;
    }

    public JLabel getLblPastilla214() {
        return lblPastilla214;
    }

    public void setLblPastilla214(JLabel lblPastilla214) {
        this.lblPastilla214 = lblPastilla214;
    }

    public JLabel getLblPastilla215() {
        return lblPastilla215;
    }

    public void setLblPastilla215(JLabel lblPastilla215) {
        this.lblPastilla215 = lblPastilla215;
    }

    public JLabel getLblPastilla216() {
        return lblPastilla216;
    }

    public void setLblPastilla216(JLabel lblPastilla216) {
        this.lblPastilla216 = lblPastilla216;
    }

    public JLabel getLblPastilla217() {
        return lblPastilla217;
    }

    public void setLblPastilla217(JLabel lblPastilla217) {
        this.lblPastilla217 = lblPastilla217;
    }

    public JLabel getLblPastilla218() {
        return lblPastilla218;
    }

    public void setLblPastilla218(JLabel lblPastilla218) {
        this.lblPastilla218 = lblPastilla218;
    }

    public JLabel getLblPastilla219() {
        return lblPastilla219;
    }

    public void setLblPastilla219(JLabel lblPastilla219) {
        this.lblPastilla219 = lblPastilla219;
    }

    public JLabel getLblPastilla22() {
        return lblPastilla22;
    }

    public void setLblPastilla22(JLabel lblPastilla22) {
        this.lblPastilla22 = lblPastilla22;
    }

    public JLabel getLblPastilla220() {
        return lblPastilla220;
    }

    public void setLblPastilla220(JLabel lblPastilla220) {
        this.lblPastilla220 = lblPastilla220;
    }

    public JLabel getLblPastilla221() {
        return lblPastilla221;
    }

    public void setLblPastilla221(JLabel lblPastilla221) {
        this.lblPastilla221 = lblPastilla221;
    }

    public JLabel getLblPastilla222() {
        return lblPastilla222;
    }

    public void setLblPastilla222(JLabel lblPastilla222) {
        this.lblPastilla222 = lblPastilla222;
    }

    public JLabel getLblPastilla223() {
        return lblPastilla223;
    }

    public void setLblPastilla223(JLabel lblPastilla223) {
        this.lblPastilla223 = lblPastilla223;
    }

    public JLabel getLblPastilla224() {
        return lblPastilla224;
    }

    public void setLblPastilla224(JLabel lblPastilla224) {
        this.lblPastilla224 = lblPastilla224;
    }

    public JLabel getLblPastilla225() {
        return lblPastilla225;
    }

    public void setLblPastilla225(JLabel lblPastilla225) {
        this.lblPastilla225 = lblPastilla225;
    }

    public JLabel getLblPastilla226() {
        return lblPastilla226;
    }

    public void setLblPastilla226(JLabel lblPastilla226) {
        this.lblPastilla226 = lblPastilla226;
    }

    public JLabel getLblPastilla227() {
        return lblPastilla227;
    }

    public void setLblPastilla227(JLabel lblPastilla227) {
        this.lblPastilla227 = lblPastilla227;
    }

    public JLabel getLblPastilla228() {
        return lblPastilla228;
    }

    public void setLblPastilla228(JLabel lblPastilla228) {
        this.lblPastilla228 = lblPastilla228;
    }

    public JLabel getLblPastilla229() {
        return lblPastilla229;
    }

    public void setLblPastilla229(JLabel lblPastilla229) {
        this.lblPastilla229 = lblPastilla229;
    }

    public JLabel getLblPastilla23() {
        return lblPastilla23;
    }

    public void setLblPastilla23(JLabel lblPastilla23) {
        this.lblPastilla23 = lblPastilla23;
    }

    public JLabel getLblPastilla230() {
        return lblPastilla230;
    }

    public void setLblPastilla230(JLabel lblPastilla230) {
        this.lblPastilla230 = lblPastilla230;
    }

    public JLabel getLblPastilla231() {
        return lblPastilla231;
    }

    public void setLblPastilla231(JLabel lblPastilla231) {
        this.lblPastilla231 = lblPastilla231;
    }

    public JLabel getLblPastilla232() {
        return lblPastilla232;
    }

    public void setLblPastilla232(JLabel lblPastilla232) {
        this.lblPastilla232 = lblPastilla232;
    }

    public JLabel getLblPastilla233() {
        return lblPastilla233;
    }

    public void setLblPastilla233(JLabel lblPastilla233) {
        this.lblPastilla233 = lblPastilla233;
    }

    public JLabel getLblPastilla234() {
        return lblPastilla234;
    }

    public void setLblPastilla234(JLabel lblPastilla234) {
        this.lblPastilla234 = lblPastilla234;
    }

    public JLabel getLblPastilla235() {
        return lblPastilla235;
    }

    public void setLblPastilla235(JLabel lblPastilla235) {
        this.lblPastilla235 = lblPastilla235;
    }

    public JLabel getLblPastilla236() {
        return lblPastilla236;
    }

    public void setLblPastilla236(JLabel lblPastilla236) {
        this.lblPastilla236 = lblPastilla236;
    }

    public JLabel getLblPastilla237() {
        return lblPastilla237;
    }

    public void setLblPastilla237(JLabel lblPastilla237) {
        this.lblPastilla237 = lblPastilla237;
    }

    public JLabel getLblPastilla238() {
        return lblPastilla238;
    }

    public void setLblPastilla238(JLabel lblPastilla238) {
        this.lblPastilla238 = lblPastilla238;
    }

    public JLabel getLblPastilla239() {
        return lblPastilla239;
    }

    public void setLblPastilla239(JLabel lblPastilla239) {
        this.lblPastilla239 = lblPastilla239;
    }

    public JLabel getLblPastilla24() {
        return lblPastilla24;
    }

    public void setLblPastilla24(JLabel lblPastilla24) {
        this.lblPastilla24 = lblPastilla24;
    }

    public JLabel getLblPastilla240() {
        return lblPastilla240;
    }

    public void setLblPastilla240(JLabel lblPastilla240) {
        this.lblPastilla240 = lblPastilla240;
    }

    public JLabel getLblPastilla241() {
        return lblPastilla241;
    }

    public void setLblPastilla241(JLabel lblPastilla241) {
        this.lblPastilla241 = lblPastilla241;
    }

    public JLabel getLblPastilla242() {
        return lblPastilla242;
    }

    public void setLblPastilla242(JLabel lblPastilla242) {
        this.lblPastilla242 = lblPastilla242;
    }

    public JLabel getLblPastilla243() {
        return lblPastilla243;
    }

    public void setLblPastilla243(JLabel lblPastilla243) {
        this.lblPastilla243 = lblPastilla243;
    }

    public JLabel getLblPastilla244() {
        return lblPastilla244;
    }

    public void setLblPastilla244(JLabel lblPastilla244) {
        this.lblPastilla244 = lblPastilla244;
    }

    public JLabel getLblPastilla245() {
        return lblPastilla245;
    }

    public void setLblPastilla245(JLabel lblPastilla245) {
        this.lblPastilla245 = lblPastilla245;
    }

    public JLabel getLblPastilla246() {
        return lblPastilla246;
    }

    public void setLblPastilla246(JLabel lblPastilla246) {
        this.lblPastilla246 = lblPastilla246;
    }

    public JLabel getLblPastilla247() {
        return lblPastilla247;
    }

    public void setLblPastilla247(JLabel lblPastilla247) {
        this.lblPastilla247 = lblPastilla247;
    }

    public JLabel getLblPastilla249() {
        return lblPastilla249;
    }

    public void setLblPastilla249(JLabel lblPastilla249) {
        this.lblPastilla249 = lblPastilla249;
    }

    public JLabel getLblPastilla25() {
        return lblPastilla25;
    }

    public void setLblPastilla25(JLabel lblPastilla25) {
        this.lblPastilla25 = lblPastilla25;
    }

    public JLabel getLblPastilla250() {
        return lblPastilla250;
    }

    public void setLblPastilla250(JLabel lblPastilla250) {
        this.lblPastilla250 = lblPastilla250;
    }

    public JLabel getLblPastilla251() {
        return lblPastilla251;
    }

    public void setLblPastilla251(JLabel lblPastilla251) {
        this.lblPastilla251 = lblPastilla251;
    }

    public JLabel getLblPastilla252() {
        return lblPastilla252;
    }

    public void setLblPastilla252(JLabel lblPastilla252) {
        this.lblPastilla252 = lblPastilla252;
    }

    public JLabel getLblPastilla253() {
        return lblPastilla253;
    }

    public void setLblPastilla253(JLabel lblPastilla253) {
        this.lblPastilla253 = lblPastilla253;
    }

    public JLabel getLblPastilla254() {
        return lblPastilla254;
    }

    public void setLblPastilla254(JLabel lblPastilla254) {
        this.lblPastilla254 = lblPastilla254;
    }

    public JLabel getLblPastilla255() {
        return lblPastilla255;
    }

    public void setLblPastilla255(JLabel lblPastilla255) {
        this.lblPastilla255 = lblPastilla255;
    }

    public JLabel getLblPastilla256() {
        return lblPastilla256;
    }

    public void setLblPastilla256(JLabel lblPastilla256) {
        this.lblPastilla256 = lblPastilla256;
    }

    public JLabel getLblPastilla257() {
        return lblPastilla257;
    }

    public void setLblPastilla257(JLabel lblPastilla257) {
        this.lblPastilla257 = lblPastilla257;
    }

    public JLabel getLblPastilla258() {
        return lblPastilla258;
    }

    public void setLblPastilla258(JLabel lblPastilla258) {
        this.lblPastilla258 = lblPastilla258;
    }

    public JLabel getLblPastilla259() {
        return lblPastilla259;
    }

    public void setLblPastilla259(JLabel lblPastilla259) {
        this.lblPastilla259 = lblPastilla259;
    }

    public JLabel getLblPastilla26() {
        return lblPastilla26;
    }

    public void setLblPastilla26(JLabel lblPastilla26) {
        this.lblPastilla26 = lblPastilla26;
    }

    public JLabel getLblPastilla260() {
        return lblPastilla260;
    }

    public void setLblPastilla260(JLabel lblPastilla260) {
        this.lblPastilla260 = lblPastilla260;
    }

    public JLabel getLblPastilla261() {
        return lblPastilla261;
    }

    public void setLblPastilla261(JLabel lblPastilla261) {
        this.lblPastilla261 = lblPastilla261;
    }

    public JLabel getLblPastilla262() {
        return lblPastilla262;
    }

    public void setLblPastilla262(JLabel lblPastilla262) {
        this.lblPastilla262 = lblPastilla262;
    }

    public JLabel getLblPastilla263() {
        return lblPastilla263;
    }

    public void setLblPastilla263(JLabel lblPastilla263) {
        this.lblPastilla263 = lblPastilla263;
    }

    public JLabel getLblPastilla264() {
        return lblPastilla264;
    }

    public void setLblPastilla264(JLabel lblPastilla264) {
        this.lblPastilla264 = lblPastilla264;
    }

    public JLabel getLblPastilla265() {
        return lblPastilla265;
    }

    public void setLblPastilla265(JLabel lblPastilla265) {
        this.lblPastilla265 = lblPastilla265;
    }

    public JLabel getLblPastilla266() {
        return lblPastilla266;
    }

    public void setLblPastilla266(JLabel lblPastilla266) {
        this.lblPastilla266 = lblPastilla266;
    }

    public JLabel getLblPastilla267() {
        return lblPastilla267;
    }

    public void setLblPastilla267(JLabel lblPastilla267) {
        this.lblPastilla267 = lblPastilla267;
    }

    public JLabel getLblPastilla268() {
        return lblPastilla268;
    }

    public void setLblPastilla268(JLabel lblPastilla268) {
        this.lblPastilla268 = lblPastilla268;
    }

    public JLabel getLblPastilla269() {
        return lblPastilla269;
    }

    public void setLblPastilla269(JLabel lblPastilla269) {
        this.lblPastilla269 = lblPastilla269;
    }

    public JLabel getLblPastilla27() {
        return lblPastilla27;
    }

    public void setLblPastilla27(JLabel lblPastilla27) {
        this.lblPastilla27 = lblPastilla27;
    }

    public JLabel getLblPastilla270() {
        return lblPastilla270;
    }

    public void setLblPastilla270(JLabel lblPastilla270) {
        this.lblPastilla270 = lblPastilla270;
    }

    public JLabel getLblPastilla271() {
        return lblPastilla271;
    }

    public void setLblPastilla271(JLabel lblPastilla271) {
        this.lblPastilla271 = lblPastilla271;
    }

    public JLabel getLblPastilla272() {
        return lblPastilla272;
    }

    public void setLblPastilla272(JLabel lblPastilla272) {
        this.lblPastilla272 = lblPastilla272;
    }

    public JLabel getLblPastilla273() {
        return lblPastilla273;
    }

    public void setLblPastilla273(JLabel lblPastilla273) {
        this.lblPastilla273 = lblPastilla273;
    }

    public JLabel getLblPastilla274() {
        return lblPastilla274;
    }

    public void setLblPastilla274(JLabel lblPastilla274) {
        this.lblPastilla274 = lblPastilla274;
    }

    public JLabel getLblPastilla275() {
        return lblPastilla275;
    }

    public void setLblPastilla275(JLabel lblPastilla275) {
        this.lblPastilla275 = lblPastilla275;
    }

    public JLabel getLblPastilla276() {
        return lblPastilla276;
    }

    public void setLblPastilla276(JLabel lblPastilla276) {
        this.lblPastilla276 = lblPastilla276;
    }

    public JLabel getLblPastilla277() {
        return lblPastilla277;
    }

    public void setLblPastilla277(JLabel lblPastilla277) {
        this.lblPastilla277 = lblPastilla277;
    }

    public JLabel getLblPastilla278() {
        return lblPastilla278;
    }

    public void setLblPastilla278(JLabel lblPastilla278) {
        this.lblPastilla278 = lblPastilla278;
    }

    public JLabel getLblPastilla279() {
        return lblPastilla279;
    }

    public void setLblPastilla279(JLabel lblPastilla279) {
        this.lblPastilla279 = lblPastilla279;
    }

    public JLabel getLblPastilla28() {
        return lblPastilla28;
    }

    public void setLblPastilla28(JLabel lblPastilla28) {
        this.lblPastilla28 = lblPastilla28;
    }

    public JLabel getLblPastilla280() {
        return lblPastilla280;
    }

    public void setLblPastilla280(JLabel lblPastilla280) {
        this.lblPastilla280 = lblPastilla280;
    }

    public JLabel getLblPastilla281() {
        return lblPastilla281;
    }

    public void setLblPastilla281(JLabel lblPastilla281) {
        this.lblPastilla281 = lblPastilla281;
    }

    public JLabel getLblPastilla282() {
        return lblPastilla282;
    }

    public void setLblPastilla282(JLabel lblPastilla282) {
        this.lblPastilla282 = lblPastilla282;
    }

    public JLabel getLblPastilla283() {
        return lblPastilla283;
    }

    public void setLblPastilla283(JLabel lblPastilla283) {
        this.lblPastilla283 = lblPastilla283;
    }

    public JLabel getLblPastilla284() {
        return lblPastilla284;
    }

    public void setLblPastilla284(JLabel lblPastilla284) {
        this.lblPastilla284 = lblPastilla284;
    }

    public JLabel getLblPastilla285() {
        return lblPastilla285;
    }

    public void setLblPastilla285(JLabel lblPastilla285) {
        this.lblPastilla285 = lblPastilla285;
    }

    public JLabel getLblPastilla286() {
        return lblPastilla286;
    }

    public void setLblPastilla286(JLabel lblPastilla286) {
        this.lblPastilla286 = lblPastilla286;
    }

    public JLabel getLblPastilla287() {
        return lblPastilla287;
    }

    public void setLblPastilla287(JLabel lblPastilla287) {
        this.lblPastilla287 = lblPastilla287;
    }

    public JLabel getLblPastilla29() {
        return lblPastilla29;
    }

    public void setLblPastilla29(JLabel lblPastilla29) {
        this.lblPastilla29 = lblPastilla29;
    }

    public JLabel getLblPastilla30() {
        return lblPastilla30;
    }

    public void setLblPastilla30(JLabel lblPastilla30) {
        this.lblPastilla30 = lblPastilla30;
    }

    public JLabel getLblPastilla31() {
        return lblPastilla31;
    }

    public void setLblPastilla31(JLabel lblPastilla31) {
        this.lblPastilla31 = lblPastilla31;
    }

    public JLabel getLblPastilla32() {
        return lblPastilla32;
    }

    public void setLblPastilla32(JLabel lblPastilla32) {
        this.lblPastilla32 = lblPastilla32;
    }

    public JLabel getLblPastilla33() {
        return lblPastilla33;
    }

    public void setLblPastilla33(JLabel lblPastilla33) {
        this.lblPastilla33 = lblPastilla33;
    }

    public JLabel getLblPastilla34() {
        return lblPastilla34;
    }

    public void setLblPastilla34(JLabel lblPastilla34) {
        this.lblPastilla34 = lblPastilla34;
    }

    public JLabel getLblPastilla35() {
        return lblPastilla35;
    }

    public void setLblPastilla35(JLabel lblPastilla35) {
        this.lblPastilla35 = lblPastilla35;
    }

    public JLabel getLblPastilla36() {
        return lblPastilla36;
    }

    public void setLblPastilla36(JLabel lblPastilla36) {
        this.lblPastilla36 = lblPastilla36;
    }

    public JLabel getLblPastilla37() {
        return lblPastilla37;
    }

    public void setLblPastilla37(JLabel lblPastilla37) {
        this.lblPastilla37 = lblPastilla37;
    }

    public JLabel getLblPastilla38() {
        return lblPastilla38;
    }

    public void setLblPastilla38(JLabel lblPastilla38) {
        this.lblPastilla38 = lblPastilla38;
    }

    public JLabel getLblPastilla39() {
        return lblPastilla39;
    }

    public void setLblPastilla39(JLabel lblPastilla39) {
        this.lblPastilla39 = lblPastilla39;
    }

    public JLabel getLblPastilla40() {
        return lblPastilla40;
    }

    public void setLblPastilla40(JLabel lblPastilla40) {
        this.lblPastilla40 = lblPastilla40;
    }

    public JLabel getLblPastilla41() {
        return lblPastilla41;
    }

    public void setLblPastilla41(JLabel lblPastilla41) {
        this.lblPastilla41 = lblPastilla41;
    }

    public JLabel getLblPastilla42() {
        return lblPastilla42;
    }

    public void setLblPastilla42(JLabel lblPastilla42) {
        this.lblPastilla42 = lblPastilla42;
    }

    public JLabel getLblPastilla43() {
        return lblPastilla43;
    }

    public void setLblPastilla43(JLabel lblPastilla43) {
        this.lblPastilla43 = lblPastilla43;
    }

    public JLabel getLblPastilla44() {
        return lblPastilla44;
    }

    public void setLblPastilla44(JLabel lblPastilla44) {
        this.lblPastilla44 = lblPastilla44;
    }

    public JLabel getLblPastilla45() {
        return lblPastilla45;
    }

    public void setLblPastilla45(JLabel lblPastilla45) {
        this.lblPastilla45 = lblPastilla45;
    }

    public JLabel getLblPastilla46() {
        return lblPastilla46;
    }

    public void setLblPastilla46(JLabel lblPastilla46) {
        this.lblPastilla46 = lblPastilla46;
    }

    public JLabel getLblPastilla47() {
        return lblPastilla47;
    }

    public void setLblPastilla47(JLabel lblPastilla47) {
        this.lblPastilla47 = lblPastilla47;
    }

    public JLabel getLblPastilla48() {
        return lblPastilla48;
    }

    public void setLblPastilla48(JLabel lblPastilla48) {
        this.lblPastilla48 = lblPastilla48;
    }

    public JLabel getLblPastilla49() {
        return lblPastilla49;
    }

    public void setLblPastilla49(JLabel lblPastilla49) {
        this.lblPastilla49 = lblPastilla49;
    }

    public JLabel getLblPastilla50() {
        return lblPastilla50;
    }

    public void setLblPastilla50(JLabel lblPastilla50) {
        this.lblPastilla50 = lblPastilla50;
    }

    public JLabel getLblPastilla51() {
        return lblPastilla51;
    }

    public void setLblPastilla51(JLabel lblPastilla51) {
        this.lblPastilla51 = lblPastilla51;
    }

    public JLabel getLblPastilla52() {
        return lblPastilla52;
    }

    public void setLblPastilla52(JLabel lblPastilla52) {
        this.lblPastilla52 = lblPastilla52;
    }

    public JLabel getLblPastilla53() {
        return lblPastilla53;
    }

    public void setLblPastilla53(JLabel lblPastilla53) {
        this.lblPastilla53 = lblPastilla53;
    }

    public JLabel getLblPastilla54() {
        return lblPastilla54;
    }

    public void setLblPastilla54(JLabel lblPastilla54) {
        this.lblPastilla54 = lblPastilla54;
    }

    public JLabel getLblPastilla55() {
        return lblPastilla55;
    }

    public void setLblPastilla55(JLabel lblPastilla55) {
        this.lblPastilla55 = lblPastilla55;
    }

    public JLabel getLblPastilla56() {
        return lblPastilla56;
    }

    public void setLblPastilla56(JLabel lblPastilla56) {
        this.lblPastilla56 = lblPastilla56;
    }

    public JLabel getLblPastilla57() {
        return lblPastilla57;
    }

    public void setLblPastilla57(JLabel lblPastilla57) {
        this.lblPastilla57 = lblPastilla57;
    }

    public JLabel getLblPastilla58() {
        return lblPastilla58;
    }

    public void setLblPastilla58(JLabel lblPastilla58) {
        this.lblPastilla58 = lblPastilla58;
    }

    public JLabel getLblPastilla59() {
        return lblPastilla59;
    }

    public void setLblPastilla59(JLabel lblPastilla59) {
        this.lblPastilla59 = lblPastilla59;
    }

    public JLabel getLblPastilla60() {
        return lblPastilla60;
    }

    public void setLblPastilla60(JLabel lblPastilla60) {
        this.lblPastilla60 = lblPastilla60;
    }

    public JLabel getLblPastilla61() {
        return lblPastilla61;
    }

    public void setLblPastilla61(JLabel lblPastilla61) {
        this.lblPastilla61 = lblPastilla61;
    }

    public JLabel getLblPastilla62() {
        return lblPastilla62;
    }

    public void setLblPastilla62(JLabel lblPastilla62) {
        this.lblPastilla62 = lblPastilla62;
    }

    public JLabel getLblPastilla65() {
        return lblPastilla65;
    }

    public void setLblPastilla65(JLabel lblPastilla65) {
        this.lblPastilla65 = lblPastilla65;
    }

    public JLabel getLblPastilla66() {
        return lblPastilla66;
    }

    public void setLblPastilla66(JLabel lblPastilla66) {
        this.lblPastilla66 = lblPastilla66;
    }

    public JLabel getLblPastilla67() {
        return lblPastilla67;
    }

    public void setLblPastilla67(JLabel lblPastilla67) {
        this.lblPastilla67 = lblPastilla67;
    }

    public JLabel getLblPastilla68() {
        return lblPastilla68;
    }

    public void setLblPastilla68(JLabel lblPastilla68) {
        this.lblPastilla68 = lblPastilla68;
    }

    public JLabel getLblPastilla69() {
        return lblPastilla69;
    }

    public void setLblPastilla69(JLabel lblPastilla69) {
        this.lblPastilla69 = lblPastilla69;
    }

    public JLabel getLblPastilla7() {
        return lblPastilla7;
    }

    public void setLblPastilla7(JLabel lblPastilla7) {
        this.lblPastilla7 = lblPastilla7;
    }

    public JLabel getLblPastilla70() {
        return lblPastilla70;
    }

    public void setLblPastilla70(JLabel lblPastilla70) {
        this.lblPastilla70 = lblPastilla70;
    }

    public JLabel getLblPastilla71() {
        return lblPastilla71;
    }

    public void setLblPastilla71(JLabel lblPastilla71) {
        this.lblPastilla71 = lblPastilla71;
    }

    public JLabel getLblPastilla72() {
        return lblPastilla72;
    }

    public void setLblPastilla72(JLabel lblPastilla72) {
        this.lblPastilla72 = lblPastilla72;
    }

    public JLabel getLblPastilla73() {
        return lblPastilla73;
    }

    public void setLblPastilla73(JLabel lblPastilla73) {
        this.lblPastilla73 = lblPastilla73;
    }

    public JLabel getLblPastilla74() {
        return lblPastilla74;
    }

    public void setLblPastilla74(JLabel lblPastilla74) {
        this.lblPastilla74 = lblPastilla74;
    }

    public JLabel getLblPastilla75() {
        return lblPastilla75;
    }

    public void setLblPastilla75(JLabel lblPastilla75) {
        this.lblPastilla75 = lblPastilla75;
    }

    public JLabel getLblPastilla76() {
        return lblPastilla76;
    }

    public void setLblPastilla76(JLabel lblPastilla76) {
        this.lblPastilla76 = lblPastilla76;
    }

    public JLabel getLblPastilla77() {
        return lblPastilla77;
    }

    public void setLblPastilla77(JLabel lblPastilla77) {
        this.lblPastilla77 = lblPastilla77;
    }

    public JLabel getLblPastilla78() {
        return lblPastilla78;
    }

    public void setLblPastilla78(JLabel lblPastilla78) {
        this.lblPastilla78 = lblPastilla78;
    }

    public JLabel getLblPastilla79() {
        return lblPastilla79;
    }

    public void setLblPastilla79(JLabel lblPastilla79) {
        this.lblPastilla79 = lblPastilla79;
    }

    public JLabel getLblPastilla80() {
        return lblPastilla80;
    }

    public void setLblPastilla80(JLabel lblPastilla80) {
        this.lblPastilla80 = lblPastilla80;
    }

    public JLabel getLblPastilla81() {
        return lblPastilla81;
    }

    public void setLblPastilla81(JLabel lblPastilla81) {
        this.lblPastilla81 = lblPastilla81;
    }

    public JLabel getLblPastilla82() {
        return lblPastilla82;
    }

    public void setLblPastilla82(JLabel lblPastilla82) {
        this.lblPastilla82 = lblPastilla82;
    }

    public JLabel getLblPastilla83() {
        return lblPastilla83;
    }

    public void setLblPastilla83(JLabel lblPastilla83) {
        this.lblPastilla83 = lblPastilla83;
    }

    public JLabel getLblPastilla84() {
        return lblPastilla84;
    }

    public void setLblPastilla84(JLabel lblPastilla84) {
        this.lblPastilla84 = lblPastilla84;
    }

    public JLabel getLblPastilla85() {
        return lblPastilla85;
    }

    public void setLblPastilla85(JLabel lblPastilla85) {
        this.lblPastilla85 = lblPastilla85;
    }

    public JLabel getLblPastilla86() {
        return lblPastilla86;
    }

    public void setLblPastilla86(JLabel lblPastilla86) {
        this.lblPastilla86 = lblPastilla86;
    }

    public JLabel getLblPastilla87() {
        return lblPastilla87;
    }

    public void setLblPastilla87(JLabel lblPastilla87) {
        this.lblPastilla87 = lblPastilla87;
    }

    public JLabel getLblPastilla88() {
        return lblPastilla88;
    }

    public void setLblPastilla88(JLabel lblPastilla88) {
        this.lblPastilla88 = lblPastilla88;
    }

    public JLabel getLblPastilla89() {
        return lblPastilla89;
    }

    public void setLblPastilla89(JLabel lblPastilla89) {
        this.lblPastilla89 = lblPastilla89;
    }

    public JLabel getLblPastilla90() {
        return lblPastilla90;
    }

    public void setLblPastilla90(JLabel lblPastilla90) {
        this.lblPastilla90 = lblPastilla90;
    }

    public JLabel getLblPastilla91() {
        return lblPastilla91;
    }

    public void setLblPastilla91(JLabel lblPastilla91) {
        this.lblPastilla91 = lblPastilla91;
    }

    public JLabel getLblPastilla92() {
        return lblPastilla92;
    }

    public void setLblPastilla92(JLabel lblPastilla92) {
        this.lblPastilla92 = lblPastilla92;
    }

    public JLabel getLblPastilla93() {
        return lblPastilla93;
    }

    public void setLblPastilla93(JLabel lblPastilla93) {
        this.lblPastilla93 = lblPastilla93;
    }

    public JLabel getLblPastilla94() {
        return lblPastilla94;
    }

    public void setLblPastilla94(JLabel lblPastilla94) {
        this.lblPastilla94 = lblPastilla94;
    }

    public JLabel getLblPastilla95() {
        return lblPastilla95;
    }

    public void setLblPastilla95(JLabel lblPastilla95) {
        this.lblPastilla95 = lblPastilla95;
    }

    public JLabel getLblPastilla96() {
        return lblPastilla96;
    }

    public void setLblPastilla96(JLabel lblPastilla96) {
        this.lblPastilla96 = lblPastilla96;
    }

    public JLabel getLblPastilla97() {
        return lblPastilla97;
    }

    public void setLblPastilla97(JLabel lblPastilla97) {
        this.lblPastilla97 = lblPastilla97;
    }

    public JLabel getLblPastilla98() {
        return lblPastilla98;
    }

    public void setLblPastilla98(JLabel lblPastilla98) {
        this.lblPastilla98 = lblPastilla98;
    }

    public JLabel getLblPastilla99() {
        return lblPastilla99;
    }

    public void setLblPastilla99(JLabel lblPastilla99) {
        this.lblPastilla99 = lblPastilla99;
    }

    public JLabel getLblPastillaT1() {
        return lblPastillaT1;
    }

    public void setLblPastillaT1(JLabel lblPastillaT1) {
        this.lblPastillaT1 = lblPastillaT1;
    }

    public JLabel getLblPastillaT2() {
        return lblPastillaT2;
    }

    public void setLblPastillaT2(JLabel lblPastillaT2) {
        this.lblPastillaT2 = lblPastillaT2;
    }

    public JLabel getLblPastillaT3() {
        return lblPastillaT3;
    }

    public void setLblPastillaT3(JLabel lblPastillaT3) {
        this.lblPastillaT3 = lblPastillaT3;
    }

    public JLabel getLblPastillaT4() {
        return lblPastillaT4;
    }

    public void setLblPastillaT4(JLabel lblPastillaT4) {
        this.lblPastillaT4 = lblPastillaT4;
    }

    public JPanel getPnlLienzo() {
        return pnlLienzo;
    }

    public void setPnlLienzo(JPanel pnlLienzo) {
        this.pnlLienzo = pnlLienzo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlLienzo = new javax.swing.JPanel();
        barrera1 = new javax.swing.JPanel();
        barrera2 = new javax.swing.JPanel();
        barrera4 = new javax.swing.JPanel();
        barrera5 = new javax.swing.JPanel();
        barrera6 = new javax.swing.JPanel();
        barrera7 = new javax.swing.JPanel();
        barrera8 = new javax.swing.JPanel();
        barrera9 = new javax.swing.JPanel();
        barrera12 = new javax.swing.JPanel();
        barrera13 = new javax.swing.JPanel();
        barrera14 = new javax.swing.JPanel();
        barrera15 = new javax.swing.JPanel();
        barrera17 = new javax.swing.JPanel();
        barrera18 = new javax.swing.JPanel();
        barrera19 = new javax.swing.JPanel();
        barrera20 = new javax.swing.JPanel();
        barrera21 = new javax.swing.JPanel();
        barrera22 = new javax.swing.JPanel();
        barrera23 = new javax.swing.JPanel();
        barrera24 = new javax.swing.JPanel();
        barrera25 = new javax.swing.JPanel();
        barrera26 = new javax.swing.JPanel();
        barrera27 = new javax.swing.JPanel();
        barrera28 = new javax.swing.JPanel();
        barrera29 = new javax.swing.JPanel();
        barrera30 = new javax.swing.JPanel();
        barrera31 = new javax.swing.JPanel();
        barrera32 = new javax.swing.JPanel();
        barrera33 = new javax.swing.JPanel();
        barrera34 = new javax.swing.JPanel();
        barrera35 = new javax.swing.JPanel();
        barrera36 = new javax.swing.JPanel();
        barrera37 = new javax.swing.JPanel();
        barrera38 = new javax.swing.JPanel();
        barrera39 = new javax.swing.JPanel();
        barrera40 = new javax.swing.JPanel();
        barrera41 = new javax.swing.JPanel();
        barrera43 = new javax.swing.JPanel();
        barrera44 = new javax.swing.JPanel();
        barrera45 = new javax.swing.JPanel();
        barrera46 = new javax.swing.JPanel();
        barrera47 = new javax.swing.JPanel();
        barrera48 = new javax.swing.JPanel();
        barrera49 = new javax.swing.JPanel();
        barrera50 = new javax.swing.JPanel();
        barrera51 = new javax.swing.JPanel();
        barrera52 = new javax.swing.JPanel();
        barrera53 = new javax.swing.JPanel();
        barrera54 = new javax.swing.JPanel();
        barrera55 = new javax.swing.JPanel();
        barrera16 = new javax.swing.JPanel();
        barrera56 = new javax.swing.JPanel();
        barrera57 = new javax.swing.JPanel();
        barrera58 = new javax.swing.JPanel();
        barrera59 = new javax.swing.JPanel();
        lblPacman = new javax.swing.JLabel();
        lblFantasmaAzul = new javax.swing.JLabel();
        lblFnatasmaNaranja = new javax.swing.JLabel();
        lblFantasmaAmarillo = new javax.swing.JLabel();
        lblFantasmaRojo = new javax.swing.JLabel();
        lblPastillaT1 = new javax.swing.JLabel();
        lblPastilla2 = new javax.swing.JLabel();
        lblPastillaT2 = new javax.swing.JLabel();
        lblPastillaT4 = new javax.swing.JLabel();
        lblPastillaT3 = new javax.swing.JLabel();
        lblPastilla7 = new javax.swing.JLabel();
        lblPastilla14 = new javax.swing.JLabel();
        lblPastilla15 = new javax.swing.JLabel();
        lblPastilla16 = new javax.swing.JLabel();
        lblPastilla17 = new javax.swing.JLabel();
        lblPastilla18 = new javax.swing.JLabel();
        lblPastilla19 = new javax.swing.JLabel();
        lblPastilla20 = new javax.swing.JLabel();
        lblPastilla21 = new javax.swing.JLabel();
        lblPastilla22 = new javax.swing.JLabel();
        lblPastilla23 = new javax.swing.JLabel();
        lblPastilla24 = new javax.swing.JLabel();
        lblPastilla25 = new javax.swing.JLabel();
        lblPastilla26 = new javax.swing.JLabel();
        lblPastilla27 = new javax.swing.JLabel();
        lblPastilla28 = new javax.swing.JLabel();
        lblPastilla29 = new javax.swing.JLabel();
        lblPastilla30 = new javax.swing.JLabel();
        lblPastilla31 = new javax.swing.JLabel();
        lblPastilla32 = new javax.swing.JLabel();
        lblPastilla33 = new javax.swing.JLabel();
        lblPastilla34 = new javax.swing.JLabel();
        lblPastilla35 = new javax.swing.JLabel();
        lblPastilla36 = new javax.swing.JLabel();
        lblPastilla37 = new javax.swing.JLabel();
        lblPastilla38 = new javax.swing.JLabel();
        lblPastilla39 = new javax.swing.JLabel();
        lblPastilla40 = new javax.swing.JLabel();
        lblPastilla41 = new javax.swing.JLabel();
        lblPastilla42 = new javax.swing.JLabel();
        lblPastilla43 = new javax.swing.JLabel();
        lblPastilla44 = new javax.swing.JLabel();
        lblPastilla45 = new javax.swing.JLabel();
        lblPastilla46 = new javax.swing.JLabel();
        lblPastilla47 = new javax.swing.JLabel();
        lblPastilla48 = new javax.swing.JLabel();
        lblPastilla49 = new javax.swing.JLabel();
        lblPastilla50 = new javax.swing.JLabel();
        lblPastilla51 = new javax.swing.JLabel();
        lblPastilla52 = new javax.swing.JLabel();
        lblPastilla53 = new javax.swing.JLabel();
        lblPastilla54 = new javax.swing.JLabel();
        lblPastilla55 = new javax.swing.JLabel();
        lblPastilla56 = new javax.swing.JLabel();
        lblPastilla57 = new javax.swing.JLabel();
        lblPastilla58 = new javax.swing.JLabel();
        lblPastilla59 = new javax.swing.JLabel();
        lblPastilla60 = new javax.swing.JLabel();
        lblPastilla61 = new javax.swing.JLabel();
        lblPastilla62 = new javax.swing.JLabel();
        lblPastilla65 = new javax.swing.JLabel();
        lblPastilla66 = new javax.swing.JLabel();
        lblPastilla67 = new javax.swing.JLabel();
        lblPastilla68 = new javax.swing.JLabel();
        lblPastilla69 = new javax.swing.JLabel();
        lblPastilla70 = new javax.swing.JLabel();
        lblPastilla71 = new javax.swing.JLabel();
        lblPastilla72 = new javax.swing.JLabel();
        lblPastilla73 = new javax.swing.JLabel();
        lblPastilla74 = new javax.swing.JLabel();
        lblPastilla75 = new javax.swing.JLabel();
        lblPastilla76 = new javax.swing.JLabel();
        lblPastilla77 = new javax.swing.JLabel();
        lblPastilla78 = new javax.swing.JLabel();
        lblPastilla79 = new javax.swing.JLabel();
        lblPastilla80 = new javax.swing.JLabel();
        lblPastilla81 = new javax.swing.JLabel();
        lblPastilla82 = new javax.swing.JLabel();
        lblPastilla83 = new javax.swing.JLabel();
        lblPastilla84 = new javax.swing.JLabel();
        lblPastilla85 = new javax.swing.JLabel();
        lblPastilla86 = new javax.swing.JLabel();
        lblPastilla87 = new javax.swing.JLabel();
        lblPastilla88 = new javax.swing.JLabel();
        lblPastilla89 = new javax.swing.JLabel();
        lblPastilla90 = new javax.swing.JLabel();
        lblPastilla91 = new javax.swing.JLabel();
        lblPastilla92 = new javax.swing.JLabel();
        lblPastilla93 = new javax.swing.JLabel();
        lblPastilla94 = new javax.swing.JLabel();
        lblPastilla96 = new javax.swing.JLabel();
        lblPastilla97 = new javax.swing.JLabel();
        lblPastilla98 = new javax.swing.JLabel();
        lblPastilla99 = new javax.swing.JLabel();
        lblPastilla100 = new javax.swing.JLabel();
        lblPastilla101 = new javax.swing.JLabel();
        lblPastilla102 = new javax.swing.JLabel();
        lblPastilla103 = new javax.swing.JLabel();
        lblPastilla104 = new javax.swing.JLabel();
        lblPastilla105 = new javax.swing.JLabel();
        lblPastilla106 = new javax.swing.JLabel();
        lblPastilla107 = new javax.swing.JLabel();
        lblPastilla108 = new javax.swing.JLabel();
        lblPastilla109 = new javax.swing.JLabel();
        lblPastilla110 = new javax.swing.JLabel();
        lblPastilla111 = new javax.swing.JLabel();
        lblPastilla112 = new javax.swing.JLabel();
        lblPastilla113 = new javax.swing.JLabel();
        lblPastilla114 = new javax.swing.JLabel();
        lblPastilla115 = new javax.swing.JLabel();
        lblPastilla116 = new javax.swing.JLabel();
        lblPastilla117 = new javax.swing.JLabel();
        lblPastilla118 = new javax.swing.JLabel();
        lblPastilla119 = new javax.swing.JLabel();
        lblPastilla120 = new javax.swing.JLabel();
        lblPastilla121 = new javax.swing.JLabel();
        lblPastilla122 = new javax.swing.JLabel();
        lblPastilla123 = new javax.swing.JLabel();
        lblPastilla124 = new javax.swing.JLabel();
        lblPastilla125 = new javax.swing.JLabel();
        lblPastilla128 = new javax.swing.JLabel();
        lblPastilla129 = new javax.swing.JLabel();
        lblPastilla130 = new javax.swing.JLabel();
        lblPastilla131 = new javax.swing.JLabel();
        lblPastilla132 = new javax.swing.JLabel();
        lblPastilla133 = new javax.swing.JLabel();
        lblPastilla134 = new javax.swing.JLabel();
        lblPastilla136 = new javax.swing.JLabel();
        lblPastilla137 = new javax.swing.JLabel();
        lblPastilla138 = new javax.swing.JLabel();
        lblPastilla139 = new javax.swing.JLabel();
        lblPastilla140 = new javax.swing.JLabel();
        lblPastilla141 = new javax.swing.JLabel();
        lblPastilla142 = new javax.swing.JLabel();
        lblPastilla143 = new javax.swing.JLabel();
        lblPastilla144 = new javax.swing.JLabel();
        lblPastilla145 = new javax.swing.JLabel();
        lblPastilla146 = new javax.swing.JLabel();
        lblPastilla147 = new javax.swing.JLabel();
        lblPastilla148 = new javax.swing.JLabel();
        lblPastilla149 = new javax.swing.JLabel();
        lblPastilla150 = new javax.swing.JLabel();
        lblPastilla151 = new javax.swing.JLabel();
        lblPastilla152 = new javax.swing.JLabel();
        lblPastilla153 = new javax.swing.JLabel();
        lblPastilla154 = new javax.swing.JLabel();
        lblPastilla155 = new javax.swing.JLabel();
        lblPastilla156 = new javax.swing.JLabel();
        lblPastilla157 = new javax.swing.JLabel();
        lblPastilla158 = new javax.swing.JLabel();
        lblPastilla159 = new javax.swing.JLabel();
        lblPastilla160 = new javax.swing.JLabel();
        lblPastilla161 = new javax.swing.JLabel();
        lblPastilla162 = new javax.swing.JLabel();
        lblPastilla163 = new javax.swing.JLabel();
        lblPastilla164 = new javax.swing.JLabel();
        lblPastilla165 = new javax.swing.JLabel();
        lblPastilla166 = new javax.swing.JLabel();
        lblPastilla167 = new javax.swing.JLabel();
        lblPastilla168 = new javax.swing.JLabel();
        lblPastilla169 = new javax.swing.JLabel();
        lblPastilla170 = new javax.swing.JLabel();
        lblPastilla171 = new javax.swing.JLabel();
        lblPastilla172 = new javax.swing.JLabel();
        lblPastilla173 = new javax.swing.JLabel();
        lblPastilla174 = new javax.swing.JLabel();
        lblPastilla175 = new javax.swing.JLabel();
        lblPastilla176 = new javax.swing.JLabel();
        lblPastilla177 = new javax.swing.JLabel();
        lblPastilla178 = new javax.swing.JLabel();
        lblPastilla179 = new javax.swing.JLabel();
        lblPastilla180 = new javax.swing.JLabel();
        lblPastilla181 = new javax.swing.JLabel();
        lblPastilla182 = new javax.swing.JLabel();
        lblPastilla183 = new javax.swing.JLabel();
        lblPastilla184 = new javax.swing.JLabel();
        lblPastilla185 = new javax.swing.JLabel();
        lblPastilla186 = new javax.swing.JLabel();
        lblPastilla187 = new javax.swing.JLabel();
        lblPastilla188 = new javax.swing.JLabel();
        lblPastilla189 = new javax.swing.JLabel();
        lblPastilla190 = new javax.swing.JLabel();
        lblPastilla191 = new javax.swing.JLabel();
        lblPastilla192 = new javax.swing.JLabel();
        lblPastilla193 = new javax.swing.JLabel();
        lblPastilla194 = new javax.swing.JLabel();
        lblPastilla195 = new javax.swing.JLabel();
        lblPastilla196 = new javax.swing.JLabel();
        lblPastilla197 = new javax.swing.JLabel();
        lblPastilla198 = new javax.swing.JLabel();
        lblPastilla199 = new javax.swing.JLabel();
        lblPastilla200 = new javax.swing.JLabel();
        lblPastilla201 = new javax.swing.JLabel();
        lblPastilla202 = new javax.swing.JLabel();
        lblPastilla203 = new javax.swing.JLabel();
        lblPastilla205 = new javax.swing.JLabel();
        lblPastilla206 = new javax.swing.JLabel();
        lblPastilla207 = new javax.swing.JLabel();
        lblPastilla204 = new javax.swing.JLabel();
        lblPastilla208 = new javax.swing.JLabel();
        lblPastilla209 = new javax.swing.JLabel();
        lblPastilla210 = new javax.swing.JLabel();
        lblPastilla211 = new javax.swing.JLabel();
        lblPastilla212 = new javax.swing.JLabel();
        lblPastilla213 = new javax.swing.JLabel();
        lblPastilla214 = new javax.swing.JLabel();
        lblPastilla215 = new javax.swing.JLabel();
        lblPastilla216 = new javax.swing.JLabel();
        lblPastilla217 = new javax.swing.JLabel();
        lblPastilla218 = new javax.swing.JLabel();
        lblPastilla219 = new javax.swing.JLabel();
        lblPastilla220 = new javax.swing.JLabel();
        lblPastilla221 = new javax.swing.JLabel();
        lblPastilla222 = new javax.swing.JLabel();
        lblPastilla223 = new javax.swing.JLabel();
        lblPastilla224 = new javax.swing.JLabel();
        lblPastilla225 = new javax.swing.JLabel();
        lblPastilla226 = new javax.swing.JLabel();
        lblPastilla227 = new javax.swing.JLabel();
        lblPastilla228 = new javax.swing.JLabel();
        lblPastilla229 = new javax.swing.JLabel();
        lblPastilla230 = new javax.swing.JLabel();
        lblPastilla231 = new javax.swing.JLabel();
        lblPastilla232 = new javax.swing.JLabel();
        lblPastilla233 = new javax.swing.JLabel();
        lblPastilla234 = new javax.swing.JLabel();
        lblPastilla235 = new javax.swing.JLabel();
        lblPastilla236 = new javax.swing.JLabel();
        lblPastilla237 = new javax.swing.JLabel();
        lblPastilla238 = new javax.swing.JLabel();
        lblPastilla239 = new javax.swing.JLabel();
        lblPastilla240 = new javax.swing.JLabel();
        lblPastilla241 = new javax.swing.JLabel();
        lblPastilla242 = new javax.swing.JLabel();
        lblPastilla243 = new javax.swing.JLabel();
        lblPastilla244 = new javax.swing.JLabel();
        lblPastilla245 = new javax.swing.JLabel();
        lblPastilla247 = new javax.swing.JLabel();
        lblPastilla249 = new javax.swing.JLabel();
        lblPastilla250 = new javax.swing.JLabel();
        lblPastilla251 = new javax.swing.JLabel();
        lblPastilla252 = new javax.swing.JLabel();
        lblPastilla253 = new javax.swing.JLabel();
        lblPastilla254 = new javax.swing.JLabel();
        lblPastilla255 = new javax.swing.JLabel();
        lblPastilla256 = new javax.swing.JLabel();
        lblPastilla257 = new javax.swing.JLabel();
        lblPastilla258 = new javax.swing.JLabel();
        lblPastilla259 = new javax.swing.JLabel();
        lblPastilla260 = new javax.swing.JLabel();
        lblPastilla261 = new javax.swing.JLabel();
        lblPastilla262 = new javax.swing.JLabel();
        lblPastilla263 = new javax.swing.JLabel();
        lblPastilla264 = new javax.swing.JLabel();
        barrera60 = new javax.swing.JPanel();
        lblPastilla246 = new javax.swing.JLabel();
        lblPastilla265 = new javax.swing.JLabel();
        lblPastilla266 = new javax.swing.JLabel();
        lblPastilla267 = new javax.swing.JLabel();
        lblPastilla268 = new javax.swing.JLabel();
        lblPastilla269 = new javax.swing.JLabel();
        lblPastilla270 = new javax.swing.JLabel();
        lblPastilla271 = new javax.swing.JLabel();
        lblPastilla272 = new javax.swing.JLabel();
        lblPastilla273 = new javax.swing.JLabel();
        lblPastilla274 = new javax.swing.JLabel();
        lblPastilla275 = new javax.swing.JLabel();
        lblPastilla276 = new javax.swing.JLabel();
        lblPastilla277 = new javax.swing.JLabel();
        lblPastilla278 = new javax.swing.JLabel();
        lblPastilla279 = new javax.swing.JLabel();
        lblPastilla280 = new javax.swing.JLabel();
        lblPastilla281 = new javax.swing.JLabel();
        lblPastilla282 = new javax.swing.JLabel();
        lblPastilla283 = new javax.swing.JLabel();
        lblPastilla284 = new javax.swing.JLabel();
        lblPastilla285 = new javax.swing.JLabel();
        lblPastilla286 = new javax.swing.JLabel();
        lblPastilla287 = new javax.swing.JLabel();
        lblPastilla95 = new javax.swing.JLabel();
        lblPastilla63 = new javax.swing.JLabel();
        lblPastilla64 = new javax.swing.JLabel();
        lblPastilla126 = new javax.swing.JLabel();
        lblPastilla127 = new javax.swing.JLabel();
        lblPastilla135 = new javax.swing.JLabel();
        barrera61 = new javax.swing.JPanel();
        barrera62 = new javax.swing.JPanel();
        barrera63 = new javax.swing.JPanel();
        lblPastilla248 = new javax.swing.JLabel();
        bprogress = new javax.swing.JProgressBar();
        btnReinicio = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        lblVidas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        bprogressPastilla = new rojerusan.componentes.RSProgressCircle();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuArriba = new javax.swing.JMenuItem();
        menuAbajo = new javax.swing.JMenuItem();
        menuDerecha = new javax.swing.JMenuItem();
        menuIzquierda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacman ");
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(990, 730));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLienzo.setBackground(new java.awt.Color(0, 0, 0));
        pnlLienzo.setForeground(new java.awt.Color(204, 204, 204));
        pnlLienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrera1.setBackground(new java.awt.Color(0, 102, 204));
        barrera1.setName(""); // NOI18N

        javax.swing.GroupLayout barrera1Layout = new javax.swing.GroupLayout(barrera1);
        barrera1.setLayout(barrera1Layout);
        barrera1Layout.setHorizontalGroup(
            barrera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera1Layout.setVerticalGroup(
            barrera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 60));

        barrera2.setBackground(new java.awt.Color(0, 102, 204));
        barrera2.setName(""); // NOI18N

        javax.swing.GroupLayout barrera2Layout = new javax.swing.GroupLayout(barrera2);
        barrera2.setLayout(barrera2Layout);
        barrera2Layout.setHorizontalGroup(
            barrera2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        barrera2Layout.setVerticalGroup(
            barrera2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        barrera4.setBackground(new java.awt.Color(0, 102, 204));
        barrera4.setName(""); // NOI18N

        javax.swing.GroupLayout barrera4Layout = new javax.swing.GroupLayout(barrera4);
        barrera4.setLayout(barrera4Layout);
        barrera4Layout.setHorizontalGroup(
            barrera4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barrera4Layout.setVerticalGroup(
            barrera4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 60));

        barrera5.setBackground(new java.awt.Color(0, 102, 204));
        barrera5.setName(""); // NOI18N

        javax.swing.GroupLayout barrera5Layout = new javax.swing.GroupLayout(barrera5);
        barrera5.setLayout(barrera5Layout);
        barrera5Layout.setHorizontalGroup(
            barrera5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        barrera5Layout.setVerticalGroup(
            barrera5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 210, 60));

        barrera6.setBackground(new java.awt.Color(0, 102, 204));
        barrera6.setName(""); // NOI18N

        javax.swing.GroupLayout barrera6Layout = new javax.swing.GroupLayout(barrera6);
        barrera6.setLayout(barrera6Layout);
        barrera6Layout.setHorizontalGroup(
            barrera6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        barrera6Layout.setVerticalGroup(
            barrera6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, 30));

        barrera7.setBackground(new java.awt.Color(0, 102, 204));
        barrera7.setName(""); // NOI18N

        javax.swing.GroupLayout barrera7Layout = new javax.swing.GroupLayout(barrera7);
        barrera7.setLayout(barrera7Layout);
        barrera7Layout.setHorizontalGroup(
            barrera7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera7Layout.setVerticalGroup(
            barrera7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 120));

        barrera8.setBackground(new java.awt.Color(0, 102, 204));
        barrera8.setName(""); // NOI18N

        javax.swing.GroupLayout barrera8Layout = new javax.swing.GroupLayout(barrera8);
        barrera8.setLayout(barrera8Layout);
        barrera8Layout.setHorizontalGroup(
            barrera8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera8Layout.setVerticalGroup(
            barrera8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 30, 60));

        barrera9.setBackground(new java.awt.Color(0, 102, 204));
        barrera9.setName(""); // NOI18N

        javax.swing.GroupLayout barrera9Layout = new javax.swing.GroupLayout(barrera9);
        barrera9.setLayout(barrera9Layout);
        barrera9Layout.setHorizontalGroup(
            barrera9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera9Layout.setVerticalGroup(
            barrera9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 30, 90));

        barrera12.setBackground(new java.awt.Color(0, 102, 204));
        barrera12.setName(""); // NOI18N

        javax.swing.GroupLayout barrera12Layout = new javax.swing.GroupLayout(barrera12);
        barrera12.setLayout(barrera12Layout);
        barrera12Layout.setHorizontalGroup(
            barrera12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        barrera12Layout.setVerticalGroup(
            barrera12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, 30));

        barrera13.setBackground(new java.awt.Color(0, 102, 204));
        barrera13.setName(""); // NOI18N

        javax.swing.GroupLayout barrera13Layout = new javax.swing.GroupLayout(barrera13);
        barrera13.setLayout(barrera13Layout);
        barrera13Layout.setHorizontalGroup(
            barrera13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera13Layout.setVerticalGroup(
            barrera13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 30, 90));

        barrera14.setBackground(new java.awt.Color(0, 102, 204));
        barrera14.setName(""); // NOI18N

        javax.swing.GroupLayout barrera14Layout = new javax.swing.GroupLayout(barrera14);
        barrera14.setLayout(barrera14Layout);
        barrera14Layout.setHorizontalGroup(
            barrera14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera14Layout.setVerticalGroup(
            barrera14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 30, 90));

        barrera15.setBackground(new java.awt.Color(0, 102, 204));
        barrera15.setName(""); // NOI18N

        javax.swing.GroupLayout barrera15Layout = new javax.swing.GroupLayout(barrera15);
        barrera15.setLayout(barrera15Layout);
        barrera15Layout.setHorizontalGroup(
            barrera15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        barrera15Layout.setVerticalGroup(
            barrera15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 210, 60));

        barrera17.setBackground(new java.awt.Color(0, 102, 204));
        barrera17.setName(""); // NOI18N

        javax.swing.GroupLayout barrera17Layout = new javax.swing.GroupLayout(barrera17);
        barrera17.setLayout(barrera17Layout);
        barrera17Layout.setHorizontalGroup(
            barrera17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        barrera17Layout.setVerticalGroup(
            barrera17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 200, 30));

        barrera18.setBackground(new java.awt.Color(0, 102, 204));
        barrera18.setName(""); // NOI18N

        javax.swing.GroupLayout barrera18Layout = new javax.swing.GroupLayout(barrera18);
        barrera18.setLayout(barrera18Layout);
        barrera18Layout.setHorizontalGroup(
            barrera18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        barrera18Layout.setVerticalGroup(
            barrera18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, 20));

        barrera19.setBackground(new java.awt.Color(0, 102, 204));
        barrera19.setName(""); // NOI18N

        javax.swing.GroupLayout barrera19Layout = new javax.swing.GroupLayout(barrera19);
        barrera19.setLayout(barrera19Layout);
        barrera19Layout.setHorizontalGroup(
            barrera19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        barrera19Layout.setVerticalGroup(
            barrera19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 360, 20));

        barrera20.setBackground(new java.awt.Color(0, 102, 204));
        barrera20.setName(""); // NOI18N

        javax.swing.GroupLayout barrera20Layout = new javax.swing.GroupLayout(barrera20);
        barrera20.setLayout(barrera20Layout);
        barrera20Layout.setHorizontalGroup(
            barrera20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        barrera20Layout.setVerticalGroup(
            barrera20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, 30));

        barrera21.setBackground(new java.awt.Color(0, 102, 204));
        barrera21.setName(""); // NOI18N

        javax.swing.GroupLayout barrera21Layout = new javax.swing.GroupLayout(barrera21);
        barrera21.setLayout(barrera21Layout);
        barrera21Layout.setHorizontalGroup(
            barrera21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera21Layout.setVerticalGroup(
            barrera21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 30, 60));

        barrera22.setBackground(new java.awt.Color(0, 102, 204));
        barrera22.setName(""); // NOI18N

        javax.swing.GroupLayout barrera22Layout = new javax.swing.GroupLayout(barrera22);
        barrera22.setLayout(barrera22Layout);
        barrera22Layout.setHorizontalGroup(
            barrera22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera22Layout.setVerticalGroup(
            barrera22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 30, 90));

        barrera23.setBackground(new java.awt.Color(0, 102, 204));
        barrera23.setName(""); // NOI18N

        javax.swing.GroupLayout barrera23Layout = new javax.swing.GroupLayout(barrera23);
        barrera23.setLayout(barrera23Layout);
        barrera23Layout.setHorizontalGroup(
            barrera23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera23Layout.setVerticalGroup(
            barrera23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 90, 60));

        barrera24.setBackground(new java.awt.Color(0, 102, 204));
        barrera24.setName(""); // NOI18N

        javax.swing.GroupLayout barrera24Layout = new javax.swing.GroupLayout(barrera24);
        barrera24.setLayout(barrera24Layout);
        barrera24Layout.setHorizontalGroup(
            barrera24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        barrera24Layout.setVerticalGroup(
            barrera24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 180, 30));

        barrera25.setBackground(new java.awt.Color(0, 102, 204));
        barrera25.setName(""); // NOI18N

        javax.swing.GroupLayout barrera25Layout = new javax.swing.GroupLayout(barrera25);
        barrera25.setLayout(barrera25Layout);
        barrera25Layout.setHorizontalGroup(
            barrera25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera25Layout.setVerticalGroup(
            barrera25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera25, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 30, 90));

        barrera26.setBackground(new java.awt.Color(0, 102, 204));
        barrera26.setName(""); // NOI18N

        javax.swing.GroupLayout barrera26Layout = new javax.swing.GroupLayout(barrera26);
        barrera26.setLayout(barrera26Layout);
        barrera26Layout.setHorizontalGroup(
            barrera26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        barrera26Layout.setVerticalGroup(
            barrera26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera26, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 210, 30));

        barrera27.setBackground(new java.awt.Color(0, 102, 204));
        barrera27.setName(""); // NOI18N

        javax.swing.GroupLayout barrera27Layout = new javax.swing.GroupLayout(barrera27);
        barrera27.setLayout(barrera27Layout);
        barrera27Layout.setHorizontalGroup(
            barrera27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barrera27Layout.setVerticalGroup(
            barrera27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 150, 60));

        barrera28.setBackground(new java.awt.Color(0, 102, 204));
        barrera28.setName(""); // NOI18N

        javax.swing.GroupLayout barrera28Layout = new javax.swing.GroupLayout(barrera28);
        barrera28.setLayout(barrera28Layout);
        barrera28Layout.setHorizontalGroup(
            barrera28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera28Layout.setVerticalGroup(
            barrera28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera28, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 30, 260));

        barrera29.setBackground(new java.awt.Color(0, 102, 204));
        barrera29.setName(""); // NOI18N

        javax.swing.GroupLayout barrera29Layout = new javax.swing.GroupLayout(barrera29);
        barrera29.setLayout(barrera29Layout);
        barrera29Layout.setHorizontalGroup(
            barrera29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera29Layout.setVerticalGroup(
            barrera29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 30, 60));

        barrera30.setBackground(new java.awt.Color(0, 102, 204));
        barrera30.setName(""); // NOI18N

        javax.swing.GroupLayout barrera30Layout = new javax.swing.GroupLayout(barrera30);
        barrera30.setLayout(barrera30Layout);
        barrera30Layout.setHorizontalGroup(
            barrera30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera30Layout.setVerticalGroup(
            barrera30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera30, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 30, 120));

        barrera31.setBackground(new java.awt.Color(0, 102, 204));
        barrera31.setName(""); // NOI18N

        javax.swing.GroupLayout barrera31Layout = new javax.swing.GroupLayout(barrera31);
        barrera31.setLayout(barrera31Layout);
        barrera31Layout.setHorizontalGroup(
            barrera31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barrera31Layout.setVerticalGroup(
            barrera31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera31, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 150, 30));

        barrera32.setBackground(new java.awt.Color(0, 102, 204));
        barrera32.setName(""); // NOI18N

        javax.swing.GroupLayout barrera32Layout = new javax.swing.GroupLayout(barrera32);
        barrera32.setLayout(barrera32Layout);
        barrera32Layout.setHorizontalGroup(
            barrera32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera32Layout.setVerticalGroup(
            barrera32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera32, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 30, 320));

        barrera33.setBackground(new java.awt.Color(0, 102, 204));
        barrera33.setName(""); // NOI18N

        javax.swing.GroupLayout barrera33Layout = new javax.swing.GroupLayout(barrera33);
        barrera33.setLayout(barrera33Layout);
        barrera33Layout.setHorizontalGroup(
            barrera33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        barrera33Layout.setVerticalGroup(
            barrera33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 350));

        barrera34.setBackground(new java.awt.Color(0, 102, 204));
        barrera34.setName(""); // NOI18N

        javax.swing.GroupLayout barrera34Layout = new javax.swing.GroupLayout(barrera34);
        barrera34.setLayout(barrera34Layout);
        barrera34Layout.setHorizontalGroup(
            barrera34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        barrera34Layout.setVerticalGroup(
            barrera34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1010, 30));

        barrera35.setBackground(new java.awt.Color(0, 102, 204));
        barrera35.setName(""); // NOI18N

        javax.swing.GroupLayout barrera35Layout = new javax.swing.GroupLayout(barrera35);
        barrera35.setLayout(barrera35Layout);
        barrera35Layout.setHorizontalGroup(
            barrera35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        barrera35Layout.setVerticalGroup(
            barrera35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 30));

        barrera36.setBackground(new java.awt.Color(0, 102, 204));
        barrera36.setName(""); // NOI18N

        javax.swing.GroupLayout barrera36Layout = new javax.swing.GroupLayout(barrera36);
        barrera36.setLayout(barrera36Layout);
        barrera36Layout.setHorizontalGroup(
            barrera36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera36Layout.setVerticalGroup(
            barrera36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 90, 60));

        barrera37.setBackground(new java.awt.Color(0, 102, 204));
        barrera37.setName(""); // NOI18N

        javax.swing.GroupLayout barrera37Layout = new javax.swing.GroupLayout(barrera37);
        barrera37.setLayout(barrera37Layout);
        barrera37Layout.setHorizontalGroup(
            barrera37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera37Layout.setVerticalGroup(
            barrera37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 120));

        barrera38.setBackground(new java.awt.Color(0, 102, 204));
        barrera38.setName(""); // NOI18N

        javax.swing.GroupLayout barrera38Layout = new javax.swing.GroupLayout(barrera38);
        barrera38.setLayout(barrera38Layout);
        barrera38Layout.setHorizontalGroup(
            barrera38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barrera38Layout.setVerticalGroup(
            barrera38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 150, 30));

        barrera39.setBackground(new java.awt.Color(0, 102, 204));
        barrera39.setName(""); // NOI18N

        javax.swing.GroupLayout barrera39Layout = new javax.swing.GroupLayout(barrera39);
        barrera39.setLayout(barrera39Layout);
        barrera39Layout.setHorizontalGroup(
            barrera39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        barrera39Layout.setVerticalGroup(
            barrera39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 70, 30));

        barrera40.setBackground(new java.awt.Color(0, 102, 204));
        barrera40.setName(""); // NOI18N

        javax.swing.GroupLayout barrera40Layout = new javax.swing.GroupLayout(barrera40);
        barrera40.setLayout(barrera40Layout);
        barrera40Layout.setHorizontalGroup(
            barrera40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera40Layout.setVerticalGroup(
            barrera40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 90, 30));

        barrera41.setBackground(new java.awt.Color(0, 102, 204));
        barrera41.setName(""); // NOI18N

        javax.swing.GroupLayout barrera41Layout = new javax.swing.GroupLayout(barrera41);
        barrera41.setLayout(barrera41Layout);
        barrera41Layout.setHorizontalGroup(
            barrera41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera41Layout.setVerticalGroup(
            barrera41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 30, 150));

        barrera43.setBackground(new java.awt.Color(0, 102, 204));
        barrera43.setName(""); // NOI18N

        javax.swing.GroupLayout barrera43Layout = new javax.swing.GroupLayout(barrera43);
        barrera43.setLayout(barrera43Layout);
        barrera43Layout.setHorizontalGroup(
            barrera43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        barrera43Layout.setVerticalGroup(
            barrera43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 390, 30));

        barrera44.setBackground(new java.awt.Color(0, 102, 204));
        barrera44.setName(""); // NOI18N

        javax.swing.GroupLayout barrera44Layout = new javax.swing.GroupLayout(barrera44);
        barrera44.setLayout(barrera44Layout);
        barrera44Layout.setHorizontalGroup(
            barrera44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera44Layout.setVerticalGroup(
            barrera44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 30, 60));

        barrera45.setBackground(new java.awt.Color(0, 102, 204));
        barrera45.setName(""); // NOI18N

        javax.swing.GroupLayout barrera45Layout = new javax.swing.GroupLayout(barrera45);
        barrera45.setLayout(barrera45Layout);
        barrera45Layout.setHorizontalGroup(
            barrera45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        barrera45Layout.setVerticalGroup(
            barrera45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 190, 30));

        barrera46.setBackground(new java.awt.Color(0, 102, 204));
        barrera46.setName(""); // NOI18N

        javax.swing.GroupLayout barrera46Layout = new javax.swing.GroupLayout(barrera46);
        barrera46.setLayout(barrera46Layout);
        barrera46Layout.setHorizontalGroup(
            barrera46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        barrera46Layout.setVerticalGroup(
            barrera46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 390, 30));

        barrera47.setBackground(new java.awt.Color(0, 102, 204));
        barrera47.setName(""); // NOI18N

        javax.swing.GroupLayout barrera47Layout = new javax.swing.GroupLayout(barrera47);
        barrera47.setLayout(barrera47Layout);
        barrera47Layout.setHorizontalGroup(
            barrera47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera47Layout.setVerticalGroup(
            barrera47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera47, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 30, 60));

        barrera48.setBackground(new java.awt.Color(0, 102, 204));
        barrera48.setName(""); // NOI18N

        javax.swing.GroupLayout barrera48Layout = new javax.swing.GroupLayout(barrera48);
        barrera48.setLayout(barrera48Layout);
        barrera48Layout.setHorizontalGroup(
            barrera48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        barrera48Layout.setVerticalGroup(
            barrera48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera48, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 390, 30));

        barrera49.setBackground(new java.awt.Color(0, 102, 204));
        barrera49.setName(""); // NOI18N

        javax.swing.GroupLayout barrera49Layout = new javax.swing.GroupLayout(barrera49);
        barrera49.setLayout(barrera49Layout);
        barrera49Layout.setHorizontalGroup(
            barrera49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera49Layout.setVerticalGroup(
            barrera49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 30, 60));

        barrera50.setBackground(new java.awt.Color(0, 102, 204));
        barrera50.setName(""); // NOI18N

        javax.swing.GroupLayout barrera50Layout = new javax.swing.GroupLayout(barrera50);
        barrera50.setLayout(barrera50Layout);
        barrera50Layout.setHorizontalGroup(
            barrera50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera50Layout.setVerticalGroup(
            barrera50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera50, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 90, 60));

        barrera51.setBackground(new java.awt.Color(0, 102, 204));
        barrera51.setName(""); // NOI18N

        javax.swing.GroupLayout barrera51Layout = new javax.swing.GroupLayout(barrera51);
        barrera51.setLayout(barrera51Layout);
        barrera51Layout.setHorizontalGroup(
            barrera51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        barrera51Layout.setVerticalGroup(
            barrera51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera51, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 180, 30));

        barrera52.setBackground(new java.awt.Color(0, 102, 204));
        barrera52.setName(""); // NOI18N

        javax.swing.GroupLayout barrera52Layout = new javax.swing.GroupLayout(barrera52);
        barrera52.setLayout(barrera52Layout);
        barrera52Layout.setHorizontalGroup(
            barrera52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera52Layout.setVerticalGroup(
            barrera52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera52, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 30, 150));

        barrera53.setBackground(new java.awt.Color(0, 102, 204));
        barrera53.setName(""); // NOI18N

        javax.swing.GroupLayout barrera53Layout = new javax.swing.GroupLayout(barrera53);
        barrera53.setLayout(barrera53Layout);
        barrera53Layout.setHorizontalGroup(
            barrera53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        barrera53Layout.setVerticalGroup(
            barrera53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera53, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 390, 30));

        barrera54.setBackground(new java.awt.Color(0, 102, 204));
        barrera54.setName(""); // NOI18N

        javax.swing.GroupLayout barrera54Layout = new javax.swing.GroupLayout(barrera54);
        barrera54.setLayout(barrera54Layout);
        barrera54Layout.setHorizontalGroup(
            barrera54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        barrera54Layout.setVerticalGroup(
            barrera54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera54, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 150, 30));

        barrera55.setBackground(new java.awt.Color(0, 102, 204));
        barrera55.setName(""); // NOI18N

        javax.swing.GroupLayout barrera55Layout = new javax.swing.GroupLayout(barrera55);
        barrera55.setLayout(barrera55Layout);
        barrera55Layout.setHorizontalGroup(
            barrera55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera55Layout.setVerticalGroup(
            barrera55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera55, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 90, 30));

        barrera16.setBackground(new java.awt.Color(0, 102, 204));
        barrera16.setName(""); // NOI18N

        javax.swing.GroupLayout barrera16Layout = new javax.swing.GroupLayout(barrera16);
        barrera16.setLayout(barrera16Layout);
        barrera16Layout.setHorizontalGroup(
            barrera16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        barrera16Layout.setVerticalGroup(
            barrera16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 170, 20));

        barrera56.setBackground(new java.awt.Color(0, 102, 204));
        barrera56.setName(""); // NOI18N

        javax.swing.GroupLayout barrera56Layout = new javax.swing.GroupLayout(barrera56);
        barrera56.setLayout(barrera56Layout);
        barrera56Layout.setHorizontalGroup(
            barrera56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera56Layout.setVerticalGroup(
            barrera56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera56, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 30, 60));

        barrera57.setBackground(new java.awt.Color(0, 102, 204));
        barrera57.setName(""); // NOI18N

        javax.swing.GroupLayout barrera57Layout = new javax.swing.GroupLayout(barrera57);
        barrera57.setLayout(barrera57Layout);
        barrera57Layout.setHorizontalGroup(
            barrera57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        barrera57Layout.setVerticalGroup(
            barrera57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera57, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 90, -1));

        barrera58.setBackground(new java.awt.Color(204, 204, 204));
        barrera58.setName(""); // NOI18N

        javax.swing.GroupLayout barrera58Layout = new javax.swing.GroupLayout(barrera58);
        barrera58.setLayout(barrera58Layout);
        barrera58Layout.setHorizontalGroup(
            barrera58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        barrera58Layout.setVerticalGroup(
            barrera58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera58, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 10, 10));

        barrera59.setBackground(new java.awt.Color(204, 204, 204));
        barrera59.setName(""); // NOI18N

        javax.swing.GroupLayout barrera59Layout = new javax.swing.GroupLayout(barrera59);
        barrera59.setLayout(barrera59Layout);
        barrera59Layout.setHorizontalGroup(
            barrera59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        barrera59Layout.setVerticalGroup(
            barrera59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera59, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 10));

        lblPacman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2.png"))); // NOI18N
        pnlLienzo.add(lblPacman, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 25, 25));

        lblFantasmaAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f4b.png"))); // NOI18N
        pnlLienzo.add(lblFantasmaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 25, 25));

        lblFnatasmaNaranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3b.png"))); // NOI18N
        pnlLienzo.add(lblFnatasmaNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 25, 25));

        lblFantasmaAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f2d.png"))); // NOI18N
        pnlLienzo.add(lblFantasmaAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 25, 25));

        lblFantasmaRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f1d.png"))); // NOI18N
        lblFantasmaRojo.setText("jLabel5");
        pnlLienzo.add(lblFantasmaRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 25, 25));

        lblPastillaT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastillaT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastilla.png"))); // NOI18N
        pnlLienzo.add(lblPastillaT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 30, 30));

        lblPastilla2.setBackground(new java.awt.Color(255, 102, 0));
        lblPastilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 30, 30));

        lblPastillaT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastillaT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastilla.png"))); // NOI18N
        lblPastillaT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlLienzo.add(lblPastillaT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 30, 30));

        lblPastillaT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastillaT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastilla.png"))); // NOI18N
        pnlLienzo.add(lblPastillaT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 30, 30));

        lblPastillaT3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastillaT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastilla.png"))); // NOI18N
        pnlLienzo.add(lblPastillaT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        lblPastilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        lblPastilla14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 30, 30));

        lblPastilla15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 30, 30));

        lblPastilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, 30));

        lblPastilla17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 30, 30));

        lblPastilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 30, 30));

        lblPastilla19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 30, 30));

        lblPastilla20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 30, 30));

        lblPastilla21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 30));

        lblPastilla22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 30));

        lblPastilla23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        lblPastilla24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        lblPastilla25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        lblPastilla26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        lblPastilla27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 30));

        lblPastilla28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, 30));

        lblPastilla29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 30, 30));

        lblPastilla30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        lblPastilla31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 30));

        lblPastilla32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        lblPastilla33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        lblPastilla34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        lblPastilla35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 30));

        lblPastilla36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        lblPastilla37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        lblPastilla38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla38, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        lblPastilla39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));

        lblPastilla40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla40, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        lblPastilla41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla41, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        lblPastilla42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        lblPastilla43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla43, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        lblPastilla44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 30));

        lblPastilla45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        lblPastilla46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla46, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        lblPastilla47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 30, 30));

        lblPastilla48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla48, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 30, 30));

        lblPastilla49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla49, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 30));

        lblPastilla50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 30, 30));

        lblPastilla51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla51, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 30));

        lblPastilla52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla52, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 30, 30));

        lblPastilla53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 30, 30));

        lblPastilla54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla54, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 30, 30));

        lblPastilla55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla55, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 30, 30));

        lblPastilla56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla56, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 30, 30));

        lblPastilla57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla57, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 30, 30));

        lblPastilla58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla58, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        lblPastilla59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla59, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 30, 30));

        lblPastilla60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla60, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 30, 30));

        lblPastilla61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla61, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 30));

        lblPastilla62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla62, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 30, 30));

        lblPastilla65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla65, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 30, 30));

        lblPastilla66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla66, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 30, 30));

        lblPastilla67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla67, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 30, 30));

        lblPastilla68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla68, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 30, 30));

        lblPastilla69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla69, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 30, 30));

        lblPastilla70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla70, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 30, 30));

        lblPastilla71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla71, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 30, 30));

        lblPastilla72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 30, 30));

        lblPastilla73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla73, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 30, 30));

        lblPastilla74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla74, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 30, 30));

        lblPastilla75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla75, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 30, 30));

        lblPastilla76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla76, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 30));

        lblPastilla77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla77, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 30, 30));

        lblPastilla78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla78, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 30, 30));

        lblPastilla79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla79, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 30, 30));

        lblPastilla80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla80, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

        lblPastilla81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla81, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 30, 30));

        lblPastilla82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla82, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 30, 30));

        lblPastilla83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla83, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 30, 30));

        lblPastilla84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla84, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 30, 30));

        lblPastilla85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla85, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 30, 30));

        lblPastilla86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla86, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 30, 30));

        lblPastilla87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla87, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 30, 30));

        lblPastilla88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla88, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 30, 30));

        lblPastilla89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla89, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 30, 30));

        lblPastilla90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla90, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 30, 30));

        lblPastilla91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla91, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 30, 30));

        lblPastilla92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla92, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 30, 30));

        lblPastilla93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla93, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 30, 30));

        lblPastilla94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla94, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 30, 30));

        lblPastilla96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla96, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 30, 30));

        lblPastilla97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla97, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 30, 30));

        lblPastilla98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla98, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 30, 30));

        lblPastilla99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla99, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 30, 30));

        lblPastilla100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla100, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 30, 30));

        lblPastilla101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla101, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 30, 30));

        lblPastilla102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla102, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 30, 30));

        lblPastilla103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla103, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 30, 30));

        lblPastilla104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla104, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 30, 30));

        lblPastilla105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla105, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 30, 30));

        lblPastilla106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla106, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 30, 30));

        lblPastilla107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla107, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 30, 30));

        lblPastilla108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla108, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 30, 30));

        lblPastilla109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla109, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 30, 30));

        lblPastilla110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla110, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 30, 30));

        lblPastilla111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla111, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 30, 30));

        lblPastilla112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla112, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 30, 30));

        lblPastilla113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla113, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 30, 30));

        lblPastilla114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla114, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 30, 30));

        lblPastilla115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla115, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 30, 30));

        lblPastilla116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla116, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 30, 30));

        lblPastilla117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla117, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 30, 30));

        lblPastilla118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla118, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 30, 30));

        lblPastilla119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla119, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 30, 30));

        lblPastilla120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla120, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 30, 30));

        lblPastilla121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla121, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 30, 30));

        lblPastilla122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla122, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 30, 30));

        lblPastilla123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla123, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 30, 30));

        lblPastilla124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla124, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 30, 30));

        lblPastilla125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla125, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 30, 30));

        lblPastilla128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla128, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 30, 30));

        lblPastilla129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla129, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 30, 30));

        lblPastilla130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla130, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 30, 30));

        lblPastilla131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla131, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 30, 30));

        lblPastilla132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla132, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 30, 30));

        lblPastilla133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla133, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 30, 30));

        lblPastilla134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla134, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 30, 30));

        lblPastilla136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla136, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 30, 30));

        lblPastilla137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla137, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 30, 30));

        lblPastilla138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla138, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 30, 30));

        lblPastilla139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla139, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 30, 30));

        lblPastilla140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla140, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 30, 30));

        lblPastilla141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla141, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 30, 30));

        lblPastilla142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla142, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 30, 30));

        lblPastilla143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla143, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 30, 30));

        lblPastilla144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla144, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 30, 30));

        lblPastilla145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla145, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 30, 30));

        lblPastilla146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla146, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 30, 30));

        lblPastilla147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla147, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 30, 30));

        lblPastilla148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla148, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 30, 30));

        lblPastilla149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla149, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 30, 30));

        lblPastilla150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla150, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 30, 30));

        lblPastilla151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla151, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 30, 30));

        lblPastilla152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla152, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 30, 30));

        lblPastilla153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla153, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 30, 30));

        lblPastilla154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla154, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 30, 30));

        lblPastilla155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla155, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 30, 30));

        lblPastilla156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla156, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 30, 30));

        lblPastilla157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla157, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 30, 30));

        lblPastilla158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla158, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 30, 30));

        lblPastilla159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla159, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 30, 30));

        lblPastilla160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla160, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 30, 30));

        lblPastilla161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla161, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 30, 30));

        lblPastilla162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla162, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 30, 30));

        lblPastilla163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla163, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 30, 30));

        lblPastilla164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla164, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 30, 30));

        lblPastilla165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla165, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 30, 30));

        lblPastilla166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla166, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 30, 30));

        lblPastilla167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla167, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 30, 30));

        lblPastilla168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla168, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 30, 30));

        lblPastilla169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla169, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 30, 30));

        lblPastilla170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla170, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 30, 30));

        lblPastilla171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla171, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 30, 30));

        lblPastilla172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla172, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 30, 30));

        lblPastilla173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla173, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 30, 30));

        lblPastilla174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla174, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 30, 30));

        lblPastilla175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla175, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 30, 30));

        lblPastilla176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla176, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 30, 30));

        lblPastilla177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla177, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 30, 30));

        lblPastilla178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla178, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 30, 30));

        lblPastilla179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla179, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 30, 30));

        lblPastilla180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla180, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 30, 30));

        lblPastilla181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla181, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 30, 30));

        lblPastilla182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla182, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 30, 30));

        lblPastilla183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla183, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 30, 30));

        lblPastilla184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla184, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 30, 30));

        lblPastilla185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla185, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 30, 30));

        lblPastilla186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla186, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 30, 30));

        lblPastilla187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla187, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 30, 30));

        lblPastilla188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla188, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 30, 30));

        lblPastilla189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla189, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 30, 30));

        lblPastilla190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla190, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 30, 30));

        lblPastilla191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla191, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 30, 30));

        lblPastilla192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla192, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 30, 30));

        lblPastilla193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla193, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, 30, 30));

        lblPastilla194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla194, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 30, 30));

        lblPastilla195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla195, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 30, 30));

        lblPastilla196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla196, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 30, 30));

        lblPastilla197.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla197, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 30, 30));

        lblPastilla198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla198, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 30, 30));

        lblPastilla199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla199, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 30, 30));

        lblPastilla200.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla200, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 30, 30));

        lblPastilla201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla201, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 30, 30));

        lblPastilla202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla202, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 30, 30));

        lblPastilla203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla203, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 30, 30));

        lblPastilla205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla205, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 30, 30));

        lblPastilla206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla206, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 30, 30));

        lblPastilla207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla207, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 30, 30));

        lblPastilla204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla204, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 30, 30));

        lblPastilla208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla208, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 30, 30));

        lblPastilla209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla209, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 30, 30));

        lblPastilla210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla210, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 30, 30));

        lblPastilla211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla211, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 30, 30));

        lblPastilla212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla212, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 30, 30));

        lblPastilla213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla213, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 30, 30));

        lblPastilla214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla214, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 30, 30));

        lblPastilla215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla215, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 30, 30));

        lblPastilla216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla216, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 30, 30));

        lblPastilla217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla217, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 30, 30));

        lblPastilla218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla218, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 30, 30));

        lblPastilla219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla219, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 30, 30));

        lblPastilla220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla220, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 30, 30));

        lblPastilla221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla221, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 30, 30));

        lblPastilla222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla222, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 30, 30));

        lblPastilla223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla223, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 30, 30));

        lblPastilla224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla224, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 30, 30));

        lblPastilla225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla225.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla225, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 30, 30));

        lblPastilla226.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla226, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 30, 30));

        lblPastilla227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla227, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 30, 30));

        lblPastilla228.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla228, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 30, 30));

        lblPastilla229.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla229, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 30, 30));

        lblPastilla230.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla230, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 30, 30));

        lblPastilla231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla231, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 30));

        lblPastilla232.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla232, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 30, 30));

        lblPastilla233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla233, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 30, 30));

        lblPastilla234.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla234, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 30, 30));

        lblPastilla235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla235, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 30, 30));

        lblPastilla236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla236, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 30, 30));

        lblPastilla237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla237, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 30, 30));

        lblPastilla238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla238.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla238, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 30, 30));

        lblPastilla239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla239, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, 30));

        lblPastilla240.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla240, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 30, 30));

        lblPastilla241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla241, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 30, 30));

        lblPastilla242.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla242.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla242, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 30, 30));

        lblPastilla243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla243, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 30, 30));

        lblPastilla244.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla244, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 30, 30));

        lblPastilla245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla245, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 30, 30));

        lblPastilla247.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla247, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 30, 30));

        lblPastilla249.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla249.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla249, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 30, 30));

        lblPastilla250.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla250, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 30, 30));

        lblPastilla251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla251, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 30, 30));

        lblPastilla252.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla252, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 30, 30));

        lblPastilla253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla253.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla253, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 30, 30));

        lblPastilla254.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla254.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla254, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 30, 30));

        lblPastilla255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla255, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 30, 30));

        lblPastilla256.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla256, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 30, 30));

        lblPastilla257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla257.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla257, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 30, 30));

        lblPastilla258.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla258, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 30, 30));

        lblPastilla259.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla259.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla259, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 30, 30));

        lblPastilla260.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla260.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla260, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 30, 30));

        lblPastilla261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla261, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 30, 30));

        lblPastilla262.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla262.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla262, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 30, 30));

        lblPastilla263.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla263, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 30, 30));

        lblPastilla264.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla264.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla264, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 30, 30));

        barrera60.setBackground(new java.awt.Color(0, 102, 204));
        barrera60.setName(""); // NOI18N

        javax.swing.GroupLayout barrera60Layout = new javax.swing.GroupLayout(barrera60);
        barrera60.setLayout(barrera60Layout);
        barrera60Layout.setHorizontalGroup(
            barrera60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera60Layout.setVerticalGroup(
            barrera60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 30, -1));

        lblPastilla246.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla246.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla246, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 30, 30));

        lblPastilla265.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla265, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 30, 30));

        lblPastilla266.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla266.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla266, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 30, 30));

        lblPastilla267.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla267.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla267, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 30, 30));

        lblPastilla268.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla268.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla268, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 30, 30));

        lblPastilla269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla269.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla269, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 30, 30));

        lblPastilla270.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla270, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 30, 30));

        lblPastilla271.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla271.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla271, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 30, 30));

        lblPastilla272.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla272, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 30, 30));

        lblPastilla273.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla273.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla273, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 30, 30));

        lblPastilla274.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla274.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla274, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 30));

        lblPastilla275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla275.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla275, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 30, 30));

        lblPastilla276.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla276.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla276, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 30, 30));

        lblPastilla277.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla277, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 30, 30));

        lblPastilla278.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla278.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla278, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 30, 30));

        lblPastilla279.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla279, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 30, 30));

        lblPastilla280.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla280.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla280, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 30, 30));

        lblPastilla281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla281, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 30, 30));

        lblPastilla282.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla282.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla282, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 30, 30));

        lblPastilla283.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla283.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla283, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 30, 30));

        lblPastilla284.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla284.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla284, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, 30));

        lblPastilla285.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla285.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla285, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 30, 30));

        lblPastilla286.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla286, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));

        lblPastilla287.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla287.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla287, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 30));

        lblPastilla95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla95, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 30, 30));

        lblPastilla63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 30, 30));

        lblPastilla64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 30));

        lblPastilla126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla126, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 30, 30));

        lblPastilla127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla127, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 30, 30));

        lblPastilla135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla135, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 30, 30));

        barrera61.setBackground(new java.awt.Color(0, 102, 204));
        barrera61.setName(""); // NOI18N

        javax.swing.GroupLayout barrera61Layout = new javax.swing.GroupLayout(barrera61);
        barrera61.setLayout(barrera61Layout);
        barrera61Layout.setHorizontalGroup(
            barrera61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        barrera61Layout.setVerticalGroup(
            barrera61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 20));

        barrera62.setBackground(new java.awt.Color(0, 102, 204));
        barrera62.setName(""); // NOI18N

        javax.swing.GroupLayout barrera62Layout = new javax.swing.GroupLayout(barrera62);
        barrera62.setLayout(barrera62Layout);
        barrera62Layout.setHorizontalGroup(
            barrera62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera62Layout.setVerticalGroup(
            barrera62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera62, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 30, 70));

        barrera63.setBackground(new java.awt.Color(0, 102, 204));
        barrera63.setName(""); // NOI18N

        javax.swing.GroupLayout barrera63Layout = new javax.swing.GroupLayout(barrera63);
        barrera63.setLayout(barrera63Layout);
        barrera63Layout.setHorizontalGroup(
            barrera63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        barrera63Layout.setVerticalGroup(
            barrera63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnlLienzo.add(barrera63, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 30, 70));

        lblPastilla248.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastilla248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto.png"))); // NOI18N
        pnlLienzo.add(lblPastilla248, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, 30));

        jPanel1.add(pnlLienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 650));

        bprogress.setBackground(new java.awt.Color(51, 51, 51));
        bprogress.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        bprogress.setForeground(new java.awt.Color(0, 51, 153));
        bprogress.setStringPainted(true);
        jPanel1.add(bprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 240, 20));

        btnReinicio.setBackground(new java.awt.Color(0, 51, 102));
        btnReinicio.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnReinicio.setForeground(new java.awt.Color(255, 255, 255));
        btnReinicio.setText("Reiniciar");
        btnReinicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnReinicio.setContentAreaFilled(false);
        btnReinicio.setOpaque(true);
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnReinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, 130, 30));

        btnStop.setBackground(new java.awt.Color(0, 51, 102));
        btnStop.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setText("Stop");
        btnStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnStop.setContentAreaFilled(false);
        btnStop.setOpaque(true);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel1.add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 50, 30));

        lblVidas.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblVidas.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(lblVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 50, 20));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vidas: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 60, 20));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Recompensa en: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 110, 20));

        lblPuntaje.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(lblPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 60, 20));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Puntaje:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 60, 20));

        btnInicio.setBackground(new java.awt.Color(0, 51, 102));
        btnInicio.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Empezar");
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnInicio.setContentAreaFilled(false);
        btnInicio.setOpaque(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 70, 30));

        bprogressPastilla.setForeground(new java.awt.Color(0, 0, 102));
        bprogressPastilla.setToolTipText("");
        bprogressPastilla.setValue(0);
        bprogressPastilla.setBorderPainted(false);
        bprogressPastilla.setColorText(new java.awt.Color(204, 204, 204));
        bprogressPastilla.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        jPanel1.add(bprogressPastilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 60, 40));

        getContentPane().add(jPanel1);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(11, 0));

        jMenu1.setText("Movimientos");

        menuArriba.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0));
        menuArriba.setText("Arriba");
        menuArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArribaActionPerformed(evt);
            }
        });
        jMenu1.add(menuArriba);

        menuAbajo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, 0));
        menuAbajo.setText("Abajo");
        menuAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbajoActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbajo);

        menuDerecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, 0));
        menuDerecha.setText("Derecha");
        menuDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDerechaActionPerformed(evt);
            }
        });
        jMenu1.add(menuDerecha);

        menuIzquierda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0));
        menuIzquierda.setText("Izquierda");
        menuIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIzquierdaActionPerformed(evt);
            }
        });
        jMenu1.add(menuIzquierda);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDerechaActionPerformed
        // TODO add your handling code here:
        pc.accionBotonDerecha();
    }//GEN-LAST:event_menuDerechaActionPerformed

    private void menuArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArribaActionPerformed
        // TODO add your handling code here:
        pc.accionBotonSubir();
    }//GEN-LAST:event_menuArribaActionPerformed

    private void menuAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbajoActionPerformed
        // TODO add your handling code here:
        pc.accionBotonBajar();
    }//GEN-LAST:event_menuAbajoActionPerformed

    private void menuIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIzquierdaActionPerformed
        // TODO add your handling code here:
        pc.accionBotonIzquierda();
    }//GEN-LAST:event_menuIzquierdaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        if (clip.isOpen()) {
            clip.close();
            sonidoFondo(comeCome);
        }
        pc.accionBotonInicio(btnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        // TODO add your handling code here:

        if (clip.isOpen()) {
            clip.close();
            sonidoFondo(sonidoInicial);
        }
        pc.accionBotonReinicio();
    }//GEN-LAST:event_btnReinicioActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed

        if (clip.isOpen()) {
            clip.close();
            sonidoFondo(sonidoInicial);
        }

        pc.accionBotonStop();
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazPacman().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrera1;
    private javax.swing.JPanel barrera12;
    private javax.swing.JPanel barrera13;
    private javax.swing.JPanel barrera14;
    private javax.swing.JPanel barrera15;
    private javax.swing.JPanel barrera16;
    private javax.swing.JPanel barrera17;
    private javax.swing.JPanel barrera18;
    private javax.swing.JPanel barrera19;
    private javax.swing.JPanel barrera2;
    private javax.swing.JPanel barrera20;
    private javax.swing.JPanel barrera21;
    private javax.swing.JPanel barrera22;
    private javax.swing.JPanel barrera23;
    private javax.swing.JPanel barrera24;
    private javax.swing.JPanel barrera25;
    private javax.swing.JPanel barrera26;
    private javax.swing.JPanel barrera27;
    private javax.swing.JPanel barrera28;
    private javax.swing.JPanel barrera29;
    private javax.swing.JPanel barrera30;
    private javax.swing.JPanel barrera31;
    private javax.swing.JPanel barrera32;
    private javax.swing.JPanel barrera33;
    private javax.swing.JPanel barrera34;
    private javax.swing.JPanel barrera35;
    private javax.swing.JPanel barrera36;
    private javax.swing.JPanel barrera37;
    private javax.swing.JPanel barrera38;
    private javax.swing.JPanel barrera39;
    private javax.swing.JPanel barrera4;
    private javax.swing.JPanel barrera40;
    private javax.swing.JPanel barrera41;
    private javax.swing.JPanel barrera43;
    private javax.swing.JPanel barrera44;
    private javax.swing.JPanel barrera45;
    private javax.swing.JPanel barrera46;
    private javax.swing.JPanel barrera47;
    private javax.swing.JPanel barrera48;
    private javax.swing.JPanel barrera49;
    private javax.swing.JPanel barrera5;
    private javax.swing.JPanel barrera50;
    private javax.swing.JPanel barrera51;
    private javax.swing.JPanel barrera52;
    private javax.swing.JPanel barrera53;
    private javax.swing.JPanel barrera54;
    private javax.swing.JPanel barrera55;
    private javax.swing.JPanel barrera56;
    private javax.swing.JPanel barrera57;
    private javax.swing.JPanel barrera58;
    private javax.swing.JPanel barrera59;
    private javax.swing.JPanel barrera6;
    private javax.swing.JPanel barrera60;
    private javax.swing.JPanel barrera61;
    private javax.swing.JPanel barrera62;
    private javax.swing.JPanel barrera63;
    private javax.swing.JPanel barrera7;
    private javax.swing.JPanel barrera8;
    private javax.swing.JPanel barrera9;
    private javax.swing.JProgressBar bprogress;
    private rojerusan.componentes.RSProgressCircle bprogressPastilla;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnStop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFantasmaAmarillo;
    private javax.swing.JLabel lblFantasmaAzul;
    private javax.swing.JLabel lblFantasmaRojo;
    private javax.swing.JLabel lblFnatasmaNaranja;
    private javax.swing.JLabel lblPacman;
    private javax.swing.JLabel lblPastilla100;
    private javax.swing.JLabel lblPastilla101;
    private javax.swing.JLabel lblPastilla102;
    private javax.swing.JLabel lblPastilla103;
    private javax.swing.JLabel lblPastilla104;
    private javax.swing.JLabel lblPastilla105;
    private javax.swing.JLabel lblPastilla106;
    private javax.swing.JLabel lblPastilla107;
    private javax.swing.JLabel lblPastilla108;
    private javax.swing.JLabel lblPastilla109;
    private javax.swing.JLabel lblPastilla110;
    private javax.swing.JLabel lblPastilla111;
    private javax.swing.JLabel lblPastilla112;
    private javax.swing.JLabel lblPastilla113;
    private javax.swing.JLabel lblPastilla114;
    private javax.swing.JLabel lblPastilla115;
    private javax.swing.JLabel lblPastilla116;
    private javax.swing.JLabel lblPastilla117;
    private javax.swing.JLabel lblPastilla118;
    private javax.swing.JLabel lblPastilla119;
    private javax.swing.JLabel lblPastilla120;
    private javax.swing.JLabel lblPastilla121;
    private javax.swing.JLabel lblPastilla122;
    private javax.swing.JLabel lblPastilla123;
    private javax.swing.JLabel lblPastilla124;
    private javax.swing.JLabel lblPastilla125;
    private javax.swing.JLabel lblPastilla126;
    private javax.swing.JLabel lblPastilla127;
    private javax.swing.JLabel lblPastilla128;
    private javax.swing.JLabel lblPastilla129;
    private javax.swing.JLabel lblPastilla130;
    private javax.swing.JLabel lblPastilla131;
    private javax.swing.JLabel lblPastilla132;
    private javax.swing.JLabel lblPastilla133;
    private javax.swing.JLabel lblPastilla134;
    private javax.swing.JLabel lblPastilla135;
    private javax.swing.JLabel lblPastilla136;
    private javax.swing.JLabel lblPastilla137;
    private javax.swing.JLabel lblPastilla138;
    private javax.swing.JLabel lblPastilla139;
    private javax.swing.JLabel lblPastilla14;
    private javax.swing.JLabel lblPastilla140;
    private javax.swing.JLabel lblPastilla141;
    private javax.swing.JLabel lblPastilla142;
    private javax.swing.JLabel lblPastilla143;
    private javax.swing.JLabel lblPastilla144;
    private javax.swing.JLabel lblPastilla145;
    private javax.swing.JLabel lblPastilla146;
    private javax.swing.JLabel lblPastilla147;
    private javax.swing.JLabel lblPastilla148;
    private javax.swing.JLabel lblPastilla149;
    private javax.swing.JLabel lblPastilla15;
    private javax.swing.JLabel lblPastilla150;
    private javax.swing.JLabel lblPastilla151;
    private javax.swing.JLabel lblPastilla152;
    private javax.swing.JLabel lblPastilla153;
    private javax.swing.JLabel lblPastilla154;
    private javax.swing.JLabel lblPastilla155;
    private javax.swing.JLabel lblPastilla156;
    private javax.swing.JLabel lblPastilla157;
    private javax.swing.JLabel lblPastilla158;
    private javax.swing.JLabel lblPastilla159;
    private javax.swing.JLabel lblPastilla16;
    private javax.swing.JLabel lblPastilla160;
    private javax.swing.JLabel lblPastilla161;
    private javax.swing.JLabel lblPastilla162;
    private javax.swing.JLabel lblPastilla163;
    private javax.swing.JLabel lblPastilla164;
    private javax.swing.JLabel lblPastilla165;
    private javax.swing.JLabel lblPastilla166;
    private javax.swing.JLabel lblPastilla167;
    private javax.swing.JLabel lblPastilla168;
    private javax.swing.JLabel lblPastilla169;
    private javax.swing.JLabel lblPastilla17;
    private javax.swing.JLabel lblPastilla170;
    private javax.swing.JLabel lblPastilla171;
    private javax.swing.JLabel lblPastilla172;
    private javax.swing.JLabel lblPastilla173;
    private javax.swing.JLabel lblPastilla174;
    private javax.swing.JLabel lblPastilla175;
    private javax.swing.JLabel lblPastilla176;
    private javax.swing.JLabel lblPastilla177;
    private javax.swing.JLabel lblPastilla178;
    private javax.swing.JLabel lblPastilla179;
    private javax.swing.JLabel lblPastilla18;
    private javax.swing.JLabel lblPastilla180;
    private javax.swing.JLabel lblPastilla181;
    private javax.swing.JLabel lblPastilla182;
    private javax.swing.JLabel lblPastilla183;
    private javax.swing.JLabel lblPastilla184;
    private javax.swing.JLabel lblPastilla185;
    private javax.swing.JLabel lblPastilla186;
    private javax.swing.JLabel lblPastilla187;
    private javax.swing.JLabel lblPastilla188;
    private javax.swing.JLabel lblPastilla189;
    private javax.swing.JLabel lblPastilla19;
    private javax.swing.JLabel lblPastilla190;
    private javax.swing.JLabel lblPastilla191;
    private javax.swing.JLabel lblPastilla192;
    private javax.swing.JLabel lblPastilla193;
    private javax.swing.JLabel lblPastilla194;
    private javax.swing.JLabel lblPastilla195;
    private javax.swing.JLabel lblPastilla196;
    private javax.swing.JLabel lblPastilla197;
    private javax.swing.JLabel lblPastilla198;
    private javax.swing.JLabel lblPastilla199;
    private javax.swing.JLabel lblPastilla2;
    private javax.swing.JLabel lblPastilla20;
    private javax.swing.JLabel lblPastilla200;
    private javax.swing.JLabel lblPastilla201;
    private javax.swing.JLabel lblPastilla202;
    private javax.swing.JLabel lblPastilla203;
    private javax.swing.JLabel lblPastilla204;
    private javax.swing.JLabel lblPastilla205;
    private javax.swing.JLabel lblPastilla206;
    private javax.swing.JLabel lblPastilla207;
    private javax.swing.JLabel lblPastilla208;
    private javax.swing.JLabel lblPastilla209;
    private javax.swing.JLabel lblPastilla21;
    private javax.swing.JLabel lblPastilla210;
    private javax.swing.JLabel lblPastilla211;
    private javax.swing.JLabel lblPastilla212;
    private javax.swing.JLabel lblPastilla213;
    private javax.swing.JLabel lblPastilla214;
    private javax.swing.JLabel lblPastilla215;
    private javax.swing.JLabel lblPastilla216;
    private javax.swing.JLabel lblPastilla217;
    private javax.swing.JLabel lblPastilla218;
    private javax.swing.JLabel lblPastilla219;
    private javax.swing.JLabel lblPastilla22;
    private javax.swing.JLabel lblPastilla220;
    private javax.swing.JLabel lblPastilla221;
    private javax.swing.JLabel lblPastilla222;
    private javax.swing.JLabel lblPastilla223;
    private javax.swing.JLabel lblPastilla224;
    private javax.swing.JLabel lblPastilla225;
    private javax.swing.JLabel lblPastilla226;
    private javax.swing.JLabel lblPastilla227;
    private javax.swing.JLabel lblPastilla228;
    private javax.swing.JLabel lblPastilla229;
    private javax.swing.JLabel lblPastilla23;
    private javax.swing.JLabel lblPastilla230;
    private javax.swing.JLabel lblPastilla231;
    private javax.swing.JLabel lblPastilla232;
    private javax.swing.JLabel lblPastilla233;
    private javax.swing.JLabel lblPastilla234;
    private javax.swing.JLabel lblPastilla235;
    private javax.swing.JLabel lblPastilla236;
    private javax.swing.JLabel lblPastilla237;
    private javax.swing.JLabel lblPastilla238;
    private javax.swing.JLabel lblPastilla239;
    private javax.swing.JLabel lblPastilla24;
    private javax.swing.JLabel lblPastilla240;
    private javax.swing.JLabel lblPastilla241;
    private javax.swing.JLabel lblPastilla242;
    private javax.swing.JLabel lblPastilla243;
    private javax.swing.JLabel lblPastilla244;
    private javax.swing.JLabel lblPastilla245;
    private javax.swing.JLabel lblPastilla246;
    private javax.swing.JLabel lblPastilla247;
    private javax.swing.JLabel lblPastilla248;
    private javax.swing.JLabel lblPastilla249;
    private javax.swing.JLabel lblPastilla25;
    private javax.swing.JLabel lblPastilla250;
    private javax.swing.JLabel lblPastilla251;
    private javax.swing.JLabel lblPastilla252;
    private javax.swing.JLabel lblPastilla253;
    private javax.swing.JLabel lblPastilla254;
    private javax.swing.JLabel lblPastilla255;
    private javax.swing.JLabel lblPastilla256;
    private javax.swing.JLabel lblPastilla257;
    private javax.swing.JLabel lblPastilla258;
    private javax.swing.JLabel lblPastilla259;
    private javax.swing.JLabel lblPastilla26;
    private javax.swing.JLabel lblPastilla260;
    private javax.swing.JLabel lblPastilla261;
    private javax.swing.JLabel lblPastilla262;
    private javax.swing.JLabel lblPastilla263;
    private javax.swing.JLabel lblPastilla264;
    private javax.swing.JLabel lblPastilla265;
    private javax.swing.JLabel lblPastilla266;
    private javax.swing.JLabel lblPastilla267;
    private javax.swing.JLabel lblPastilla268;
    private javax.swing.JLabel lblPastilla269;
    private javax.swing.JLabel lblPastilla27;
    private javax.swing.JLabel lblPastilla270;
    private javax.swing.JLabel lblPastilla271;
    private javax.swing.JLabel lblPastilla272;
    private javax.swing.JLabel lblPastilla273;
    private javax.swing.JLabel lblPastilla274;
    private javax.swing.JLabel lblPastilla275;
    private javax.swing.JLabel lblPastilla276;
    private javax.swing.JLabel lblPastilla277;
    private javax.swing.JLabel lblPastilla278;
    private javax.swing.JLabel lblPastilla279;
    private javax.swing.JLabel lblPastilla28;
    private javax.swing.JLabel lblPastilla280;
    private javax.swing.JLabel lblPastilla281;
    private javax.swing.JLabel lblPastilla282;
    private javax.swing.JLabel lblPastilla283;
    private javax.swing.JLabel lblPastilla284;
    private javax.swing.JLabel lblPastilla285;
    private javax.swing.JLabel lblPastilla286;
    private javax.swing.JLabel lblPastilla287;
    private javax.swing.JLabel lblPastilla29;
    private javax.swing.JLabel lblPastilla30;
    private javax.swing.JLabel lblPastilla31;
    private javax.swing.JLabel lblPastilla32;
    private javax.swing.JLabel lblPastilla33;
    private javax.swing.JLabel lblPastilla34;
    private javax.swing.JLabel lblPastilla35;
    private javax.swing.JLabel lblPastilla36;
    private javax.swing.JLabel lblPastilla37;
    private javax.swing.JLabel lblPastilla38;
    private javax.swing.JLabel lblPastilla39;
    private javax.swing.JLabel lblPastilla40;
    private javax.swing.JLabel lblPastilla41;
    private javax.swing.JLabel lblPastilla42;
    private javax.swing.JLabel lblPastilla43;
    private javax.swing.JLabel lblPastilla44;
    private javax.swing.JLabel lblPastilla45;
    private javax.swing.JLabel lblPastilla46;
    private javax.swing.JLabel lblPastilla47;
    private javax.swing.JLabel lblPastilla48;
    private javax.swing.JLabel lblPastilla49;
    private javax.swing.JLabel lblPastilla50;
    private javax.swing.JLabel lblPastilla51;
    private javax.swing.JLabel lblPastilla52;
    private javax.swing.JLabel lblPastilla53;
    private javax.swing.JLabel lblPastilla54;
    private javax.swing.JLabel lblPastilla55;
    private javax.swing.JLabel lblPastilla56;
    private javax.swing.JLabel lblPastilla57;
    private javax.swing.JLabel lblPastilla58;
    private javax.swing.JLabel lblPastilla59;
    private javax.swing.JLabel lblPastilla60;
    private javax.swing.JLabel lblPastilla61;
    private javax.swing.JLabel lblPastilla62;
    private javax.swing.JLabel lblPastilla63;
    private javax.swing.JLabel lblPastilla64;
    private javax.swing.JLabel lblPastilla65;
    private javax.swing.JLabel lblPastilla66;
    private javax.swing.JLabel lblPastilla67;
    private javax.swing.JLabel lblPastilla68;
    private javax.swing.JLabel lblPastilla69;
    private javax.swing.JLabel lblPastilla7;
    private javax.swing.JLabel lblPastilla70;
    private javax.swing.JLabel lblPastilla71;
    private javax.swing.JLabel lblPastilla72;
    private javax.swing.JLabel lblPastilla73;
    private javax.swing.JLabel lblPastilla74;
    private javax.swing.JLabel lblPastilla75;
    private javax.swing.JLabel lblPastilla76;
    private javax.swing.JLabel lblPastilla77;
    private javax.swing.JLabel lblPastilla78;
    private javax.swing.JLabel lblPastilla79;
    private javax.swing.JLabel lblPastilla80;
    private javax.swing.JLabel lblPastilla81;
    private javax.swing.JLabel lblPastilla82;
    private javax.swing.JLabel lblPastilla83;
    private javax.swing.JLabel lblPastilla84;
    private javax.swing.JLabel lblPastilla85;
    private javax.swing.JLabel lblPastilla86;
    private javax.swing.JLabel lblPastilla87;
    private javax.swing.JLabel lblPastilla88;
    private javax.swing.JLabel lblPastilla89;
    private javax.swing.JLabel lblPastilla90;
    private javax.swing.JLabel lblPastilla91;
    private javax.swing.JLabel lblPastilla92;
    private javax.swing.JLabel lblPastilla93;
    private javax.swing.JLabel lblPastilla94;
    private javax.swing.JLabel lblPastilla95;
    private javax.swing.JLabel lblPastilla96;
    private javax.swing.JLabel lblPastilla97;
    private javax.swing.JLabel lblPastilla98;
    private javax.swing.JLabel lblPastilla99;
    private javax.swing.JLabel lblPastillaT1;
    private javax.swing.JLabel lblPastillaT2;
    private javax.swing.JLabel lblPastillaT3;
    private javax.swing.JLabel lblPastillaT4;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JMenuItem menuAbajo;
    private javax.swing.JMenuItem menuArriba;
    private javax.swing.JMenuItem menuDerecha;
    private javax.swing.JMenuItem menuIzquierda;
    private javax.swing.JPanel pnlLienzo;
    // End of variables declaration//GEN-END:variables
  public static void sonidos(final String sonido) {
        new Thread(() -> {
            try {
                clipFondo = AudioSystem.getClip();
                clipFondo.open(AudioSystem.getAudioInputStream(ClassLoader.getSystemResource(sonido)));
                clipFondo.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                Mensaje.error(null, "Ups! ha ocurrido un error \n" + e.getMessage());
            }
        } // The wrapper thread is unnecessary, unless it blocks on the
        // Clip finishing; see comments.
        ).start();
    }

    public static void sonidoFondo(String efecto) {
        try {
            clip = AudioSystem.getClip();

            clip.open(AudioSystem.getAudioInputStream(ClassLoader.getSystemResource(efecto)));
            clip.start();
            clip.loop(1000);
            if (!clip.isOpen()) {
                sonidoFondo(efecto);
            }
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            Mensaje.error(null, "Ups! ha ocurrido un error \n" + e.getMessage());
        }
    }
}
