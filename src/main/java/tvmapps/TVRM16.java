package tvmapps;
import com.reportmill.app.WelcomePanel;
import com.reportmill.base.ReportMill;
import snap.util.Prefs;
import snap.view.ViewTheme;

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
        Prefs prefs = Prefs.getPrefsForName("/com/reportmill");
        Prefs.setDefaultPrefs(prefs);
        ViewTheme.setThemeForName("Light");
        WelcomePanel.getShared().showPanel();
    }
}
