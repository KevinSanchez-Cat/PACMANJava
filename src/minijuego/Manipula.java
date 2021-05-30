package minijuego;

import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import static minijuego.Pacman.fantasma1;
import static minijuego.Pacman.fantasma2;
import static minijuego.Pacman.fantasma3;
import static minijuego.Pacman.fantasma4;
import static minijuego.Pacman.hF;
import static minijuego.Pacman.hT;

/**
 *
 * @author kevin2
 */
public class Manipula {

    /**
     *
     * @param jf
     * @param pacman
     */
    public static void topePatilla(InterfazPacman jf, JLabel pacman) {
        metodoPastillaPuntos(jf, pacman,
                jf.getLblPastilla100(),
                jf.getLblPastilla101(),
                jf.getLblPastilla102(),
                jf.getLblPastilla103(),
                jf.getLblPastilla104(),
                jf.getLblPastilla105(),
                jf.getLblPastilla106(),
                jf.getLblPastilla107(),
                jf.getLblPastilla108(),
                jf.getLblPastilla109(),
                jf.getLblPastilla110(),
                jf.getLblPastilla111(),
                jf.getLblPastilla112(),
                jf.getLblPastilla113(),
                jf.getLblPastilla114(),
                jf.getLblPastilla115(),
                jf.getLblPastilla116(),
                jf.getLblPastilla117(),
                jf.getLblPastilla118(),
                jf.getLblPastilla119(),
                jf.getLblPastilla120(),
                jf.getLblPastilla121(),
                jf.getLblPastilla122(),
                jf.getLblPastilla123(),
                jf.getLblPastilla124(),
                jf.getLblPastilla125(),
                jf.getLblPastilla126(),
                jf.getLblPastilla127(),
                jf.getLblPastilla128(),
                jf.getLblPastilla129(),
                jf.getLblPastilla130(),
                jf.getLblPastilla131(),
                jf.getLblPastilla132(),
                jf.getLblPastilla133(),
                jf.getLblPastilla134(),
                jf.getLblPastilla135(),
                jf.getLblPastilla136(),
                jf.getLblPastilla137(),
                jf.getLblPastilla138(),
                jf.getLblPastilla139(),
                jf.getLblPastilla14(),
                jf.getLblPastilla140(),
                jf.getLblPastilla141(),
                jf.getLblPastilla142(),
                jf.getLblPastilla143(),
                jf.getLblPastilla144(),
                jf.getLblPastilla145(),
                jf.getLblPastilla146(),
                jf.getLblPastilla147(),
                jf.getLblPastilla148(),
                jf.getLblPastilla149(),
                jf.getLblPastilla15(),
                jf.getLblPastilla150(),
                jf.getLblPastilla151(),
                jf.getLblPastilla152(),
                jf.getLblPastilla153(),
                jf.getLblPastilla154(),
                jf.getLblPastilla155(),
                jf.getLblPastilla156(),
                jf.getLblPastilla157(),
                jf.getLblPastilla158(),
                jf.getLblPastilla159(),
                jf.getLblPastilla16(),
                jf.getLblPastilla160(),
                jf.getLblPastilla161(),
                jf.getLblPastilla162(),
                jf.getLblPastilla163(),
                jf.getLblPastilla164(),
                jf.getLblPastilla165(),
                jf.getLblPastilla166(),
                jf.getLblPastilla167(),
                jf.getLblPastilla168(),
                jf.getLblPastilla169(),
                jf.getLblPastilla17(),
                jf.getLblPastilla170(),
                jf.getLblPastilla171(),
                jf.getLblPastilla172(),
                jf.getLblPastilla173(),
                jf.getLblPastilla174(),
                jf.getLblPastilla175(),
                jf.getLblPastilla176(),
                jf.getLblPastilla177(),
                jf.getLblPastilla178(),
                jf.getLblPastilla179(),
                jf.getLblPastilla18(),
                jf.getLblPastilla180(),
                jf.getLblPastilla181(),
                jf.getLblPastilla182(),
                jf.getLblPastilla183(),
                jf.getLblPastilla184(),
                jf.getLblPastilla185(),
                jf.getLblPastilla186(),
                jf.getLblPastilla187(),
                jf.getLblPastilla188(),
                jf.getLblPastilla189(),
                jf.getLblPastilla19(),
                jf.getLblPastilla190(),
                jf.getLblPastilla191(),
                jf.getLblPastilla192(),
                jf.getLblPastilla193(),
                jf.getLblPastilla194(),
                jf.getLblPastilla195(),
                jf.getLblPastilla196(),
                jf.getLblPastilla197(),
                jf.getLblPastilla198(),
                jf.getLblPastilla199(),
                jf.getLblPastilla2(),
                jf.getLblPastilla20(),
                jf.getLblPastilla200(),
                jf.getLblPastilla201(),
                jf.getLblPastilla202(),
                jf.getLblPastilla203(),
                jf.getLblPastilla204(),
                jf.getLblPastilla205(),
                jf.getLblPastilla206(),
                jf.getLblPastilla207(),
                jf.getLblPastilla208(),
                jf.getLblPastilla209(),
                jf.getLblPastilla21(),
                jf.getLblPastilla210(),
                jf.getLblPastilla211(),
                jf.getLblPastilla212(),
                jf.getLblPastilla213(),
                jf.getLblPastilla214(),
                jf.getLblPastilla215(),
                jf.getLblPastilla216(),
                jf.getLblPastilla217(),
                jf.getLblPastilla218(),
                jf.getLblPastilla219(),
                jf.getLblPastilla22(),
                jf.getLblPastilla220(),
                jf.getLblPastilla221(),
                jf.getLblPastilla222(),
                jf.getLblPastilla223(),
                jf.getLblPastilla224(),
                jf.getLblPastilla225(),
                jf.getLblPastilla226(),
                jf.getLblPastilla227(),
                jf.getLblPastilla228(),
                jf.getLblPastilla229(),
                jf.getLblPastilla23(),
                jf.getLblPastilla230(),
                jf.getLblPastilla231(),
                jf.getLblPastilla232(),
                jf.getLblPastilla233(),
                jf.getLblPastilla234(),
                jf.getLblPastilla235(),
                jf.getLblPastilla236(),
                jf.getLblPastilla237(),
                jf.getLblPastilla238(),
                jf.getLblPastilla239(),
                jf.getLblPastilla24(),
                jf.getLblPastilla240(),
                jf.getLblPastilla241(),
                jf.getLblPastilla242(),
                jf.getLblPastilla243(),
                jf.getLblPastilla244(),
                jf.getLblPastilla245(),
                jf.getLblPastilla246(),
                jf.getLblPastilla247(),
                jf.getLblPastilla248(),
                jf.getLblPastilla249(),
                jf.getLblPastilla25(),
                jf.getLblPastilla250(),
                jf.getLblPastilla251(),
                jf.getLblPastilla252(),
                jf.getLblPastilla253(),
                jf.getLblPastilla254(),
                jf.getLblPastilla255(),
                jf.getLblPastilla256(),
                jf.getLblPastilla257(),
                jf.getLblPastilla258(),
                jf.getLblPastilla259(),
                jf.getLblPastilla26(),
                jf.getLblPastilla260(),
                jf.getLblPastilla261(),
                jf.getLblPastilla262(),
                jf.getLblPastilla263(),
                jf.getLblPastilla264(),
                jf.getLblPastilla265(),
                jf.getLblPastilla266(),
                jf.getLblPastilla267(),
                jf.getLblPastilla268(),
                jf.getLblPastilla269(),
                jf.getLblPastilla27(),
                jf.getLblPastilla270(),
                jf.getLblPastilla271(),
                jf.getLblPastilla272(),
                jf.getLblPastilla273(),
                jf.getLblPastilla274(),
                jf.getLblPastilla275(),
                jf.getLblPastilla276(),
                jf.getLblPastilla277(),
                jf.getLblPastilla278(),
                jf.getLblPastilla279(),
                jf.getLblPastilla28(),
                jf.getLblPastilla280(),
                jf.getLblPastilla281(),
                jf.getLblPastilla282(),
                jf.getLblPastilla283(),
                jf.getLblPastilla284(),
                jf.getLblPastilla285(),
                jf.getLblPastilla286(),
                jf.getLblPastilla287(),
                jf.getLblPastilla29(),
                jf.getLblPastilla30(),
                jf.getLblPastilla31(),
                jf.getLblPastilla32(),
                jf.getLblPastilla33(),
                jf.getLblPastilla34(),
                jf.getLblPastilla35(),
                jf.getLblPastilla36(),
                jf.getLblPastilla37(),
                jf.getLblPastilla38(),
                jf.getLblPastilla39(),
                jf.getLblPastilla40(),
                jf.getLblPastilla41(),
                jf.getLblPastilla42(),
                jf.getLblPastilla43(),
                jf.getLblPastilla44(),
                jf.getLblPastilla45(),
                jf.getLblPastilla46(),
                jf.getLblPastilla47(),
                jf.getLblPastilla48(),
                jf.getLblPastilla49(),
                jf.getLblPastilla50(),
                jf.getLblPastilla51(),
                jf.getLblPastilla52(),
                jf.getLblPastilla53(),
                jf.getLblPastilla54(),
                jf.getLblPastilla55(),
                jf.getLblPastilla56(),
                jf.getLblPastilla57(),
                jf.getLblPastilla58(),
                jf.getLblPastilla59(),
                jf.getLblPastilla60(),
                jf.getLblPastilla61(),
                jf.getLblPastilla62(),
                jf.getLblPastilla63(),
                jf.getLblPastilla64(),
                jf.getLblPastilla65(),
                jf.getLblPastilla66(),
                jf.getLblPastilla67(),
                jf.getLblPastilla68(),
                jf.getLblPastilla69(),
                jf.getLblPastilla7(),
                jf.getLblPastilla70(),
                jf.getLblPastilla71(),
                jf.getLblPastilla72(),
                jf.getLblPastilla73(),
                jf.getLblPastilla74(),
                jf.getLblPastilla75(),
                jf.getLblPastilla76(),
                jf.getLblPastilla77(),
                jf.getLblPastilla78(),
                jf.getLblPastilla79(),
                jf.getLblPastilla80(),
                jf.getLblPastilla81(),
                jf.getLblPastilla82(),
                jf.getLblPastilla83(),
                jf.getLblPastilla84(),
                jf.getLblPastilla85(),
                jf.getLblPastilla86(),
                jf.getLblPastilla87(),
                jf.getLblPastilla88(),
                jf.getLblPastilla89(),
                jf.getLblPastilla90(),
                jf.getLblPastilla91(),
                jf.getLblPastilla92(),
                jf.getLblPastilla93(),
                jf.getLblPastilla94(),
                jf.getLblPastilla95(),
                jf.getLblPastilla96(),
                jf.getLblPastilla97(),
                jf.getLblPastilla98(),
                jf.getLblPastilla99()
        );
    }

    public static void visualizaPatilla(InterfazPacman jf) {
        metodoPastillaVisualizaTodos(jf,
                jf.getLblPastilla100(),
                jf.getLblPastilla101(),
                jf.getLblPastilla102(),
                jf.getLblPastilla103(),
                jf.getLblPastilla104(),
                jf.getLblPastilla105(),
                jf.getLblPastilla106(),
                jf.getLblPastilla107(),
                jf.getLblPastilla108(),
                jf.getLblPastilla109(),
                jf.getLblPastilla110(),
                jf.getLblPastilla111(),
                jf.getLblPastilla112(),
                jf.getLblPastilla113(),
                jf.getLblPastilla114(),
                jf.getLblPastilla115(),
                jf.getLblPastilla116(),
                jf.getLblPastilla117(),
                jf.getLblPastilla118(),
                jf.getLblPastilla119(),
                jf.getLblPastilla120(),
                jf.getLblPastilla121(),
                jf.getLblPastilla122(),
                jf.getLblPastilla123(),
                jf.getLblPastilla124(),
                jf.getLblPastilla125(),
                jf.getLblPastilla126(),
                jf.getLblPastilla127(),
                jf.getLblPastilla128(),
                jf.getLblPastilla129(),
                jf.getLblPastilla130(),
                jf.getLblPastilla131(),
                jf.getLblPastilla132(),
                jf.getLblPastilla133(),
                jf.getLblPastilla134(),
                jf.getLblPastilla135(),
                jf.getLblPastilla136(),
                jf.getLblPastilla137(),
                jf.getLblPastilla138(),
                jf.getLblPastilla139(),
                jf.getLblPastilla14(),
                jf.getLblPastilla140(),
                jf.getLblPastilla141(),
                jf.getLblPastilla142(),
                jf.getLblPastilla143(),
                jf.getLblPastilla144(),
                jf.getLblPastilla145(),
                jf.getLblPastilla146(),
                jf.getLblPastilla147(),
                jf.getLblPastilla148(),
                jf.getLblPastilla149(),
                jf.getLblPastilla15(),
                jf.getLblPastilla150(),
                jf.getLblPastilla151(),
                jf.getLblPastilla152(),
                jf.getLblPastilla153(),
                jf.getLblPastilla154(),
                jf.getLblPastilla155(),
                jf.getLblPastilla156(),
                jf.getLblPastilla157(),
                jf.getLblPastilla158(),
                jf.getLblPastilla159(),
                jf.getLblPastilla16(),
                jf.getLblPastilla160(),
                jf.getLblPastilla161(),
                jf.getLblPastilla162(),
                jf.getLblPastilla163(),
                jf.getLblPastilla164(),
                jf.getLblPastilla165(),
                jf.getLblPastilla166(),
                jf.getLblPastilla167(),
                jf.getLblPastilla168(),
                jf.getLblPastilla169(),
                jf.getLblPastilla17(),
                jf.getLblPastilla170(),
                jf.getLblPastilla171(),
                jf.getLblPastilla172(),
                jf.getLblPastilla173(),
                jf.getLblPastilla174(),
                jf.getLblPastilla175(),
                jf.getLblPastilla176(),
                jf.getLblPastilla177(),
                jf.getLblPastilla178(),
                jf.getLblPastilla179(),
                jf.getLblPastilla18(),
                jf.getLblPastilla180(),
                jf.getLblPastilla181(),
                jf.getLblPastilla182(),
                jf.getLblPastilla183(),
                jf.getLblPastilla184(),
                jf.getLblPastilla185(),
                jf.getLblPastilla186(),
                jf.getLblPastilla187(),
                jf.getLblPastilla188(),
                jf.getLblPastilla189(),
                jf.getLblPastilla19(),
                jf.getLblPastilla190(),
                jf.getLblPastilla191(),
                jf.getLblPastilla192(),
                jf.getLblPastilla193(),
                jf.getLblPastilla194(),
                jf.getLblPastilla195(),
                jf.getLblPastilla196(),
                jf.getLblPastilla197(),
                jf.getLblPastilla198(),
                jf.getLblPastilla199(),
                jf.getLblPastilla2(),
                jf.getLblPastilla20(),
                jf.getLblPastilla200(),
                jf.getLblPastilla201(),
                jf.getLblPastilla202(),
                jf.getLblPastilla203(),
                jf.getLblPastilla204(),
                jf.getLblPastilla205(),
                jf.getLblPastilla206(),
                jf.getLblPastilla207(),
                jf.getLblPastilla208(),
                jf.getLblPastilla209(),
                jf.getLblPastilla21(),
                jf.getLblPastilla210(),
                jf.getLblPastilla211(),
                jf.getLblPastilla212(),
                jf.getLblPastilla213(),
                jf.getLblPastilla214(),
                jf.getLblPastilla215(),
                jf.getLblPastilla216(),
                jf.getLblPastilla217(),
                jf.getLblPastilla218(),
                jf.getLblPastilla219(),
                jf.getLblPastilla22(),
                jf.getLblPastilla220(),
                jf.getLblPastilla221(),
                jf.getLblPastilla222(),
                jf.getLblPastilla223(),
                jf.getLblPastilla224(),
                jf.getLblPastilla225(),
                jf.getLblPastilla226(),
                jf.getLblPastilla227(),
                jf.getLblPastilla228(),
                jf.getLblPastilla229(),
                jf.getLblPastilla23(),
                jf.getLblPastilla230(),
                jf.getLblPastilla231(),
                jf.getLblPastilla232(),
                jf.getLblPastilla233(),
                jf.getLblPastilla234(),
                jf.getLblPastilla235(),
                jf.getLblPastilla236(),
                jf.getLblPastilla237(),
                jf.getLblPastilla238(),
                jf.getLblPastilla239(),
                jf.getLblPastilla24(),
                jf.getLblPastilla240(),
                jf.getLblPastilla241(),
                jf.getLblPastilla242(),
                jf.getLblPastilla243(),
                jf.getLblPastilla244(),
                jf.getLblPastilla245(),
                jf.getLblPastilla246(),
                jf.getLblPastilla247(),
                jf.getLblPastilla248(),
                jf.getLblPastilla249(),
                jf.getLblPastilla25(),
                jf.getLblPastilla250(),
                jf.getLblPastilla251(),
                jf.getLblPastilla252(),
                jf.getLblPastilla253(),
                jf.getLblPastilla254(),
                jf.getLblPastilla255(),
                jf.getLblPastilla256(),
                jf.getLblPastilla257(),
                jf.getLblPastilla258(),
                jf.getLblPastilla259(),
                jf.getLblPastilla26(),
                jf.getLblPastilla260(),
                jf.getLblPastilla261(),
                jf.getLblPastilla262(),
                jf.getLblPastilla263(),
                jf.getLblPastilla264(),
                jf.getLblPastilla265(),
                jf.getLblPastilla266(),
                jf.getLblPastilla267(),
                jf.getLblPastilla268(),
                jf.getLblPastilla269(),
                jf.getLblPastilla27(),
                jf.getLblPastilla270(),
                jf.getLblPastilla271(),
                jf.getLblPastilla272(),
                jf.getLblPastilla273(),
                jf.getLblPastilla274(),
                jf.getLblPastilla275(),
                jf.getLblPastilla276(),
                jf.getLblPastilla277(),
                jf.getLblPastilla278(),
                jf.getLblPastilla279(),
                jf.getLblPastilla28(),
                jf.getLblPastilla280(),
                jf.getLblPastilla281(),
                jf.getLblPastilla282(),
                jf.getLblPastilla283(),
                jf.getLblPastilla284(),
                jf.getLblPastilla285(),
                jf.getLblPastilla286(),
                jf.getLblPastilla287(),
                jf.getLblPastilla29(),
                jf.getLblPastilla30(),
                jf.getLblPastilla31(),
                jf.getLblPastilla32(),
                jf.getLblPastilla33(),
                jf.getLblPastilla34(),
                jf.getLblPastilla35(),
                jf.getLblPastilla36(),
                jf.getLblPastilla37(),
                jf.getLblPastilla38(),
                jf.getLblPastilla39(),
                jf.getLblPastilla40(),
                jf.getLblPastilla41(),
                jf.getLblPastilla42(),
                jf.getLblPastilla43(),
                jf.getLblPastilla44(),
                jf.getLblPastilla45(),
                jf.getLblPastilla46(),
                jf.getLblPastilla47(),
                jf.getLblPastilla48(),
                jf.getLblPastilla49(),
                jf.getLblPastilla50(),
                jf.getLblPastilla51(),
                jf.getLblPastilla52(),
                jf.getLblPastilla53(),
                jf.getLblPastilla54(),
                jf.getLblPastilla55(),
                jf.getLblPastilla56(),
                jf.getLblPastilla57(),
                jf.getLblPastilla58(),
                jf.getLblPastilla59(),
                jf.getLblPastilla60(),
                jf.getLblPastilla61(),
                jf.getLblPastilla62(),
                jf.getLblPastilla63(),
                jf.getLblPastilla64(),
                jf.getLblPastilla65(),
                jf.getLblPastilla66(),
                jf.getLblPastilla67(),
                jf.getLblPastilla68(),
                jf.getLblPastilla69(),
                jf.getLblPastilla7(),
                jf.getLblPastilla70(),
                jf.getLblPastilla71(),
                jf.getLblPastilla72(),
                jf.getLblPastilla73(),
                jf.getLblPastilla74(),
                jf.getLblPastilla75(),
                jf.getLblPastilla76(),
                jf.getLblPastilla77(),
                jf.getLblPastilla78(),
                jf.getLblPastilla79(),
                jf.getLblPastilla80(),
                jf.getLblPastilla81(),
                jf.getLblPastilla82(),
                jf.getLblPastilla83(),
                jf.getLblPastilla84(),
                jf.getLblPastilla85(),
                jf.getLblPastilla86(),
                jf.getLblPastilla87(),
                jf.getLblPastilla88(),
                jf.getLblPastilla89(),
                jf.getLblPastilla90(),
                jf.getLblPastilla91(),
                jf.getLblPastilla92(),
                jf.getLblPastilla93(),
                jf.getLblPastilla94(),
                jf.getLblPastilla95(),
                jf.getLblPastilla96(),
                jf.getLblPastilla97(),
                jf.getLblPastilla98(),
                jf.getLblPastilla99()
        );
    }

    public static void metodoPastillaVisualizaTodos(InterfazPacman jf, Object... o) {
        for (Object obj : o) {
            if (obj instanceof JLabel) {
                if (!((JLabel) obj).isVisible()) {
                    ((JLabel) obj).setVisible(true);
                }
            }
        }
    }

    public static void metodoPastillaPuntos(InterfazPacman jf, JLabel pacman, Object... o) {
        for (Object obj : o) {
            if (obj instanceof JLabel) {
                if (topeXY(((JLabel) obj), pacman)) {
                    if (((JLabel) obj).isVisible()) {
                        ((JLabel) obj).setVisible(false);
                        Pacman.noPastillas--;
                        Pacman.puntaje += 20;
                        jf.getLblPuntaje().setText(Pacman.puntaje + " ");
                    }
                }
            }
        }
    }

    /**
     *
     * @param jf
     * @param figura
     * @return
     */
    public static boolean tope(InterfazPacman jf, JLabel figura) {

        return topeXY(jf.getBarrera1(), figura)
                || topeXY(jf.getBarrera2(), figura)
                || topeXY(jf.getBarrera4(), figura)
                || topeXY(jf.getBarrera5(), figura)
                || topeXY(jf.getBarrera6(), figura)
                || topeXY(jf.getBarrera7(), figura)
                || topeXY(jf.getBarrera8(), figura)
                || topeXY(jf.getBarrera9(), figura)
                || topeXY(jf.getBarrera12(), figura)
                || topeXY(jf.getBarrera13(), figura)
                || topeXY(jf.getBarrera14(), figura)
                || topeXY(jf.getBarrera15(), figura)
                || topeXY(jf.getBarrera16(), figura)
                || topeXY(jf.getBarrera17(), figura)
                || topeXY(jf.getBarrera18(), figura)
                || topeXY(jf.getBarrera19(), figura)
                || topeXY(jf.getBarrera20(), figura)
                || topeXY(jf.getBarrera21(), figura)
                || topeXY(jf.getBarrera22(), figura)
                || topeXY(jf.getBarrera23(), figura)
                || topeXY(jf.getBarrera24(), figura)
                || topeXY(jf.getBarrera25(), figura)
                || topeXY(jf.getBarrera26(), figura)
                || topeXY(jf.getBarrera27(), figura)
                || topeXY(jf.getBarrera28(), figura)
                || topeXY(jf.getBarrera29(), figura)
                || topeXY(jf.getBarrera30(), figura)
                || topeXY(jf.getBarrera31(), figura)
                || topeXY(jf.getBarrera32(), figura)
                || topeXY(jf.getBarrera33(), figura)
                || topeXY(jf.getBarrera34(), figura)
                || topeXY(jf.getBarrera35(), figura)
                || topeXY(jf.getBarrera36(), figura)
                || topeXY(jf.getBarrera37(), figura)
                || topeXY(jf.getBarrera38(), figura)
                || topeXY(jf.getBarrera39(), figura)
                || topeXY(jf.getBarrera40(), figura)
                || topeXY(jf.getBarrera41(), figura)
                || topeXY(jf.getBarrera43(), figura)
                || topeXY(jf.getBarrera44(), figura)
                || topeXY(jf.getBarrera45(), figura)
                || topeXY(jf.getBarrera46(), figura)
                || topeXY(jf.getBarrera47(), figura)
                || topeXY(jf.getBarrera48(), figura)
                || topeXY(jf.getBarrera49(), figura)
                || topeXY(jf.getBarrera50(), figura)
                || topeXY(jf.getBarrera51(), figura)
                || topeXY(jf.getBarrera52(), figura)
                || topeXY(jf.getBarrera53(), figura)
                || topeXY(jf.getBarrera54(), figura)
                || topeXY(jf.getBarrera55(), figura)
                || topeXY(jf.getBarrera56(), figura)
                || topeXY(jf.getBarrera57(), figura)
                || topeXY(jf.getBarrera58(), figura)
                || topeXY(jf.getBarrera62(), figura)
                || topeXY(jf.getBarrera63(), figura)
                || topeXY(jf.getBarrera60(), figura)
                || topeXY(jf.getBarrera61(), figura);
    }

    /**
     *
     * @param p
     * @param figura
     * @return
     */
    public static boolean topeXY(JPanel p, JLabel figura) {
        return figura.getX() + figura.getWidth() >= p.getX()
                && p.getX() + p.getWidth() >= figura.getX()
                && figura.getY() + figura.getHeight() >= p.getY()
                && p.getY() + p.getHeight() >= figura.getY();
    }

    /**
     *
     * @param p
     * @param figura
     * @return
     */
    public static boolean topeXY(JLabel p, JLabel figura) {
        return figura.getX() + figura.getWidth() >= p.getX()
                && p.getX() + p.getWidth() >= figura.getX()
                && figura.getY() + figura.getHeight() >= p.getY()
                && p.getY() + p.getHeight() >= figura.getY();
    }

    /**
     *
     * @param pac
     * @param f1
     * @param f2
     * @param f3
     * @param f4
     */
    public static void posicionInicial(JLabel pac, JLabel f1, JLabel f2, JLabel f3, JLabel f4) {
        pac.setBounds(Pacman.XP, Pacman.YP, 25, 25);
        f1.setBounds(470, 231, 25, 25);
        f2.setBounds(430, 291, 25, 25);
        f3.setBounds(470, 291, 25, 25);
        f4.setBounds(520, 291, 25, 25);
        pac.setIcon(new ImageIcon(Pacman.imagen1.getImage().getScaledInstance(pac.getWidth(), pac.getHeight(), 4)));
        f1.setIcon(new ImageIcon(Pacman.imagen15.getImage().getScaledInstance(f1.getWidth(), f1.getHeight(), 4)));
        f2.setIcon(new ImageIcon(Pacman.imagen16.getImage().getScaledInstance(f2.getWidth(), f2.getHeight(), 4)));
        f3.setIcon(new ImageIcon(Pacman.imagen17.getImage().getScaledInstance(f3.getWidth(), f3.getHeight(), 4)));
        f4.setIcon(new ImageIcon(Pacman.imagen18.getImage().getScaledInstance(f4.getWidth(), f4.getHeight(), 4)));
    }

    /**
     *
     * @param ps1
     * @param ps2
     * @param ps3
     * @param ps4
     */
    public static void posicionInicialPastillas(JLabel ps1, JLabel ps2, JLabel ps3, JLabel ps4) {
        ps1.setBounds(920, 470, 30, 30);
        ps2.setBounds(20, 470, 30, 30);
        ps3.setBounds(20, 140, 30, 30);
        ps4.setBounds(920, 140, 30, 30);
        ps1.setVisible(true);
        ps2.setVisible(true);
        ps3.setVisible(true);
        ps4.setVisible(true);
    }

    /**
     *
     * @param fantasmaX
     */
    public static void posicionInicial(JLabel fantasmaX) {
        fantasmaX.setBounds(430, 290, 25, 25);
    }

    /**
     *
     * @param jf
     * @param figura
     */
    public static void quePastilla(InterfazPacman jf, JLabel figura) {
        if (topeXY(jf.getLblPastillaT1(), figura)) {
            jf.getLblPastillaT1().setBounds(0, 0, 0, 0);
            jf.getLblPastillaT1().setVisible(false);
        }
        if (topeXY(jf.getLblPastillaT2(), figura)) {
            jf.getLblPastillaT2().setBounds(0, 0, 0, 0);
            jf.getLblPastillaT2().setVisible(false);
        }
        if (topeXY(jf.getLblPastillaT3(), figura)) {
            jf.getLblPastillaT3().setBounds(0, 0, 0, 0);
            jf.getLblPastillaT3().setVisible(false);
        }
        if (topeXY(jf.getLblPastillaT4(), figura)) {
            jf.getLblPastillaT4().setBounds(0, 0, 0, 0);
            jf.getLblPastillaT4().setVisible(false);
        }
    }

    /**
     *
     * @param fantasmax
     * @param imageI
     */
    public static void queFantasma(JLabel fantasmax, ImageIcon imageI) {
        fantasmax.setIcon(new ImageIcon(imageI.getImage().getScaledInstance(fantasmax.getWidth(), fantasmax.getHeight(), 4)));
    }

    /**
     *
     * @param jf
     * @param eti
     */
    public static void activarPastillas(InterfazPacman jf, JLabel eti) {
        if (Pacman.hF.getState() == Thread.State.TIMED_WAITING) {
            Pacman.hF.stop();
            jf.getBprogressPastilla().setValue(100);
        }
        quePastilla(jf, eti);
        Pacman.tareaPastillas = new HiloFantasmas(0, (JProgressBar) jf.getBprogressPastilla());
        (Pacman.hF = new Thread((Runnable) Pacman.tareaPastillas)).start();
        Pacman.fantasma1.estado = false;
        Pacman.fantasma2.estado = false;
        Pacman.fantasma3.estado = false;
        Pacman.fantasma4.estado = false;
        Pacman.fantasma1.pintarEstado(true, Pacman.fantasma1.b);
        Pacman.fantasma2.pintarEstado(true, Pacman.fantasma2.b);
        Pacman.fantasma3.pintarEstado(true, Pacman.fantasma3.b);
        Pacman.fantasma4.pintarEstado(true, Pacman.fantasma4.b);
    }

    /**
     *
     * @param jf
     */
    public static void nigunaVida(InterfazPacman jf) {

        if (Pacman.puntaje > Pacman.mxpuntaje) {
            Pacman.mxpuntaje = Pacman.puntaje;
        }
        VtnMensaje men = new VtnMensaje("Maximo puntaje " + Pacman.mxpuntaje, Pacman.puntaje);
        men.setVisible(true);
        try {
            if (hT.getState() == Thread.State.TIMED_WAITING) {
                fantasma1.stop();
                fantasma1.join();
                fantasma2.stop();
                fantasma2.join();
                fantasma3.stop();
                fantasma3.join();
                fantasma4.stop();
                fantasma4.join();
                hT.stop();
                hT.join();
                jf.getBprogress().setValue(0);
            }
            if (hF.getState() == Thread.State.TIMED_WAITING) {
                hF.stop();
                hF.join();
                jf.getBprogressPastilla().setValue(0);
            }
        } catch (InterruptedException e) {

        }

        posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());
        posicionInicialPastillas(jf.getLblPastillaT1(), jf.getLblPastillaT2(), jf.getLblPastillaT3(), jf.getLblPastillaT4());

        Manipula.visualizaPatilla(jf);

        Pacman.vidas = 3;
        Pacman.puntaje = 0;
        Pacman.noPastillas = 276;

        jf.getLblVidas().setText("3");
        jf.getLblPuntaje().setText("0");

        jf.getBtnInicio().setEnabled(true);
        jf.getBtnReinicio().setEnabled(false);
        jf.getBtnStop().setEnabled(false);

    }

    /**
     *
     * @param jf
     */
    public static void perderVida(InterfazPacman jf) {
        try {
            if (hT.getState() == Thread.State.TIMED_WAITING) {
                fantasma1.stop();
                fantasma1.join();
                fantasma2.stop();
                fantasma2.join();
                fantasma3.stop();
                fantasma3.join();
                fantasma4.stop();
                fantasma4.join();
                hT.stop();
                hT.join();
                jf.getBprogress().setValue(0);
            }
            if (hF.getState() == Thread.State.TIMED_WAITING) {
                hF.stop();
                hF.join();
                jf.getBprogressPastilla().setValue(0);
            }
        } catch (InterruptedException e) {

        }
        posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());

        Pacman.vidas--;
        VtnMensaje men = new VtnMensaje("Perdiste una vida", Pacman.puntaje);
        men.setVisible(true);
        jf.getBtnInicio().setEnabled(true);
        jf.getBtnReinicio().setEnabled(true);
        jf.getBtnStop().setEnabled(false);
    }

    /**
     *
     * @param jf
     * @param hilo
     */
    public static void tocaFantasma4(InterfazPacman jf, Thread hilo) {
        if (!Pacman.fantasma4.estado) {
            Pacman.puntaje += 100;
            jf.getLblPuntaje().setText(Pacman.puntaje + "");
            Pacman.fantasma4.stop();
            queFantasma(jf.getLblFantasmaAmarillo(), Pacman.imagen18);
            jf.getLblFantasmaAmarillo().setBounds(520, 290, 25, 25);
            (Pacman.fantasma4 = new EsquivaJ(jf.getLblFantasmaAmarillo(), jf, 8)).start();
        } else {
            Pacman.fantasma1.stop();
            Pacman.fantasma2.stop();
            Pacman.fantasma3.stop();
            Pacman.fantasma4.stop();
            Pacman.hT.stop();
            posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());
            queFantasma(jf.getLblPacman(), Pacman.imagen1);
            if (Pacman.vidas == 0) {
                nigunaVida(jf);
            } else {
                perderVida(jf);
            }
            hilo.stop();
        }
    }

    /**
     *
     * @param jf
     * @param hilo
     */
    public static void tocaFantasma2(InterfazPacman jf, Thread hilo) {
        if (!Pacman.fantasma2.estado) {
            Pacman.puntaje += 100;
            jf.getLblPuntaje().setText(Pacman.puntaje + "");
            Pacman.fantasma2.stop();
            queFantasma(jf.getLblFantasmaAzul(), Pacman.imagen16);
            jf.getLblFantasmaAzul().setBounds(430, 290, 25, 25);
            (Pacman.fantasma2 = new EsquivaJ(jf.getLblFantasmaAzul(), jf, 6)).start();
        } else {
            Pacman.fantasma1.stop();
            Pacman.fantasma2.stop();
            Pacman.fantasma3.stop();
            Pacman.fantasma4.stop();
            Pacman.hT.stop();
            posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());
            queFantasma(jf.getLblPacman(), Pacman.imagen1);
            if (Pacman.vidas == 0) {
                nigunaVida(jf);
            } else {
                perderVida(jf);
            }
            hilo.stop();
        }
    }

    /**
     *
     * @param jf
     * @param hilo
     */
    public static void tocaFantasma1(InterfazPacman jf, Thread hilo) {
        if (!Pacman.fantasma1.estado) {
            Pacman.puntaje += 100;
            jf.getLblPuntaje().setText(Pacman.puntaje + "");
            Pacman.fantasma1.stop();
            queFantasma(jf.getLblFantasmaRojo(), Pacman.imagen15);
            jf.getLblFantasmaRojo().setBounds(470, 230, 25, 25);
            (Pacman.fantasma1 = new EsquivaJ(jf.getLblFantasmaRojo(), jf, 5)).start();
        } else {
            Pacman.fantasma1.stop();
            Pacman.fantasma2.stop();
            Pacman.fantasma3.stop();
            Pacman.fantasma4.stop();
            Pacman.hT.stop();
            posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());
            queFantasma(jf.getLblPacman(), Pacman.imagen1);
            if (Pacman.vidas == 0) {
                nigunaVida(jf);
            } else {
                perderVida(jf);
            }
            hilo.stop();
        }
    }

    /**
     *
     * @param jf
     * @param hilo
     */
    public static void tocaFantasma3(InterfazPacman jf, Thread hilo) {
        if (!Pacman.fantasma3.estado) {
            Pacman.puntaje += 100;
            jf.getLblPuntaje().setText(Pacman.puntaje + "");
            Pacman.fantasma3.stop();
            queFantasma(jf.getLblFnatasmaNaranja(), Pacman.imagen17);
            jf.getLblFnatasmaNaranja().setBounds(470, 290, 25, 25);
            (Pacman.fantasma3 = new EsquivaJ(jf.getLblFnatasmaNaranja(), jf, 7)).start();
        } else {
            Pacman.fantasma1.stop();
            Pacman.fantasma2.stop();
            Pacman.fantasma3.stop();
            Pacman.fantasma4.stop();
            Pacman.hT.stop();
            posicionInicial(jf.getLblPacman(), jf.getLblFantasmaRojo(), jf.getLblFantasmaAzul(), jf.getLblFnatasmaNaranja(), jf.getLblFantasmaAmarillo());
            queFantasma(jf.getLblPacman(), Pacman.imagen1);
            if (Pacman.vidas == 0) {
                nigunaVida(jf);
            } else {
                perderVida(jf);
            }
            hilo.stop();
        }
    }
}
