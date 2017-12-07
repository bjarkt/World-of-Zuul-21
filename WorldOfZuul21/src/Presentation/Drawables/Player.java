package Presentation.Drawables;

import Acq.ILocation;
import javafx.scene.paint.Color;

public class Player extends Drawable {
    public Player(ILocation location) {
        super(location);
        this.color = Color.GREEN;
        super.rectangle.setFill(this.color);
    }
}
