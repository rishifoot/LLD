package visitordesignpattern;

public abstract class Visitor {
	abstract void visit(Circle c);
	abstract void visit(Triangle tr);
	abstract void visit(Rectangle re);

}
