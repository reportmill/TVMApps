package tvmapps;
import rmdraw.app.Welcome;

/**
 * Entry point class for RMDraw.
 */
public class TVRMDraw {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();

        Welcome.getShared().runWelcome();
    }
}
