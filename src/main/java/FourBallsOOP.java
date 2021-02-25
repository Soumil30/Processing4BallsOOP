import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOOP extends PApplet {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 20;
    public static final float FRACTION = 0.2f;
    ArrayList<Ball> balls = new ArrayList<>();

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
        for (int ball = 1; ball <= 4; ball++) {
            balls.add(new Ball(this, getHeight(ball), ball, DIAMETER));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.drawCircle();
        }
    }

    private float getHeight(int ball) {
        return ball * HEIGHT * FRACTION;
    }
}
