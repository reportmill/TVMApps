package tvmapps;

import snap.viewx.TextPane;
import snaptea.BusyBox;

public class TVBusyBox {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();
        BusyBox bb = new BusyBox();
        bb.getWindow().setMaximized(true);
        bb.setWindowVisible(true);
    }
}
