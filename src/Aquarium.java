import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private EasyCanvas ec;
    private int breite;
    private int hoehe;
    private List<IFisch> fische;

    public Aquarium(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.ec = new EasyCanvas(this.breite, this.hoehe);
        ec.show();
        fische = new ArrayList<>();
    }

    public void addFisch(IFisch fisch) {
        fische.add(fisch);
    }

    public void zeichne() {
        ec.clear();
        for (IFisch fisch : fische) {

            fisch.zeichne(ec);
        }
    }

    public void bewege() {
        for (IFisch fisch : fische) {
            if(fisch.getPosX() == this.breite+20){
                fisch.setPosX(-10);
            }else if(fisch.getPosX() == -20){
                fisch.setPosX(this.breite+10);
            }
            fisch.bewege();
        }
    }
}


