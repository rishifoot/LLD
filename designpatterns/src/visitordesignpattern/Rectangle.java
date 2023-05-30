package visitordesignpattern;

public class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a rectangle");	
	}

	@Override
	void accept(Visitor v) {
	v.visit(this);
		
	}

}
