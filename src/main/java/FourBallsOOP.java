import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOOP extends PApplet {

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int DIAMETER = 20;
    private static final float FRACTION = 0.2f;
    private final ArrayList<Ball> BALLS = new ArrayList<>();
    final int NUMBER_OF_BALLS = 4;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ball = 1; ball <= NUMBER_OF_BALLS; ball++) {
            BALLS.add(new Ball(this, getHeight(ball), ball, DIAMETER));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : BALLS) {
            ball.drawCircle();
        }
    }

    private float getHeight(int ball) {
        return ball * HEIGHT * FRACTION;
    }
}
