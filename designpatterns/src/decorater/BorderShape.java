package decorater;

public class BorderShape extends ShapeDecorater{

	public BorderShape(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.println("with border");
		super.draw();
	}

}
