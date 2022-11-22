import de.hsulm.sote2.ecanvas.EasyCanvas;

public abstract class AbstractFisch implements IFisch {
    int posX;
    int posY;

    public AbstractFisch(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }
    @Override
     public void bewege(){
        this.posX += 1;
    }


    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    public abstract void zeichne(EasyCanvas ec);

}
