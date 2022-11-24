import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class SlowFisch implements IFisch {
    private double posX;
    private double posY;

    public SlowFisch(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int getPosX() {
        return (int) posX;
    }

    @Override
    public int getPosY() {
        return (int) posY;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public void bewege() {
        this.posX += 0.4;
    }
    @Override
   public void zeichne(EasyCanvas ec){
        ec.setColor(Color.CYAN);
        ec.fillPolygon((int)posX-4,(int)posY+4,(int) posX+4, (int)posY, (int)posX-4, (int)posY-4);
    }
}
