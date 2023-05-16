package decorater;

public abstract class ShapeDecorater implements Shape {
	private Shape shape;
	public ShapeDecorater(Shape shape) {
		this.shape=shape;
	}
	public void draw() {
		shape.draw();
	}

}
