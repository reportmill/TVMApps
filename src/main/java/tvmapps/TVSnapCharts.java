package tvmapps;

import org.teavm.jso.JSBody;
import snapcharts.app.App;

public class TVSnapCharts {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        // Get args
        String arg0 = getMainArg0();
        String arg1 = getMainArg1();
        if (arg0!=null && arg0.equals("fetch") && arg1!=null) {
            args = new String[]{arg0, arg1};
            System.out.println("App.main: Fetching: " + arg1);
        }

        snaptea.TV.set();
        App.main(args);
    }


    @JSBody(params = { }, script = "return typeof rmChartsMainArg0 !== 'undefined' ? rmChartsMainArg0 : null;")
    public static native String getMainArg0();

    @JSBody(params = { }, script = "return typeof rmChartsMainArg1 !== 'undefined' ? rmChartsMainArg1 : null;")
    public static native String getMainArg1();
}
