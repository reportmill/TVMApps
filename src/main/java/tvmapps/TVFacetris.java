package tvmapps;
import snapdemos.facetris.Facetris;

public class TVFacetris {

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        snaptea.TV.set();
        Facetris game = new Facetris();
        game.getWindow().setMaximized(true);
        game.setWindowVisible(true);
    }
}
