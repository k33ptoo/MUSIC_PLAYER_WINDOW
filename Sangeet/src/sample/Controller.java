package sample;

import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;

public class Controller {

    /*
    public int xy;
    public int xx;
     */

 public void closeButton()
 {
     System.exit(0);
 }

 public void anPane(){
     Bounds bounds = AnchorPane.getBoundsInLocal();
     Bounds screenBounds = AnchorPane.localToScreen(bounds);
     int x = (int) screenBounds.getMinX();
     int y = (int) screenBounds.getMinY();
     int width = (int) screenBounds.getWidth();
     int height = (int) screenBounds.getHeight();
     

}

}
