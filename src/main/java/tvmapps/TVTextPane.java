package tvmapps;
import snap.viewx.TextPane;

public class TVTextPane {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();

        TextPane tp = new TextPane();
        tp.getWindow().setMaximized(true);
        tp.getTextArea().setText("Why is the world in love again???");
        tp.setWindowVisible(true);
    }
}
