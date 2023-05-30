package visitordesignpattern;

public abstract class Shape {
	abstract void draw();
	abstract void accept(Visitor v);

}
