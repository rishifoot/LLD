package visitordesignpattern;

public class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a triangle");
		
	}

	@Override
	void accept(Visitor v) {
		v.visit(this);
		
	}

}
