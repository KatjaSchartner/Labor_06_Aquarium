import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Blaufisch extends AbstractFisch{
    public Blaufisch(int posX, int posY) {
        super(posX, posY);
    }
    @Override
    public void bewege(){
        posX -= 1;
    }
    public void zeichne(EasyCanvas ec) {


        ec.setColor(Color.BLUE);

        ec.fillPolygon(posX-5,posY+5, posX-5, posY-5, posX-15, posY);
        ec.setColor(Color.WHITE);
        ec.fillCircle(posX-6,posY,1);
    }
}
