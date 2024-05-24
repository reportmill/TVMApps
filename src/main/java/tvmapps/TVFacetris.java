package tvmapps;
import snapdemos.facetris.FacetrisApp;

public class TVFacetris {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();
        FacetrisApp game = new FacetrisApp();
        game.getWindow().setMaximized(true);
        game.setWindowVisible(true);
    }
}
