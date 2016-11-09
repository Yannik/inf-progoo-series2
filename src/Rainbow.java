import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class Rainbow extends GraphicsProgram {
    public void run() {
        Color backgroundColor = new Color(157, 217, 237);

        // add background
        GRect background = new GRect(50, 50, 300, 200);
        background.setFilled(true);
        background.setColor(backgroundColor);
        add(background);

        int count = 0;
        Color[] rainbowColors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, backgroundColor};
        // iterate from the outer most color to the innermost, partly overwriting the previous arc
        // finally fill the remaining space with the background color.
        for (Color rainbowColor: rainbowColors) {
            GArc rainbowPart = new GArc(60+count*10, 60+count*10, 250-count*20, 250-count*20, 0, 180);
            rainbowPart.setFilled(true);
            rainbowPart.setColor(rainbowColor);
            add(rainbowPart);
            count++;
        }
    }
}
