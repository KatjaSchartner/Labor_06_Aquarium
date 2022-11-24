import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Gelbfisch extends AbstractFisch{
    public Gelbfisch(int posX, int posY) {
        super(posX, posY);
    }

    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.YELLOW);
        ec.fillPolygon(posX-5,posY+5, posX+5, posY, posX-5, posY-5);

    }
}
