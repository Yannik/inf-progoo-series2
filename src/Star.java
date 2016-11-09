import acm.program.*;
import acm.graphics.*;

public class Star extends GraphicsProgram {

    public void run() {
        int points = readInt("Points: ");
        int outerRadius = readInt("Point radius: ");
        int innerRadius = readInt("Inner radius: ");

        double totalDegrees = 360;
        double degreesPerSide = totalDegrees / points;
        for (int point = 0; point < points; point++) {
            double startDegree = degreesPerSide * point;
            double midDegree = degreesPerSide * point + degreesPerSide / 2;
            double endDegree = degreesPerSide * (point + 1);
            int xOffset = 150;
            int yOffset = 150;
            // use "/180*Math.PI" because Math.cos/Math.sin requires "radians" instead of degrees
            double x0 = Math.cos(startDegree / 180 * Math.PI) * innerRadius + xOffset;
            double y0 = Math.sin(startDegree / 180 * Math.PI) * innerRadius + yOffset;
            double x1 = Math.cos(midDegree / 180 * Math.PI) * outerRadius + xOffset;
            double y1 = Math.sin(midDegree / 180 * Math.PI) * outerRadius + yOffset;
            double x2 = Math.cos(endDegree / 180 * Math.PI) * innerRadius + xOffset;
            double y2 = Math.sin(endDegree / 180 * Math.PI) * innerRadius + yOffset;
            add(new GLine(x0, y0, x1, y1));
            add(new GLine(x1, y1, x2, y2));

        }
    }
}
