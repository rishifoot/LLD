package visitordesignpattern;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a circle");
		
	}

	@Override
	void accept(Visitor v) {
		v.visit(this);
		
	}

}
