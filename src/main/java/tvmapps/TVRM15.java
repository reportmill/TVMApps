package tvmapps;
import com.reportmill.app.WelcomePanel;
import com.reportmill.base.ReportMill;
import snap.util.Prefs;

/**
 * Entry point class for RMDraw.
 */
public class TVRM15 {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();

        ReportMill.isApp = true;
        Prefs prefs = Prefs.getPrefsForName("/com/reportmill");
        Prefs.setDefaultPrefs(prefs);
        WelcomePanel.getShared().showPanel();
    }
}
