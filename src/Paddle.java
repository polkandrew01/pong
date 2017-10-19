import java.awt.Color;

public class Paddle extends GameObject {
    public static int acceleration = 1;

    private float velocity;
    private Color color;

    public Paddle() {
	this.velocity = 0f;
	this.color = Color.black;
    }

    public Paddle(float velocity, Color color) {
	this.velocity = velocity;
	this.color = color;
    }
    
    public float getVelocity() { return this.velocity; }
    public Color getColor() { return this.color; }

    public Paddle setColor(Color color) {
	this.color = color;
	return this;
    }
    public Paddle setVelocity(float velocity) {
	this.velocity = velocity;
	return this;
    }
}
