import de.hsulm.sote2.ecanvas.EasyCanvas;

public interface IFisch {
    void bewege();

    int getPosX();

    int getPosY();

    void setPosX(int x);

    void setPosY(int y);

    void zeichne(EasyCanvas ec);

}
