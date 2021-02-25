public class Ball {

    private final FourBallsOOP SKETCH;
    private final float HEIGHT;
    private final int SPEED;
    private final int DIAMETER;
    private int currentX;

    public Ball(FourBallsOOP sketch, float height, int speed, int diameter) {
        HEIGHT = height;
        SPEED = speed;
        DIAMETER = diameter;
        SKETCH = sketch;
        currentX = 0;
    }


    public void drawCircle() {
        SKETCH.ellipse(currentX, HEIGHT, DIAMETER, DIAMETER);
        currentX += SPEED;
    }
}
