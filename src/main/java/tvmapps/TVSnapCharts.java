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


    @JSBody(params = { }, script = "return rmChartsMainArg0;")
    public static native String getMainArg0();

    @JSBody(params = { }, script = "return rmChartsMainArg1;")
    public static native String getMainArg1();
}
