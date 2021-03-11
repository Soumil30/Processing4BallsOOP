import processing.core.PApplet;

public class Ball {

    private final float HEIGHT;
    private final int SPEED;
    private final int DIAMETER;
    private int currentX;

    public Ball(float height, int speed, int diameter) {
        HEIGHT = height;
        SPEED = speed;
        DIAMETER = diameter;
        currentX = 0;
    }


    public void draw(PApplet sketch) {
        sketch.ellipse(currentX, HEIGHT, DIAMETER, DIAMETER);
    }

    public void move() {
        currentX += SPEED;
    }
}