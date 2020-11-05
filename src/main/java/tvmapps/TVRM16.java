package tvmapps;
import reportmill.app.Welcome;
import reportmill.util.ReportMill;

/**
 * Entry point class for RMDraw.
 */
public class TVRM16 {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();

        ReportMill.isApp = true;
        Welcome.getShared().runWelcome();
    }
}
