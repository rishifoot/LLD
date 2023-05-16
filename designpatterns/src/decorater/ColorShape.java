package decorater;

public class ColorShape extends ShapeDecorater{

	public ColorShape(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.println("with color");
		super.draw();
	}

}
