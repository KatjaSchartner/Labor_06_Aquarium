import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Rotfisch extends AbstractFisch{

    public Rotfisch(int posX, int posY) {
        super(posX, posY);
    }
    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.RED);
        ec.fillPolygon(posX-5,posY+5, posX+5, posY, posX-5, posY-5);
    }
}
