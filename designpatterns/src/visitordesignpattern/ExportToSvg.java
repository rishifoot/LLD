package visitordesignpattern;

public class ExportToSvg extends Visitor {

	@Override
	void visit(Circle c) {
		System.out.println("Export circle to svg");	
	}

	@Override
	void visit(Triangle tr) {
		System.out.println("Export triangle to svg");	
	}

	@Override
	void visit(Rectangle re) {
		System.out.println("Export rectangle to svg");	
	}

}
