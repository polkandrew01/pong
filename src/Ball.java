public class Ball extends GameObject {

    private boolean movingRight;
    private float vert_velocity;
    private float horz_velocity;

    public Ball() {
	this.movingRight = true;
	this.vert_velocity = 0f;
	this.horz_velocity = 0f;
    }

    public Ball(boolean movingRight, float vert_velocity, float horz_velocity) {
	this.movingRight = movingRight;
	this.vert_velocity = vert_velocity;
	this.horz_velocity = horz_velocity;
    }

    public boolean isMovingRight() { return this.movingRight; }
    public float getVert_Velocity() { return this.vert_velocity; }
    public float getHorz_Velocity() { return this.horz_velocity; }

    public Ball setMovingRight(boolean movingRight) {
	this.movingRight = movingRight;
	return this;
    }
    public Ball setVert_Velocity(float par1) {
	this.vert_velocity = par1;
	return this;
    }
    public Ball setHorz_Velocity(float par1) {
	this.horz_velocity = par1;
	return this;
    }
}
