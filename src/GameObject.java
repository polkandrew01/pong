public class GameObject {
    private String name;
    private float x;
    private float y;

    public GameObject() {
	this.name = "NewGameObject";
	this.x = 0f;
	this.y = 0f;
    }
    
    public GameObject(String name) {
	this.name = name;
	this.x = 0f;
	this.y = 0f;
    }

    public GameObject(String name, int x, int y) {
	this.name = name;
	this.x = x;
	this.y = y;
    }

    public String getName() { return this.name; }
    public float getX() { return this.x; }
    public float getY() { return this.y; }
    
    public GameObject setName(String name) {
	this.name = name;
	return this;
    }
    
    public GameObject setX(float x) {
	this.x = x;
	return this;
    }

    public GameObject setY(float y) {
	this.y = y;
	return this;
    }
    
}
