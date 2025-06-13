package tvmapps;
//import comics.player.PlayerPane;
import org.teavm.jso.JSBody;
import snap.util.ArrayUtils;
import snap.view.ViewUtils;
import snap.view.WindowView;

/**
 * This is the main class for ComicScript web, which provides for showing the player in existing HTML divs.
 */
public class TVComicScript {

    // The current Player
    //private static PlayerPane  _player;

    // All Players on page
    //private static PlayerPane[]  _players = new PlayerPane[20];

    /**
     * Standard main implementation.
     */
    public static void main(String[] args)
    {
        // Activate TeaVM adapter
        snaptea.TV.set();

        // Run mainLater on app thread
        ViewUtils.runLater(() -> mainLater(args));
    }

    /**
     * Standard main implementation.
     */
    public static void mainLater(String[] args)
    {
        // Get args ('CSMainArg0', 'CSMainArg1') as provided in the HTML java script
        String arg0 = getMainArg0();
        String arg1 = getMainArg1();

        // If no arg0, just show app and return
        if (arg0 == null) {
            //comics.app.App.main(args);
            return;
        }

        // If 'showEditor' arg, showEditor
        if(arg0 != null && arg0.equals("showEditor"))
            showEditor(arg1);

        // Otherwise show
        else showPlayerInHTMLElementForName(arg0);
    }

    /**
     * Shows a comic in given container for given params.
     */
    public static void showPlayerInHTMLElementForName(String anEmtId)
    {
        // Create new Player and add to Players
        //_player = new PlayerPane();
        //_players = ArrayUtils.add(_players, _player);

        // If name provided, set as Window.Name, which will cause window to use named Div element
        if(anEmtId != null && anEmtId.length() > 0) {
            //WindowView playerWin = _player.getWindow();
            //playerWin.setName(anEmtId);
        }

        // Otherwise just showEditor
        else {
            //_player.getUI();
            //_player.setEditing(true);
        }

        // Show Player
        //_player.showPlayer();
    }

    /**
     * Shows the editor for Player with given name (or last one, if null)
     */
    public static void showEditor(String anEmtId)
    {
        // If ElementId provided, toggle editing for player with for that element id
        if(anEmtId != null) {

            // Iterate over players and toggle editing for provided element id
            //for(PlayerPane player : _players) {
            //    String playerWindowName = player.getWindow().getName();
            //    if(anEmtId.equals(playerWindowName))
            //        player.setEditing(!player.isEditing());
            //}
        }

        // If no element id, toggle Player.Editing for last player
        //else if(_player != null)
        //    _player.setEditing(!_player.isEditing());
    }

    // Returns app main arg defined as global 'CSMainArg0'
    @JSBody(params = { }, script = "return typeof CSMainArg0 !== 'undefined' ? CSMainArg0 : null;")
    public static native String getMainArg0();

    // Returns app main arg defined as global 'CSMainArg1'
    @JSBody(params = { }, script = "return typeof CSMainArg1 !== 'undefined' ? CSMainArg1 : null;")
    public static native String getMainArg1();
}
